package com.halykhackathon.halykanalitycs.core.repositories;

import com.halykhackathon.halykanalitycs.core.models.HalykPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HalykRepository extends JpaRepository<HalykPayment, Long> {
}
