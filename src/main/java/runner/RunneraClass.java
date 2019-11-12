package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\Feature\\Practise1.feature",
					glue="TestCase",
					plugin="html:target\\htmlreport",
					//plugin="junit:target\\xmlreport",
					//plugin="json:target\\jsonreport.json"
					//tags={@login,@payment,@logout}
					tags= {"~@payment"})
public class RunneraClass {   
	

}
