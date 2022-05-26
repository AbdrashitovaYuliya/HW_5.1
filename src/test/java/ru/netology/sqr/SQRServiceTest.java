package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCount() {
        SQRService service = new SQRService();
        int actual = service.calcSqr(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCountIfBorders200() {
        SQRService service = new SQRService();
        int actual = service.calcSqr(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountIfBorders300() {
        SQRService service = new SQRService();
        int actual = service.calcSqr(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIfBordersfrom300To200() {
        SQRService service = new SQRService();
        int actual = service.calcSqr(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountIfBorderNegative() {
        SQRService service = new SQRService();
        int actual = service.calcSqr(-200, 200);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}