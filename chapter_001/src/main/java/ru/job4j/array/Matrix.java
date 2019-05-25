package ru.job4j.array;
/**
 * Таблица умножения
 * @author Artem Gandybin (arteg@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Matrix {
    /**
     * @param size Размер таблицы
     * @return возвращает заполненную таблицу
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table [i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}