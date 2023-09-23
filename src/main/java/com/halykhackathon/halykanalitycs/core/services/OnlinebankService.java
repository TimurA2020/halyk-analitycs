package com.halykhackathon.halykanalitycs.core.services;

import com.halykhackathon.halykanalitycs.core.categories.HalykCategory;
import com.halykhackathon.halykanalitycs.core.models.OnlinebankPayment;
import com.halykhackathon.halykanalitycs.core.repositories.OnlinebankRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OnlinebankService {

    private final OnlinebankRepository OnlinebankRepository;

    public OnlinebankPayment getOnlinebankPayment(Long id) {
        return OnlinebankRepository.findById(id).orElseThrow();
    }

    public List<OnlinebankPayment> getAllOnlinebankPayments() {
        return OnlinebankRepository.findAll();
    }

    public List<OnlinebankPayment> getPaymentsForThisMonth() {
        return OnlinebankRepository.findPaymentsForCurrentMonth();
    }

    public List<OnlinebankPayment> getPaymentsForThisMonthByCategory(HalykCategory category) {
        return OnlinebankRepository.findPaymentsForCurrentMonthByCategory(category);
    }
}
