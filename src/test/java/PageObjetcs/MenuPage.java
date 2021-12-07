package PageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(linkText="Generate Card Number") private WebElement lnk_generarTarjeta;


    //constructor
    public MenuPage(WebDriver d) {
        //inicializar as variables
        driver=d;
        //esperar algo para utilizar
        //la espera explicita solo te espera hasta encontra el objeto
        // la espera implicita
        wait=new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);

    }

    public void clickGenerarTarjeta(){
        //Espera que cargue la pagina con el wait
        wait.until(ExpectedConditions.elementToBeClickable(lnk_generarTarjeta));
        lnk_generarTarjeta.click();

    }
}
