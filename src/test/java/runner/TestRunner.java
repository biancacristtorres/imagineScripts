package runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import steps.BuyInvalidStepTest;
import steps.BuyValidStepTest;

@RunWith(Suite.class) 
@SuiteClasses({
	BuyValidStepTest.class,
	BuyInvalidStepTest.class
})

public class TestRunner {

}
