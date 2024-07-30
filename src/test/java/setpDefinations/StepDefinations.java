package setpDefinations;


import org.openqa.selenium.WebDriver;

import functions.FunctionLibraries;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinations {
	public static WebDriver driver;
	
	@Given("Launch bro")
	public void launch_bro() throws Throwable, Throwable {
	    driver=FunctionLibraries.StartBrowser();
	}
	@When("enter url as {string}")
	public void enter_url_as(String url) {
	    FunctionLibraries.URL();
	}
	@When("wait for username with {string} and {string} and {string}")
	public void wait_for_username_with_and_and(String LocatorType,String LocatorValue,String Testdata) {
	    FunctionLibraries.WaitForElement(LocatorType, LocatorValue, Testdata);
	}
	@When("enter username with {string} and {string} and {string}")
	public void enter_username_with_and_and(String LocatorType,String LocatorValue,String Testdata) {
	    FunctionLibraries.TypeAction(LocatorType, LocatorValue, Testdata);
	}
	@When("enter password with {string} and {string} and {string}")
	public void enter_password_with_and_and(String LocatorType,String LocatorValue,String Testdata) {
		FunctionLibraries.TypeAction(LocatorType, LocatorValue, Testdata);
	}
	@When("click login with {string} and {string}")
	public void click_login_with_and(String LocatorType,String LocatorValue) {
	    FunctionLibraries.Clickaction(LocatorType, LocatorValue);
	}
	
	@When("wait for Suppilers link with {string} and {string}")
	public void wait_for_suppilers_link_with_and(String LocatorType,String LocatorValue) {
	    FunctionLibraries.WaitForElement(LocatorType, LocatorValue, "10");
	}
	@When("click Suppilers link with {string} and {string}")
	public void click_suppilers_link_with_and(String LocatorType,String LocatorValue) {
	    FunctionLibraries.Clickaction(LocatorType, LocatorValue);
	}
	@When("wait for add button with {string} and {string}")
	public void wait_for_add_button_with_and(String LocatorType,String LocatorValue) {
	  FunctionLibraries.WaitForElement(LocatorType, LocatorValue, "10");
	}
	@When("click add button with {string} and {string}")
	public void click_add_button_with_and(String LocatorType,String LocatorValue) {
		FunctionLibraries.Clickaction(LocatorType, LocatorValue);
	}
	@When("wait for suppiler number with {string} and {string}")
	public void wait_for_suppiler_number_with_and(String LocatorType,String LocatorValue) {
	    FunctionLibraries.WaitForElement(LocatorType, LocatorValue,"10");
	}
	@When("capture the suppiler number with {string} and {string}")
	public void capture_the_suppiler_number_with_and(String LocatorType,String LocatorValue) throws Throwable {
	    FunctionLibraries.capturesuppiler(LocatorType, LocatorValue);
	}
	
	@When("enter in {string} with {string} and {string}")
	public void enter_in_with_and(String Testdata, String LocatorType, String LocatorValue) {
	    FunctionLibraries.TypeAction(LocatorType, LocatorValue, Testdata);
	}
	@When("click save button with {string} and {string}")
	public void click_save_button_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibraries.Clickaction(LocatorType, LocatorValue);
	}
	@When("wait for conform ok with {string} and {string}")
	public void wait_for_conform_ok_with_and(String LocatorType, String LocatorValue) {
	     FunctionLibraries.WaitForElement(LocatorType, LocatorValue, "10");
	}
	@When("click conform ok with {string} and {string}")
	public void click_conform_ok_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibraries.Clickaction(LocatorType, LocatorValue);
	}
	@When("wait for alert ok with {string} and {string}")
	public void wait_for_alert_ok_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibraries.WaitForElement(LocatorType, LocatorValue,"10");
	}
	@When("click alert ok with {string} and {string}")
	public void click_alert_ok_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibraries.Clickaction(LocatorType, LocatorValue);
	}
	@When("verify suppiler num in table")
	public void verify_suppiler_num_in_table() throws Throwable {
	    FunctionLibraries.Suppilerstable();
	}
	@When("click logout with {string} and {string}")
	public void click_logout_with_and(String LocatorType, String LocatorValue) {

        FunctionLibraries.Clickaction(LocatorType, LocatorValue);
	}
	@When("Close browser")
	public void close_browser() {
	    FunctionLibraries.CloseBrowser();
	}
	@When("wait for Customers link with {string} and {string}")
	public void wait_for_customers_link_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibraries.WaitForElement(LocatorType, LocatorValue,"10");
	}
	@When("click Customers link with {string} and {string}")
	public void click_customers_link_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibraries.Clickaction(LocatorType, LocatorValue);
	}
	@When("wait for Customer number with {string} and {string}")
	public void wait_for_customer_number_with_and(String LocatorType, String LocatorValue) {
		FunctionLibraries.WaitForElement(LocatorType, LocatorValue,"10");
	}
	@When("capture the Customer number with {string} and {string}")
	public void capture_the_customer_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
	    FunctionLibraries.CaptureCustomer(LocatorType, LocatorValue);
	}
	@When("verify Customer num in table")
	public void verify_customer_num_in_table() throws Throwable {
	    FunctionLibraries.Customertable();
	}
	
	@When("wait for Stock link with {string} and {string}")
	public void wait_for_stock_link_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibraries.WaitForElement(LocatorType, LocatorValue,"10");
	}
	@When("click Stock link with {string} and {string}")
	public void click_stock_link_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibraries.Clickaction(LocatorType, LocatorValue);
	}
	@When("wait for catagory with {string} and {string}")
	public void wait_for_catagory_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibraries.WaitForElement(LocatorType, LocatorValue,"10");
	}
	@When("drop in {string} with {string} and {string}")
	public void drop_in_with_and(String Testdata, String LocatorType, String LocatorValue) {
	   FunctionLibraries.DropdownAction(LocatorType, LocatorValue, Testdata);
	}
	@When("capture stock number with {string} and {string}")
	public void capture_stock_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
	    FunctionLibraries.capturestock(LocatorType, LocatorValue);
	}
	@When("verify Stock num in table")
	public void verify_stock_num_in_table() throws Throwable {
	    FunctionLibraries.Stocktable();
	}
}
