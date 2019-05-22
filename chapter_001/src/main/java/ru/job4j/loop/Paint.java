package ru.job4j.loop;
import java.util.function.BiPredicate;

/**
 * @author Artem Gandybin (arteg@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * Метод строит правую часть пирамиды
     * @param height высота пирамиды
     * @return возвращает результат
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Метод строит левую часть пирамиды
     * @param height высота пирамиды
     * @return возвращает результат
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Метод строит пирамиду
     * @param height высота пирамиды
     * @return возвращает результат
     */

    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }


    /**
     * Метод убирает лишний код
     * @param height высота пирамиды
     * @param widht ширина пирамиды
     * @return возвращает результат
     */

    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}