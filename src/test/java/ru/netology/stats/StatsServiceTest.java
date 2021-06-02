package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void calculateSum() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
        System.out.println(expected);
    }

    @Test
    void average() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.average(purchases);

        assertEquals(expected, actual);

        System.out.println(expected);
    }


    @Test
    void findMax() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;

        long actual = service.findMax(purchases);

        assertEquals(expected, actual);

        String[] names = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(names[7]);
    }


    @Test
    void findMin() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;

        long actual = service.findMin(purchases);

        assertEquals(expected, actual);

        String[] names = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(names[8]);
    }

    @Test
    void belowTheAverage () {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.belowTheAverage(purchases);
        assertEquals(expected,actual);
        System.out.println(expected);

    }


    @Test
    void aboveAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.belowTheAverage(purchases);
        assertEquals(expected,actual);
        System.out.println(expected);
    }
}
