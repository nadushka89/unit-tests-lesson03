package seminars.third.tdd;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
Нужно написать метод который проверяет,
        попадает ли переданное число в интервал (25;100)
        возвращает true, если попадает и false - если нет,
        покрыть тестами метод на 100%

public boolean numberInInterval(int n) { … }*/

public class Interval {
    @Test
    void numberIntervalFalse(){
        NumberInInterval numberInterval = new NumberInInterval();
        int n= 0;
        assertFalse(numberInterval.numberInTheInterval(n));

    }
    @Test
    void numberIntervalTrue(){
        NumberInInterval numberInterval = new NumberInInterval();
        int n= 27;
        assertTrue(numberInterval.numberInTheInterval(n));

    }


}
