package com.halykhackathon.halykanalitycs.core.repositories;

import com.halykhackathon.halykanalitycs.core.categories.HalykCategory;
import com.halykhackathon.halykanalitycs.core.models.HalykPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface HalykRepository extends JpaRepository<HalykPayment, Long> {

    @Query("select sum(hp.amount) from HalykPayment hp where hp.category = :category")
    BigDecimal getSumByCategory(HalykCategory category);

    @Query("SELECT p FROM HalykPayment p WHERE YEAR(p.dateOfPayment) = YEAR(CURRENT_DATE) AND MONTH(p.dateOfPayment) = MONTH(CURRENT_DATE)")
    List<HalykPayment> findPaymentsForCurrentMonth();

    @Query("SELECT p FROM HalykPayment p WHERE YEAR(p.dateOfPayment) = YEAR(CURRENT_DATE) " +
            "AND MONTH(p.dateOfPayment) = MONTH(CURRENT_DATE) " +
            "AND p.category = :category")
    List<HalykPayment> findPaymentsForCurrentMonthByCategory(HalykCategory category);
}
