package api.runner;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
	@Karate.Test
	public Karate runTest() {
		
		// address for our feature files.
		// and tags
		
		return Karate.run("classpath:features")
				.tags("@smoke");
		
	}

}
