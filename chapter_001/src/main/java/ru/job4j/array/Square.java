package ru.job4j.array;

/**
 * @author Artem Gandybin (arteg@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Square {
    /**
     *
     * @param bound Длина массива
     * @return возвращает заполненный массив
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполняет массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int j = 0; j < rst.length; j++ ){
            rst[j] = (int) Math.pow(j + 1, 2);
        }

        return rst;
    }
}
