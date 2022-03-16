package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"lower border is 200 upper is 300,200,300,3", "lower is 100 upper is 10000,100,10000,90",
            "lower is 1 upper is 99,1,99,0", "lower border exceeds upper,300,200,0", "lower equals to upper,101,101,0"})
    void shouldCalculateSQRCount(String testName, int lowerBorder, int upperBorder, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrCounter(lowerBorder, upperBorder);
        assertEquals(expected, actual);
    }

}