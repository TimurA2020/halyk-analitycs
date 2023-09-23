package com.halykhackathon.halykanalitycs.core.services;

import com.halykhackathon.halykanalitycs.core.models.OnlinebankPayment;
import com.halykhackathon.halykanalitycs.core.repositories.OnlinebankRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OnlinebankService {

    private final OnlinebankRepository onlinebankRepository;

    public OnlinebankPayment getOnlinebankPayment(Long id) {
        return onlinebankRepository.findById(id).orElseThrow();
    }

    public List<OnlinebankPayment> getAllOnlinebankPayments() {
        return onlinebankRepository.findAll();
    }
}
