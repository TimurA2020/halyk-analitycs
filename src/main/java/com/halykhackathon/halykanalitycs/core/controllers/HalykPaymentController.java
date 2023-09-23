package com.halykhackathon.halykanalitycs.core.controllers;


import com.halykhackathon.halykanalitycs.core.categories.HalykCategory;
import com.halykhackathon.halykanalitycs.core.models.HalykPayment;
import com.halykhackathon.halykanalitycs.core.services.HalykService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/halyk-payment")
@RequiredArgsConstructor
public class HalykPaymentController {

    private final HalykService halykService;

    @RequestMapping(value = "/get-payment-by-id", method = RequestMethod.GET)
    public ResponseEntity<String> getHalykPaymentById() {
        return new ResponseEntity<String>("123", HttpStatus.OK);
    }

    @GetMapping("/get-payments-this-month")
    public ResponseEntity<List<HalykPayment>> getPaymentsForThisMonth() {
        return new ResponseEntity<>(halykService.getPaymentsForThisMonth(), HttpStatus.OK);
    }

    @GetMapping("/get-payments-this-month-category")
    public ResponseEntity<List<HalykPayment>> getPaymentsForThisMonthByCategory() {
        return new ResponseEntity<>(halykService.getPaymentsForThisMonthByCategory(HalykCategory.FOOD), HttpStatus.OK);
    }


}
