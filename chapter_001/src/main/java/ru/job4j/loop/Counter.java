package ru.job4j.loop;

/**
 * Подсчет суммы чётных чисел в заданном диапазоне
 */
public class Counter {
    /**
     * Подсчет суммы всех четных чисел.
     * @param start Начало диапазона.
     * @param finish Конец диапазона.
     * @return Сумма всех чисел.
     */

    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;


    }
}