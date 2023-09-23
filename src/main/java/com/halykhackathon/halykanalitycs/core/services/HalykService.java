package com.halykhackathon.halykanalitycs.core.services;

import com.halykhackathon.halykanalitycs.core.categories.HalykCategory;
import com.halykhackathon.halykanalitycs.core.models.HalykPayment;
import com.halykhackathon.halykanalitycs.core.models.OnlinebankPayment;
import com.halykhackathon.halykanalitycs.core.repositories.HalykRepository;
import com.halykhackathon.halykanalitycs.core.repositories.OnlinebankRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HalykService {

    private final HalykRepository halykRepository;

    public HalykPayment getHalykPayment(Long id) {
        return halykRepository.findById(id).orElseThrow();
    }

    public List<HalykPayment> getAllHalykPayments() {
        return halykRepository.findAll();
    }

    public List<HalykPayment> getPaymentsForThisMonth() {
        return halykRepository.findPaymentsForCurrentMonth();
    }

    public List<HalykPayment> getPaymentsForThisMonthByCategory(HalykCategory category) {
        return halykRepository.findPaymentsForCurrentMonthByCategory(category);
    }

//    public HashMap<HalykCategory, Integer> getCategoriesPercentages() {
//        HashMap<HalykCategory, Integer> map = new HashMap<>();
//        List<HalykCategory> categories = List.of(HalykCategory.LEISURE, HalykCategory.ECOMMERCE, HalykCategory.FOOD, HalykCategory.OTHER);
//
//        for (HalykCategory cat : categories) {
//
//        }
//    }
}
