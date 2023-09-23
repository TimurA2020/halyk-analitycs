package com.halykhackathon.halykanalitycs.core.models;

import com.halykhackathon.halykanalitycs.core.categories.HalykCategory;
import jakarta.persistence.*;
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

    @Enumerated(EnumType.STRING)
    private HalykCategory category;

    private String recipient;
}
