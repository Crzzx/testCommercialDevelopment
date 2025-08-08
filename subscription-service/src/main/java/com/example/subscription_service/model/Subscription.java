package com.example.subscription_service.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;

@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long userId;
    @ManyToOne
    private TariffPlan tariffPlan;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
}
