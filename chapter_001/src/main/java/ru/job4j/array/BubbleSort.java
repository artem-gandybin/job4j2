package ru.job4j.array;
/**
 * В этой программе производится сортировка элементов массива
 * @author Artem Gandybin (arteg@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {
    /**
     * @param array Исходный массив
     * @return возвращает отсортированный массив
     */
    public int[] sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
