package StepsDefinition;

import data.OddOrEven;
// import cucumber.api.java.en.Given;
// import cucumber.api.java.en.Then;
// import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class OddOrEvenStepDefinition {

    private OddOrEven oddOrEven;
    private String actual;

    @Given("^Ask a number$")
    public void askANumber() {
        oddOrEven = new OddOrEven();
    }

    @When("^A number is (\\d+)$")
    public void aNumberIs(int number) {
        actual = oddOrEven.ask(number);
    }


    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String expected) {
        assertEquals(expected, actual);
    }

}
