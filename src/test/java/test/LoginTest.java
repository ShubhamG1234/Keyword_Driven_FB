package test;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.testng.annotations.Test;

import base.BaseClass;
import engine.Keyword_Engine;

public class LoginTest extends BaseClass{
	
	public Keyword_Engine keyWordEngine;

	@Test
	public void loginTest() throws InvalidFormatException  {
		keyWordEngine = new Keyword_Engine();
		keyWordEngine.startExecution("Login");
	}
	@Test
	public void signUpTest() throws InvalidFormatException {
		keyWordEngine = new Keyword_Engine();
		keyWordEngine.startExecution("SignUp");
	}
}

