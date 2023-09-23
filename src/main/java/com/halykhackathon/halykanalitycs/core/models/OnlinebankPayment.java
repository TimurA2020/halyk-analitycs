package com.halykhackathon.halykanalitycs.core.models;

import com.halykhackathon.halykanalitycs.core.categories.OnlinebankCategory;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    private OnlinebankCategory category;

    private String recipient;
}
