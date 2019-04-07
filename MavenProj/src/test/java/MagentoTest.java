

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.majentoObjects.Login;
import com.abc.majentoObjects.Main;
import com.abc.majentoObjects.Welcome;

public class MagentoTest {


	

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.magento.com");
	Welcome w=new Welcome(driver);
	w.clickOnMyAccount();
	Login l=new Login();
	l.typeEmail();
	l.typePassword();
	l.clickOnLogin();
	Main m=new Main(driver);
	m.clickOnLogout();
	
	
	
	
	
	

	}


	

}
