package Definitions;

import PageObjetcs.CapturarDatosTarjetaPage;
import PageObjetcs.CheckCreditPage;
import PageObjetcs.MenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CarritoDefinitions {
    //inicializar la variable
    MenuPage menu;
    CapturarDatosTarjetaPage captura;
    CheckCreditPage credit;

    //crear un constructor


    public CarritoDefinitions() {
        menu = new MenuPage(Hooks.driver);
        captura = new CapturarDatosTarjetaPage(Hooks.driver);
        credit= new CheckCreditPage(Hooks.driver);
    }

    @Given("la pagina esta estable")
    public void laPaginaEstaEstable() {
        Hooks.driver.get("http://demo.guru99.com/payment-gateway/index.php");
    }

    @When("doy click en generar tarjeta")
    public void doyClickEnGenerarTarjeta() {
        menu.clickGenerarTarjeta();
    }

    @And("capturamos datos de la tarjeta")
    public void capturamosDatosDeLaTarjeta() {
        captura.CambiarVentana();
        captura.capturarTarjeta();
    }

    @And("capturamos el cvv de la tarjeta")
    public void capturamosElCvvDeLaTarjeta() {
        captura.capturarCVV();
    }


    @And("capturamos la fecha de la tarjeta")
    public void capturamosLaFechaDeLaTarjeta() {
        captura.capturarFecha();
    }

    @And("capturamos el monto disponible de la tarjeta")
    public void capturamosElMontoDisponibleDeLaTarjeta() {
        captura.capturarMonto();
        captura.CerrarVentana();
    }

    @When("doy click en Check Credit")
    public void doyClickEnCheckCredit() {
        menu.clickCheckCredit();
    }

    @And("ingreso el dato de la tarjeta y doy click")
    public void ingresoElDatoDeLaTarjetaYDoyClick() {
        credit.IngresarDatosTarjeta();
        credit.ClickBtn();
    }
}
