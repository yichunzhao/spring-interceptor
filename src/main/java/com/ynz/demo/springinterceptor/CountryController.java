package com.ynz.demo.springinterceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CountryController {

    @GetMapping("countries")
    public List<String> getCountries() {
        log.info("in getCountries handler...");

        return List.of("CHINA", "UK", "USA", "FRANCE", "RUSSIA", "GERMANY");
    }

}
