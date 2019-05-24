package ru.job4j.array;
/**
 * Программа проверяет, что все элементы в массиве являются true или false
 * @author Artem Gandybin (arteg@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Check {
    /**
     * @param data массив, который нужно проверить
     * @return возвращает результат проверки
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
