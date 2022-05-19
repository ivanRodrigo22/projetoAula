package runner;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@AdicionarUsuario",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty","html:target/cucumber-report.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Executa extends DriversFactory {

    static String urlTest = "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme";
    static String navegador = "Chrome";

    @BeforeClass
    public static void iniciarTeste() {

        if (navegador.equals("Chrome")) {
           System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
           driver = new ChromeDriver();
        }else if (navegador.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }else if (navegador.equals("Edge")) {
            System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get(urlTest);
        System.out.println("TESTE INICIADO COM SUCESSO");



    }
    @AfterClass
    public static void finalizarTeste() {
        driver.quit();
        System.out.println("TESTE FINALIZADO COM SUCESSO");


    }
}
