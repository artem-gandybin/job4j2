package ru.job4j.array;
/**
 * Проверка диагоналей матрицы.
 * @author Artem Gandybin (arteg@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * @param data Входящий boolean массив
     * @return возвращает результат проверки
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {

            if (data [i][i] != data [i + 1][i + 1]) {
                result = false;
                break;
            }
            if (data [data.length - 1 - i][i] != data[data.length - 1 - (i + 1)][i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}