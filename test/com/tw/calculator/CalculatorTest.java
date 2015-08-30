package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldReturnZeroIfZeroIsAddedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.add(0.0), 0.0001);
    }

    @Test
    public void shouldReturnTheNumberToBeAddedIfItIsAddedInitiallySatisfyingTheAdditiveIdentityProperty() {
        Calculator calculator = new Calculator();

        assertEquals(5.0, calculator.add(5.0), 0.0001);
    }

    @Test
    public void shouldReturnResultSevenIfItFiveIsAddedToNumberTwoWhichWasAddedEarlier() {
        Calculator calculator = new Calculator();
        calculator.add(2.0);

        assertEquals(7.0, calculator.add(5.0), 0.0001);
    }

    @Test
    public void shouldReturnZeroIfZeroIsSubtractedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.subtract(0.0), 0.0001);
    }

    @Test
    public void shouldReturnNegativeSelfNumberIfANumberIsSubtractedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(-5.0, calculator.subtract(5.0), 0.0001);
    }

    @Test
    public void shouldReturnTwoIfFiveIsSubtractedAfterSevenWasAdded() {
        Calculator calculator = new Calculator();
        calculator.add(7.0);

        assertEquals(2.0, calculator.subtract(5.0), 0.0001);
    }

    @Test
    public void shouldReturnNegativeSevenIfFiveIsSubtractedAfterTwoWasSubtracted() {
        Calculator calculator = new Calculator();
        calculator.subtract(2.0);

        assertEquals(-7.0, calculator.subtract(5.0), 0.0001);
    }

    @Test
    public void shouldReturnZeroWhenZeroIsMultipliedInitially() {
        Calculator calculator = new Calculator();

        assertEquals(0.0, calculator.multiply(0.0), 0.0001);
    }

    @Test
    public void shouldReturnTheNumberItselfIfOneIsMultipliedToAnyNumber() {
        Calculator calculator = new Calculator();
        calculator.add(5.0);

        assertEquals(5.0, calculator.multiply(1.0), 0.0001);
    }

    @Test
    public void shouldReturnTheFifteenIfThreeIsMultipliedToFive() {
        Calculator calculator = new Calculator();
        calculator.add(5.0);

        assertEquals(15.0, calculator.multiply(3.0), 0.0001);
    }
}
