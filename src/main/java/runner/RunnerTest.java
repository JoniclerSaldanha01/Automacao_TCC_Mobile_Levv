package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src\\main\\resources\\features"},
        glue = {"steps"},
        tags = "@CT01_CadastrarCliente"
        
)

public class RunnerTest extends AbstractTestNGCucumberTests {


}
	