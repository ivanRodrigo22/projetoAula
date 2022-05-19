package pages;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;
import org.openqa.selenium.By;

import java.io.IOException;

import static drivers.DriversFactory.driver;

public class AdicionarUsuiariosPages {

    MetodosDeTestes metodos = new MetodosDeTestes();
    ElementosWeb elemento = new ElementosWeb();

    By addUsuario = By.xpath("//a[@href='/v1.x/demo/bootstrap_theme_v4/add']");
    By btnSalvar = By.xpath("//button[@id='form-button-save']");

    By msg = By.xpath("//div[@id='report-success']/p");

    public void selecionarVersao(String versao) {

        metodos.digitar(elemento.versao, versao);


    }
    public void addUsuario() {

        metodos.clicar(addUsuario);
        driver.findElement(By.xpath("//*[@name='customerName']")).click();
        driver.findElement(By.xpath("//*[@name='customerName']")).sendKeys("Ivan Rodrigo da Conceicao");
        driver.findElement(By.xpath("//*[@name='contactLastName']")).click();
        driver.findElement(By.xpath("//*[@name='contactLastName']")).sendKeys("Conceicao");
        driver.findElement(By.xpath("//*[@name='contactFirstName']")).click();
        driver.findElement(By.xpath("//*[@name='contactFirstName']")).sendKeys(" Ivan");
        driver.findElement(By.xpath("//*[@name='phone']")).click();
        driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("11 962073638");
        driver.findElement(By.xpath("//*[@name='addressLine1']")).click();
        driver.findElement(By.xpath("//*[@name='addressLine1']")).sendKeys("Rua Mauro Jose");
        driver.findElement(By.xpath("//*[@name='addressLine2']")).click();
        driver.findElement(By.xpath("//*[@name='addressLine2']")).sendKeys("Jd Pasulista");
        driver.findElement(By.xpath("//*[@name='city']")).click();
        driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Barueri");
        driver.findElement(By.xpath("//*[@name='state']")).click();
        driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Sao Paulo");
        driver.findElement(By.xpath("//*[@name='postalCode']")).click();
        driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("06467140");
        driver.findElement(By.xpath("//*[@name='country']")).click();
        driver.findElement(By.xpath("//*[@name='country']")).sendKeys("Brasil");
        driver.findElement(By.cssSelector("b")).click();
        driver.findElement(By.cssSelector(".chosen-search > input")).click();
        driver.findElement(By.cssSelector(".chosen-search > input")).sendKeys("king");
        driver.findElement(By.cssSelector(".active-result")).click();
        driver.findElement(By.xpath("//*[@name='creditLimit']")).click();
        driver.findElement(By.xpath("//*[@name='creditLimit']")).sendKeys("10.000,00");
        driver.findElement(By.xpath("//*[@name='deleted']")).click();
        driver.findElement(By.xpath("//*[@name='deleted']")).sendKeys("ok");


    }


    public void salvar() {

        metodos.clicar(btnSalvar);
    }

    public void validarMensagem(String addUsuario) throws IOException, InterruptedException {
        metodos.pausa(3000);
        metodos.validarTexto(msg, addUsuario);
        metodos.screenShot("CT01 - Adicionar Usuario");
    }
}
