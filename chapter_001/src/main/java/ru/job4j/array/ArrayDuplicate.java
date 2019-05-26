package ru.job4j.array;

import java.util.Arrays;
/**
 * Удаление дубликатов
 * @author Artem Gandybin (arteg@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    /**
     * @param array Входящий массив
     * @return возвращает массив после удаления дубликатов
     */
    public String[] remove(String[] array) {
        int second = array.length;
        for (int out = 0; out < second; out++) {
            for (int in = out + 1; in < second; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[second - 1];
                    second--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, second);
    }
}
