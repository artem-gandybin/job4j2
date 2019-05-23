package ru.job4j.array;
/**
 * В этой программе производится зеркальная замена элементов массива местами
 * @author Artem Gandybin (arteg@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Turn {
    /**
     * @param array Исходный массив
     * @return возвращает измененнный массив
     */
    public int[] back(int[] array) {
        int n = array.length;

        for (int i = 0; i < n/2; i++) {
            int k = array[n-i-1];
            array[n-i-1] = array[i];
            array[i] = k;
        }
        return array;
    }
}