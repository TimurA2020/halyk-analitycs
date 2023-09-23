package com.halykhackathon.halykanalitycs.core.repositories;

import com.halykhackathon.halykanalitycs.core.models.OnlinebankPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlinebankRepository extends JpaRepository<OnlinebankPayment, Long> {
}
