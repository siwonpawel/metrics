package com.github.siwonpawel.spring.metrics.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

@RestController
@RequestMapping("/counter")
public class Controller {

    private static final AtomicLong atomicCounter = new AtomicLong(0);
    private static final LongAdder adderCounter = new LongAdder();

    @Timed
    @GetMapping("/atomic")
    public String atomic() {
        return String.format("Hello World! It's %d access since running this app!", atomicCounter.incrementAndGet());
    }

    @Timed
    @GetMapping("/adder")
    public String adder() {
        adderCounter.add(1);
        return String.format("Hello World! It's %d access since running this app!", adderCounter.sum());
    }
}
