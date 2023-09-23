package com.halykhackathon.halykanalitycs.core.services;

import com.halykhackathon.halykanalitycs.core.categories.HalykCategory;
import com.halykhackathon.halykanalitycs.core.categories.OnlinebankCategory;
import com.halykhackathon.halykanalitycs.core.models.OnlinebankPayment;
import com.halykhackathon.halykanalitycs.core.models.StatisticsDTO;
import com.halykhackathon.halykanalitycs.core.repositories.OnlinebankRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<OnlinebankPayment> getOnlinebankPaymentsByCategory(OnlinebankCategory category) {return OnlinebankRepository.findAllByCategory(category);}

    public List<OnlinebankPayment> getPaymentsForThisMonth() {
        return OnlinebankRepository.findPaymentsForCurrentMonth();
    }

    public List<OnlinebankPayment> getPaymentsForThisMonthByCategory(OnlinebankCategory category) {
        return OnlinebankRepository.findPaymentsForCurrentMonthByCategory(category);
    }

    public List<StatisticsDTO> getStatistics() {
        List<StatisticsDTO> list = new ArrayList<>();
        List<OnlinebankPayment> allList = getAllOnlinebankPayments();
        Long allSum = 0L;

        for (OnlinebankPayment payment : allList) {
            allSum += payment.getAmount();
        }

        for (OnlinebankCategory category : OnlinebankCategory.values()){
            StatisticsDTO dto = new StatisticsDTO();
            List<OnlinebankPayment> rawList = getOnlinebankPaymentsByCategory(category);

            dto.setType(category.toString());
            dto.setAmount(rawList.stream().mapToLong(OnlinebankPayment::getAmount).sum());
            dto.setAverageCheck(allSum/dto.getAmount());
            dto.setPercent((((double)dto.getAmount()/allSum)*100));
            dto.setNumberOfTransactios(rawList.size());
            dto.setFormatCurrency("KZT");

            list.add(dto);
        }
        return list;
    }
}
