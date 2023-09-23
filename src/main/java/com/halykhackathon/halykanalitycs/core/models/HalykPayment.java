package com.halykhackathon.halykanalitycs.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class HalykPayment {
    @Id
    private Long id;

    private Date dateOfPayment;

    private Long amount;

    private String category;

}
