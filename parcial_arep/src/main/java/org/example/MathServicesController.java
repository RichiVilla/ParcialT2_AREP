package org.example;


import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathServicesController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/factores")
    public Respuesta factores(@RequestParam(value = "value", defaultValue = "1") String value) {
        return new Respuesta("factores", value, MathServices.factores(Integer.parseInt(value)).toString());
    }

    @GetMapping("/primos")
    public Respuesta primos(@RequestParam(value = "value", defaultValue = "1") String value) {
        return new Respuesta("primos", value, MathServices.primos(Integer.parseInt(value)).toString());
    }
}

