package com.halykhackathon.halykanalitycs.core.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/halyk-payment")
public class HalykPaymentController {

    @RequestMapping(value = "/get-payment-by-id", method = RequestMethod.GET)
    public ResponseEntity<String> getHalykPaymentById() {
        return new ResponseEntity<String>("123", HttpStatus.OK);
    }

}
