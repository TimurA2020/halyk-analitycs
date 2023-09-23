package com.halykhackathon.halykanalitycs.core.models;

import com.halykhackathon.halykanalitycs.core.categories.HalykCategory;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
public class HalykPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateOfPayment;

    private BigDecimal amount;

    private HalykCategory category;

    private String recipient;
}
