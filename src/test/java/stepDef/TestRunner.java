package stepDef;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources",
        glue={"stepDef"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
