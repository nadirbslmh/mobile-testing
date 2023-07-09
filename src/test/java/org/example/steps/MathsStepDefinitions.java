package org.example.steps;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.And;
import org.example.BaseTest;
import org.example.app.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class MathsStepDefinitions extends BaseTest {

    int a = 0;
    int b = 0;
    int total = 0;

    Calculator calculator = new Calculator();

    @Given("user in the calculator page")
    public void givenUserInCalculatorPage() {
        //getText
        String titleText = calculatorPage.getTitle();
        Assertions.assertEquals("Calculator", titleText);
        //isDisplayed
        boolean isDisplayed = calculatorPage.historyBtnAppear();
        Assertions.assertTrue(isDisplayed);
        //Hamcrest
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @And("a is {int}")
    public void givenAIs(int value) {
        a = value;
        calculatorPage.tapFirstOperand();
    }

    @And("b is {int}")
    public void givenBIs(int value) {
        b = value;
        calculatorPage.tapPlusOperator();
        calculatorPage.tapSecondOperand();
    }

    @When("I add a and b")
    public void iAddAAndB() {
        total = calculator.add(a,b);
        calculatorPage.tapEqual();
    }

    @Then("the total should be {int}")
    public void theTotalShouldBe(int expectedTotal) {
        assertThat(total).isEqualTo(expectedTotal);
        assertThat(total).isEqualTo(calculatorPage.getResult(expectedTotal));
    }

}
