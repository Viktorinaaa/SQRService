package ru.netology.sqr;

public class SQRService{
    public int numberSqr(int leftBound, int rightHandBorder) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= leftBound && sqr <= rightHandBorder) {
                number += 1;
            }
        }
        return number;
    }
}

