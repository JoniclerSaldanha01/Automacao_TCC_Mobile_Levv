package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\resources\\features", 
	glue = { "steps" }, 
	tags = "@CadastrarLojista",
	plugin = { "pretty", "html:test-output", "json:target/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 	
	dryRun = false, 
	monochrome = true
	)
/*
@RunWith(Cucumber.class)
@CucumberOptions(
       // plugin = {"pretty"},
        //features = "src\\main\\resources\\features",
        glue = "steps",
        tags = {"@CadastrarLojista"},
        snippets = SnippetType.CAMELCASE,
       // monochrome = true,
        //dryRun = false

)
*/
public class RunnerTest {

}

																																												 	