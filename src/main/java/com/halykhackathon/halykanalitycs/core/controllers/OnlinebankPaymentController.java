package com.halykhackathon.halykanalitycs.core.controllers;

import com.halykhackathon.halykanalitycs.core.categories.HalykCategory;
import com.halykhackathon.halykanalitycs.core.categories.OnlinebankCategory;
import com.halykhackathon.halykanalitycs.core.models.HalykPayment;
import com.halykhackathon.halykanalitycs.core.models.OnlinebankPayment;
import com.halykhackathon.halykanalitycs.core.models.StatisticsDTO;
import com.halykhackathon.halykanalitycs.core.services.HalykService;
import com.halykhackathon.halykanalitycs.core.services.OnlinebankService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/onlinebank-payment")
@RequiredArgsConstructor
public class OnlinebankPaymentController {

    private final OnlinebankService OnlinebankService;

    @RequestMapping(value = "/get-payment-by-id", method = RequestMethod.GET)
    public ResponseEntity<OnlinebankPayment> getHalykPaymentById(@RequestParam Long id) {
        return new ResponseEntity<>(OnlinebankService.getOnlinebankPayment(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/get-all-payments", method = RequestMethod.GET)
    public ResponseEntity<List<OnlinebankPayment>> getAllOnlineBankPayments() {
        return new ResponseEntity<>(OnlinebankService.getAllOnlinebankPayments(), HttpStatus.OK);
    }

    @GetMapping("/get-payments-this-month")
    public ResponseEntity<List<OnlinebankPayment>> getPaymentsForThisMonth() {
        return new ResponseEntity<>(OnlinebankService.getPaymentsForThisMonth(), HttpStatus.OK);
    }

    @GetMapping("/get-statistics")
    public ResponseEntity<List<StatisticsDTO>> getStatistics() {
        return new ResponseEntity<>(OnlinebankService.getStatistics(), HttpStatus.OK);
    }

    @GetMapping("/get-payments-this-month-by-category")
    public ResponseEntity<List<OnlinebankPayment>> getPaymentsForThisMonthByCategory(@RequestParam String category) {
        return new ResponseEntity<>(OnlinebankService.getPaymentsForThisMonthByCategory(OnlinebankCategory.valueOf(category)), HttpStatus.OK);
    }
}
