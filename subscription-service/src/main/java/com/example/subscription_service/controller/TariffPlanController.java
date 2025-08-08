package com.example.subscription_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tariff")
public class TariffPlanController {
    @PostMapping("/createTariff")
    public String createTariff() {
        return "Tariff created";
    }
    @GetMapping("/getTariffs")
    public String getTariffs() {
        return "Tariffs";
    }
    @GetMapping("/getTariff/{id}")
    public String getTariff() {
        return "Tariff";
    }
}
