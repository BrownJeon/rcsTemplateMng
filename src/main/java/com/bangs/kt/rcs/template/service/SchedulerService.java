package com.bangs.kt.rcs.template.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

    @Scheduled(initialDelay = 1000, fixedDelay = 2000)
    public void run() {
        System.out.println("hello");

        addPrint();
    }

    private void addPrint() {
        System.out.println("add...");
    }
}
