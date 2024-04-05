package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage {

	public WebDriver driver;

	public productsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	

	@FindBy(xpath = "//div[@class='inventory_list']/div")
	List<WebElement> products;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cartButton;
	

	public void addProduct(String productname) {

		WebElement prd = products.stream()
				.filter(product -> product.findElement(By.xpath("div[2]/div/a")).getText().equals(productname))
				.findFirst().orElse(null);
		prd.findElement(By.xpath("//*[text()='Add to cart']")).click();

	}

	public void clickCart() {

		cartButton.click();
	}

}
