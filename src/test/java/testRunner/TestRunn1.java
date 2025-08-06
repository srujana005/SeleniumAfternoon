package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\srujana\\eclipse-workspace\\testpractice\\Features\\dataDriven.feature",
		glue="stepDefinition",   //name of package 
		//tags="@smoke",
		plugin= {"html:target/cucmberHtmlRep.html",
				"json:target/cucumberJsonRep.json"}
		  
		
		)

public class TestRunn1 {

}
