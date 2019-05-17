package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when65RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(65);
        assertThat(result, is(1));
    }

    @Test
    public void when77RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(77);
        assertThat(result, is(1));
    }
}
