package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

//    @Test
    @ParameterizedTest
    @CsvSource(
            value={
                    "'1 diapason', 200, 300, 3",
                    "'2 diapason', 100, 200, 5",
                    "'3 diapason', 9000, 9801, 5",
                    "'4 diapason', 10, 99, 0",
                    "'5 diapason', 9802, 10000, 0"
            }
    )
    public void numberSqr(String test, int leftBound, int rightHandBorder, int expected) {
        SQRService service = new SQRService();

        //int expected = 3;
        int actual = service.numberSqr(leftBound, rightHandBorder);

        assertEquals(expected, actual);

    }
}

