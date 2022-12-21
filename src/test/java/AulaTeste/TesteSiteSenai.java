package AulaTeste;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSiteSenai {
	
	
	private WebDriver driver;
	
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USUARIO\\Desktop\\Programas\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void TestarLogin () {
		driver.findElement(By.id("campo-email")).sendKeys("email@email.com");
		driver.findElement(By.id("password")).sendKeys("senha123");
		driver.findElement(By.id("botao-enviar")).click();
	
	
	
	
	//@Test
	//public void TesteNavegabilidade() {
	//	driver.get("http://informatica.sp.senai.br/");
	//	driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
	//	//driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
	//	driver.findElement(By.id("Busca1_btnBusca")).click();
		
	}
	
	
	

}
