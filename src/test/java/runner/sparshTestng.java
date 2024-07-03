package runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports.html"},features = "C:\\Users\\kkkkr\\OneDrive\\Desktop\\masai\\unit3\\sdet201\\eclipse\\Sparch_cucumber\\src\\test\\resources\\sparch\\contact.feature", glue = "steps")
public class sparshTestng extends AbstractTestNGCucumberTests {
	

}
