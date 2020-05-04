package io.micronaut.test.junit5;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import io.micronaut.test.annotation.MicronautTest;
import math.service.Application;

@MicronautTest(application=Application.class) 
class MathServiceTest {

    @Inject
    MathService mathService; 


    @ParameterizedTest
    @CsvSource({"2,8", "3,12", "2,4"})
    void testComputeNumToSquare(Integer num, Integer square) {
        final Integer result = mathService.compute(num); 

        Assertions.assertEquals(
                square,
                result
        );
    }
}
