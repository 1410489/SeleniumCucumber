package Definitions;

import io.cucumber.java.en.Given;

public class CarritoDefinitions {
    @Given("la pagina esta estable")
    public void laPaginaEstaEstable() {
        Hooks.driver.get("http://demo.guru99.com/payment-gateway/index.php");
    }
}
