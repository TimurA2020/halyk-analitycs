package com.halykhackathon.halykanalitycs.core.controllers;

import com.halykhackathon.halykanalitycs.core.models.HalykPayment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("onlinebank-payment")
public class OnlinebankPaymentController {

    @RequestMapping(value = "get-payment-by-id", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<HalykPayment> getHalykPaymentById (@PathVariable Long id) {
        return null;
    }

}
