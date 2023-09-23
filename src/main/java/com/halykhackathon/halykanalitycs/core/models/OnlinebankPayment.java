package com.halykhackathon.halykanalitycs.core.models;

import com.halykhackathon.halykanalitycs.core.categories.OnlinebankCategory;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class OnlinebankPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateOfPayment;

    private Long amount;

    @Enumerated(EnumType.STRING)
    private OnlinebankCategory category;

    private String recipient;
}
