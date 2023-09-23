package com.halykhackathon.halykanalitycs.core.controllers;

import com.halykhackathon.halykanalitycs.core.models.HalykPayment;
import org.apache.coyote.Request;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("halyk-payment")
public class HalykPaymentController {



    @RequestMapping(value = "get-payment-by-id", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<HalykPayment> getHalykPaymentById (@PathVariable String id) {

    }

}
