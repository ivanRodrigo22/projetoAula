package metodos;

import drivers.DriversFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class MetodosDeTestes extends DriversFactory {

    /**
     * Metodo clicar em um elemento web passando um By
     * @param elemento
     */
    public void clicar(By elemento) {

        driver.findElement(elemento).click();
    }

    /**
     * Metodo clicar em um elemento web passando um WebElement
     * @param elemento
     */
    public void clicar (WebElement elemento) {

        elemento.click();
    }

    /**
     * Metodo para digitar um texto no elemento passando o WebElemento
     * @param elemento
     * @param texto
     */
    public void digitar( By elemento, String texto) {

        driver.findElement(elemento).sendKeys(texto);
    }

    /**
     * Valida se o texto capturado contem o texto esperado passando um By
     * @param elemento
     * @param textoEsperado
     */
    public void validarTexto(By elemento, String textoEsperado) {
        String textoCapturado = driver.findElement(elemento).getText();
        assertTrue(textoCapturado.contains(textoEsperado));

    }

    /**
     * Tirar uma evidencia do teste executado
     * @param nomeEvidencia
     */
    public void screenShot(String nomeEvidencia) throws IOException {
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./evidencias/"+nomeEvidencia+".png");
        FileUtils.copyFile(srcFile, destFile);

    }

    /**
     * Pausar a aplicacao pelo tempo determinado em milisegundos
     * @param tempo
     * @throws InterruptedException
     */
    public void pausa(int tempo) throws InterruptedException {
        Thread.sleep(tempo);

    }
    //tirar foto

}
