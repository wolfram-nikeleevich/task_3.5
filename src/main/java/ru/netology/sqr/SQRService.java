package ru.netology.sqr;

public class SQRService {
    int sqrCounter(int lowerBorder, int upperBorder) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= lowerBorder && i * i <= upperBorder)
                counter++;
        }
        return counter;
    }
}
