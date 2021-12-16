package stepDef;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/weblogindata.feature",
    stepNotifications = true,plugin={"pretty","html:target/cucumber.html"})


public class DataTestRunner{
}
