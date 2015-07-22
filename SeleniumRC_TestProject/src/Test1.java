
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

@SuppressWarnings("deprecation")
public class Test1 {
	private Selenium selenium;


	@Test
	public void test1() throws Exception {
		selenium.open("/");
		selenium.click("link=Download Selenium");
		selenium.waitForPageToLoad("30000");
	}

}
