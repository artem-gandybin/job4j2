package ru.job4j.array;

/** Программа Обертка над строкой
 * @author Artem Gandybin (arteg@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class ArrayChar {

    /**
     * Метод проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return true, если слово начинаеться с префикса
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        // проверить. что массив data имеет первые элементы одинаковые с value
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != wrd[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
