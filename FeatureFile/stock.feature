
@tag
Feature: Validate Stock Functionalities
  I want to use this template for my Stock Functionalities

  @tag1
  Scenario Outline: validate suppilers
  Given Launch bro
  When enter url as "http://webapp.qedgetech.com/"
  When wait for username with "name" and "username" and "10"
  When enter username with "xpath" and "//input[@id='username']" and "admin"
  When enter password with "name" and "password" and "master"
  When click login with "xpath" and "//button[@id='btnsubmit']"
  When wait for Suppilers link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
  When click Suppilers link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
  When wait for add button with "xpath" and "(//a[@data-original-title='Add'])[1]"
  When click add button with "xpath" and "(//a[@data-original-title='Add'])[1]"
  When wait for suppiler number with "name" and "x_Supplier_Number"
  When capture the suppiler number with "name" and "x_Supplier_Number"
  When enter in "<Suppilername>" with "xpath" and "//input[@id='x_Supplier_Name']" 
  When enter in "<Address>" with "xpath" and "//textarea[@id='x_Address']"
  When enter in "<City>" with "xpath" and "//input[@id='x_City']"
  When enter in "<Country>" with "xpath" and "//input[@id='x_Country']"
  When enter in "<Cperson>" with "xpath" and "//input[@id='x_Contact_Person']"
  When enter in "<Pnum>" with "xpath" and "//input[@id='x_Phone_Number']"
  When enter in "<Email>" with "xpath" and "//input[@id='x__Email']"
  When enter in "<Mnum>" with "xpath" and "//input[@id='x_Mobile_Number']"
  When enter in "<Notes>" with "xpath" and "//textarea[@id='x_Notes']"
  When click save button with "id" and "btnAction"
  When wait for conform ok with "xpath" and "//button[normalize-space()='OK!']"
  When click conform ok with "xapth" and "//button[normalize-space()='OK!']"
  When wait for alert ok with "xpath" and "//button[@class='ajs-button btn btn-primary']"
  When click alert ok with "xpath" and "//button[@class='ajs-button btn btn-primary']"
  When verify suppiler num in table
  When click logout with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
  When Close browser  
  
  Examples:
|Suppilername|Address|City|Country|Cperson|Pnum|Email|Mnum|Notes|
|Tarun|Vedayapalem|Nellore|India|Hari|9876543218|test@gmail.com|9876598765|this is suppiler data|
|Kumar|old Vedayapalem|Nellore|India|Harish|9876543218|test@gmail.com|9876598765|this is suppiler data|

   @tag2
   Scenario Outline: validate Customers
    
  Given Launch bro
  When enter url as "http://webapp.qedgetech.com/"
  When wait for username with "name" and "username" and "10"
  When enter username with "xpath" and "//input[@id='username']" and "admin"
  When enter password with "name" and "password" and "master"
  When click login with "xpath" and "//button[@id='btnsubmit']"
  When wait for Customers link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
  When click Customers link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
  When wait for add button with "xpath" and "(//a[@data-original-title='Add'])[1]"
  When click add button with "xpath" and "(//a[@data-original-title='Add'])[1]"
  When wait for Customer number with "xpath" and "//input[@id='x_Customer_Number']"
  When capture the Customer number with "xpath" and "//input[@id='x_Customer_Number']"
  When enter in "<Customername>" with "xpath" and "//input[@id='x_Customer_Name']" 
  When enter in "<Address>" with "xpath" and "//textarea[@id='x_Address']"
  When enter in "<City>" with "xpath" and "//input[@id='x_City']"
  When enter in "<Country>" with "xpath" and "//input[@id='x_Country']"
  When enter in "<Cperson>" with "xpath" and "//input[@id='x_Contact_Person']"
  When enter in "<Pnum>" with "xpath" and "//input[@id='x_Phone_Number']"
  When enter in "<Email>" with "xpath" and "//input[@id='x__Email']"
  When enter in "<Mnum>" with "xpath" and "//input[@id='x_Mobile_Number']"
  When enter in "<Notes>" with "xpath" and "//input[@id='x_Notes']"
  When click save button with "id" and "btnAction"
  When wait for conform ok with "xpath" and "//button[normalize-space()='OK!']"
  When click conform ok with "xapth" and "//button[normalize-space()='OK!']"
  When wait for alert ok with "xpath" and "//button[@class='ajs-button btn btn-primary']"
  When click alert ok with "xpath" and "//button[@class='ajs-button btn btn-primary']"
  When verify Customer num in table
  When click logout with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
  When Close browser

  Examples:
|Customername|Address|City|Country|Cperson|Pnum|Email|Mnum|Notes|
|Tarun|Vedayapalem|Nellore|India|Hari|9876543218|test@gmail.com|9876598765|this is Customer data|
|Kumar|old Vedayapalem|Nellore|India|Harish|9876543218|test@gmail.com|9876598765|this is Customer data|

@tag3
   Scenario Outline: validate Stock
    
  Given Launch bro
  When enter url as "http://webapp.qedgetech.com/"
  When wait for username with "name" and "username" and "10"
  When enter username with "xpath" and "//input[@id='username']" and "admin"
  When enter password with "name" and "password" and "master"
  When click login with "xpath" and "//button[@id='btnsubmit']"
  When wait for Stock link with "xpath" and "(//a[contains(.,'Stock Items')])[2]"
  When click Stock link with "xpath" and "(//a[contains(.,'Stock Items')])[2]"
  When wait for add button with "xpath" and "(//a[@data-original-title='Add'])[1]"
  When click add button with "xpath" and "(//a[@data-original-title='Add'])[1]"
  When wait for catagory with "name" and "x_Category"
  When drop in "<category>" with "name" and "x_Category"
  When drop in "<SuppilerNumber>" with "xpath" and "//select[@id='x_Supplier_Number']"
  When capture stock number with "xpath" and "//input[@id='x_Stock_Number']"
  When enter in "<Stockname>" with "xpath" and "//input[@id='x_Stock_Name']"
  When drop in "<mearument>" with "name" and "x_Unit_Of_Measurement" 
  When enter in "<Purcaseprice>" with "name" and "x_Purchasing_Price"
  When enter in "<sellingprice>" with "name" and "x_Selling_Price"
  When enter in "<Notes>" with "xpath" and "//input[@id='x_Notes']"
  When click save button with "id" and "btnAction"
  When wait for conform ok with "xpath" and "//button[normalize-space()='OK!']"
  When click conform ok with "xapth" and "//button[normalize-space()='OK!']"
  When wait for alert ok with "xpath" and "//button[@class='ajs-button btn btn-primary']"
  When click alert ok with "xpath" and "//button[@class='ajs-button btn btn-primary']"
  When verify Stock num in table
  When click logout with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
  When Close browser

  Examples:
|category|SuppilerNumber|Stockname|mearument|Purcaseprice|sellingprice|Notes|
|1|1|Tarun|1|30000|1000000|This is stocks|
|1|1|TarunKumar|1|30000|1000000|This is stocks|
