package com.halykhackathon.halykanalitycs.core.repositories;

import com.halykhackathon.halykanalitycs.core.categories.HalykCategory;
import com.halykhackathon.halykanalitycs.core.models.HalykPayment;
import com.halykhackathon.halykanalitycs.core.models.OnlinebankPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OnlinebankRepository extends JpaRepository<OnlinebankPayment, Long> {

    @Query("select sum(op.amount) from OnlinebankPayment op where op.category = :category")
    BigDecimal getSumByCategory(HalykCategory category);

    @Query("SELECT p FROM OnlinebankPayment p WHERE YEAR(p.dateOfPayment) = YEAR(CURRENT_DATE) AND MONTH(p.dateOfPayment) = MONTH(CURRENT_DATE)")
    List<HalykPayment> findPaymentsForCurrentMonth();
}
