package com.ashutosh.learningspring.exercise1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BussinessCalculationService {
    private DataService dataService;

    public BussinessCalculationService(@Qualifier("mySQLDataService") DataService dataService ) {
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
