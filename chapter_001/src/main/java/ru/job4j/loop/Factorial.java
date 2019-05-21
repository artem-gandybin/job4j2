package ru.job4j.loop;

/**
 * программа вычисляющая факториал
 * @author Artem Gandybin (arteg@mail.ru)
 */
public class Factorial {
    /**
     * Подсчет суммы всех четных чисел.
     * @param n число, для которого вычисляется факториал.
     * @return result Факториал числа n.
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}