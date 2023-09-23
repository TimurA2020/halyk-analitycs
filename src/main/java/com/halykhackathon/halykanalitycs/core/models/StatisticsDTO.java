package com.halykhackathon.halykanalitycs.core.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Getter
@Setter
public class StatisticsDTO {
    String type;
    Double percent;
    int numberOfTransactios;
    Long amount;
    Long averageCheck;
    String formatCurrency;
}
