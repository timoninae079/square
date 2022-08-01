package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import ru.netology.ru.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    SQRService service = new SQRService();

    @Test

    public void calculate() {
        int expected = 0;
        int actual = service.calculate(10, 99);

        assertEquals(expected, actual);

    }

    @Test

    public void calculate2() {
        int expected = 3;
        int actual = service.calculate(200, 300);

        assertEquals(expected, actual);

    }
}
