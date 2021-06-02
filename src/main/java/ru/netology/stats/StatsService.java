package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }


    public long average(long[] purchases) {
        long sum = calculateSum(purchases);

        return sum/12;
    }


    public long findMax(long[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }


    public long findMin(long[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;
            }
        }
        return currentMin;
    }


    public long belowTheAverage (long[] purchases) {
        long avr = average(purchases);
        int avrMonth = 0;
        for (long purchase : purchases) {
            if (avr < purchase) {
                avrMonth++;
            }
        }
        return avrMonth;
    }


    public long aboveAverage (long[] purchases) {
        long avr = average(purchases);
        int avrMonth = 0;
        for (long purchase : purchases) {
            if (avr > purchase) {
                avrMonth++;
            }
        }
        return avrMonth;
    }
}
