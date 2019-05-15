package pizza;

import okw.core.EN;
import okw.log.ILogger;
import okw.log.Logger_Sngltn;
import okw.log.log2html.Log2HTML;
import okw.gui.adapter.selenium.webdriver.SeDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriverException;

import java.util.List;
import java.util.LinkedList;

public class PaymentTest {
    
    private static Log2HTML myLog2HTML = null;
    
    private static List<ILogger> loggers = new LinkedList<ILogger>();
    public static void addLogger(ILogger logger) {
        loggers.add(logger);
    }
    
    private static String logFileName = "target/Payment_Chrome_Test.html";
    public static void setLogFileName(String fn) {
        logFileName = fn;
    }
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        Logger_Sngltn.getInstance();
        // Reset des Loggers: Alle geladenen Instanzen löschen
        Logger_Sngltn.init();
        
        // myLog2HTML = new Log2HTML(logFileName);
        // Logger_Sngltn.getInstance().addLogger(myLog2HTML);
        Logger_Sngltn.getInstance().setDebugMode(false);
        for (ILogger logger : loggers) {
            Logger_Sngltn.getInstance().addLogger(logger);
        }
    }
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
        // myLog2HTML.Result2HTML();
    }
    
    private static int currentStep = -1;
    public static int getCurrentStep() {
        return currentStep;
    }
    
    private static void step(int i) throws InterruptedException {
        currentStep = i;
        if (Thread.interrupted()) throw new InterruptedException();
    }
    
    /**
     * 1
     */
    @Test
    public void payWithDeliveryPrice() throws Exception {
        EN.BeginTest( "payWithDeliveryPrice" );
        
        step(0);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().driver.navigate().to("data:,");
                EN.SelectWindow("Chrome");
            } catch (WebDriverException e) {
                EN.StartApp("Chrome");
            }
        }
        System.setProperty("okw.app.Chrome.started", "true");
        EN.SetValue("URL", "http://www.online-shopping.eskuvoje.net");
        step(1);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(2);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(3);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(4);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(5);
        // Pay(A) = #pressed
        EN.SelectWindow("Shopping");
        EN.ClickOn("Pay");
        step(6);
        // Log in(O) = #present
        EN.SelectWindow("Main menu");
        EN.VerifyExists("Log in", "YES");
        step(7);
        // Log in(A) = #pressed
        EN.ClickOn("Log in");
        step(8);
        // Login name(I) = Smith
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Smith");
        step(9);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(10);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(11);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(12);
        // Price of delivery(O) = 3
        EN.SelectWindow("Payment");
        EN.VerifyValue("Price of delivery", "3");
        step(13);
        // Total price(O) = 27.5
        EN.VerifyValue("Total price", "27.5");
        step(14);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(15);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(16);
        // Pay(A) = #pressed
        EN.SelectWindow("Shopping");
        EN.ClickOn("Pay");
        step(17);
        // Pay(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Pay");
        step(18);
        // Price of delivery(O) = FREE!
        EN.SelectWindow("Payment");
        EN.VerifyValue("Price of delivery", "FREE!");
        step(19);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(20);
        // Beer > Delete(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Delete");
        step(21);
        // Pay(A) = #pressed
        EN.SelectWindow("Shopping");
        EN.ClickOn("Pay");
        step(22);
        // Price of delivery(O) = 3
        EN.SelectWindow("Payment");
        EN.VerifyValue("Price of delivery", "3");
        step(23);
        // Order(A) = #pressed
        EN.ClickOn("Order");
        step(24);
        // Order > Message(O) = "Thank you for ordering!"
        EN.SelectWindow("Order");
        EN.VerifyValue("Message", "Thank you for ordering!");
        step(25);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(26);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void payWithNoDeliveryPrice() throws Exception {
        EN.BeginTest( "payWithNoDeliveryPrice" );
        
        step(0);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().driver.navigate().to("data:,");
                EN.SelectWindow("Chrome");
            } catch (WebDriverException e) {
                EN.StartApp("Chrome");
            }
        }
        System.setProperty("okw.app.Chrome.started", "true");
        EN.SetValue("URL", "http://www.online-shopping.eskuvoje.net");
        step(1);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(2);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(3);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(4);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(5);
        // Coke > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(6);
        // Total price(O) = 25
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "25");
        step(7);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(8);
        // Go to login(O) = #active
        EN.SelectWindow("Payment");
        EN.VerifyIsActive("Go to login", "YES");
        step(9);
        // Price of delivery(O) = FREE!
        EN.VerifyValue("Price of delivery", "FREE!");
        step(10);
        // Total price(O) = 25
        EN.VerifyValue("Total price", "25");
        step(11);
        // Go to login(A) = #pressed
        EN.ClickOn("Go to login");
        step(12);
        // Login name(I) = Smith
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Smith");
        step(13);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(14);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(15);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(16);
        // Go to login(O) = #non-present
        EN.SelectWindow("Payment");
        EN.VerifyExists("Go to login", "NO");
        step(17);
        // Order(O) = #active
        EN.VerifyIsActive("Order", "YES");
        step(18);
        // Order(A) = #pressed
        EN.ClickOn("Order");
        step(19);
        // Order > Message(O) = "Thank you for ordering!"
        EN.SelectWindow("Order");
        EN.VerifyValue("Message", "Thank you for ordering!");
        step(20);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(21);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void backToShopping() throws Exception {
        EN.BeginTest( "backToShopping" );
        
        step(0);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().driver.navigate().to("data:,");
                EN.SelectWindow("Chrome");
            } catch (WebDriverException e) {
                EN.StartApp("Chrome");
            }
        }
        System.setProperty("okw.app.Chrome.started", "true");
        EN.SetValue("URL", "http://www.online-shopping.eskuvoje.net");
        step(1);
        // Log in(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log in");
        step(2);
        // Login name(I) = Smith
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Smith");
        step(3);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(4);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(5);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(6);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        EN.SelectWindow("Chrome");
        EN.SetValue("URL", "http://www.online-shopping.eskuvoje.net");
        step(7);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(8);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(9);
        // Pizza Mexicana > ordered number(O) = 1
        EN.VerifyValue("ordered number", "1");
        step(10);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(11);
        // Total price(O) = 10
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "10");
        step(12);
        // Pay(O) = #active
        EN.VerifyIsActive("Pay", "YES");
        step(13);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(14);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(15);
        // Price of delivery(O) = 3
        EN.SelectWindow("Payment");
        EN.VerifyValue("Price of delivery", "3");
        step(16);
        // Total price(O) = 13
        EN.VerifyValue("Total price", "13");
        step(17);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(18);
        // Total price(O) = 10
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "10");
        step(19);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(20);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(21);
        // Total price(O) = 38
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "38");
        step(22);
        // Giveaway > Beer(I) = #pressed
        EN.SelectWindow("Giveaway");
        EN.ClickOn("Beer");
        step(23);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(24);
        // Beer > ordered number(O) = 3
        EN.VerifyValue("ordered number", "3");
        step(25);
        // Total price(O) = 41
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "41");
        step(26);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(27);
        // Price of delivery(O) = FREE!
        EN.SelectWindow("Payment");
        EN.VerifyValue("Price of delivery", "FREE!");
        step(28);
        // Total price(O) = 41
        EN.VerifyValue("Total price", "41");
        step(29);
        // Go to login(A) = #pressed
        EN.ClickOn("Go to login");
        step(30);
        // Login name(I) = Smith
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Smith");
        step(31);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(32);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(33);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(34);
        // Order(O) = #active
        EN.SelectWindow("Payment");
        EN.VerifyIsActive("Order", "YES");
        step(35);
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(36);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void payWithRegistration() throws Exception {
        EN.BeginTest( "payWithRegistration" );
        
        step(0);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().driver.navigate().to("data:,");
                EN.SelectWindow("Chrome");
            } catch (WebDriverException e) {
                EN.StartApp("Chrome");
            }
        }
        System.setProperty("okw.app.Chrome.started", "true");
        EN.SetValue("URL", "http://www.online-shopping.eskuvoje.net");
        step(1);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(2);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(3);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(4);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(5);
        // Pay(A) = #pressed
        EN.SelectWindow("Shopping");
        EN.ClickOn("Pay");
        step(6);
        // Go to login(A) = #pressed
        EN.SelectWindow("Payment");
        EN.ClickOn("Go to login");
        step(7);
        // Login name(I) = Incorrect
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Incorrect");
        step(8);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(9);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(10);
        // Msg(O) = Incorrect name or password
        EN.VerifyValue("Msg", "Incorrect name or password");
        step(11);
        // Register(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Register");
        step(12);
        // Name(I) = Wigner
        EN.SelectWindow("Registration");
        EN.SetValue("Name", "Wigner");
        step(13);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(14);
        // Second psw(I) = 123456789012
        EN.SetValue("Second psw", "123456789012");
        step(15);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(16);
        // Online shopping > Alert(O) = Registration successful
        EN.SelectWindow("Online shopping");
        EN.VerifyValue("Alert", "Registration successful");
        step(17);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(18);
        // Log in(A) = #pressed
        EN.ClickOn("Log in");
        step(19);
        // Log in(A) = #pressed
        EN.ClickOn("Log in");
        step(20);
        // Login name(I) = Wigner
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Wigner");
        step(21);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(22);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(23);
        // Pay(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Pay");
        step(24);
        // Total price(O) = 29.5
        EN.SelectWindow("Payment");
        EN.VerifyValue("Total price", "29.5");
        step(25);
        // Order(O) = #active
        EN.VerifyIsActive("Order", "YES");
        step(26);
        // Order(A) = #pressed
        EN.ClickOn("Order");
        step(27);
        // Order > Message(O) = "Thank you for ordering!"
        EN.SelectWindow("Order");
        EN.VerifyValue("Message", "Thank you for ordering!");
        step(28);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(29);
        // Log in(A) = #pressed
        EN.ClickOn("Log in");
        step(30);
        // Login name(I) = Wigner
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Wigner");
        step(31);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(32);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(33);
        // Delete(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Delete");
        step(34);
        // Yes(A) = #pressed
        EN.SelectWindow("Registration");
        EN.ClickOn("Yes");
        step(35);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        EN.SelectWindow("Chrome");
        EN.SetValue("URL", "http://www.online-shopping.eskuvoje.net");
        step(36);
        // Log in(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log in");
        step(37);
        // Login name(I) = Wigner
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Wigner");
        step(38);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(39);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(40);
        // Msg(O) = Incorrect name or password
        EN.VerifyValue("Msg", "Incorrect name or password");
        step(41);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void reduceBelow30() throws Exception {
        EN.BeginTest( "reduceBelow30" );
        
        step(0);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().driver.navigate().to("data:,");
                EN.SelectWindow("Chrome");
            } catch (WebDriverException e) {
                EN.StartApp("Chrome");
            }
        }
        System.setProperty("okw.app.Chrome.started", "true");
        EN.SetValue("URL", "http://www.online-shopping.eskuvoje.net");
        step(1);
        // Log in(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log in");
        step(2);
        // Login name(I) = Smith
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Smith");
        step(3);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(4);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(5);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(6);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        EN.SelectWindow("Chrome");
        EN.SetValue("URL", "http://www.online-shopping.eskuvoje.net");
        step(7);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(8);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(9);
        // Pizza Mexicana > ordered number(O) = 1
        EN.VerifyValue("ordered number", "1");
        step(10);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(11);
        // Total price(O) = 10
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "10");
        step(12);
        // Pay(O) = #active
        EN.VerifyIsActive("Pay", "YES");
        step(13);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(14);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(15);
        // Go shopping(A) = #pressed
        EN.ClickOn("Go shopping");
        step(16);
        // Total price(O) = 10
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "10");
        step(17);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(18);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(19);
        // Total price(O) = 38
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "38");
        step(20);
        // Giveaway > Beer(I) = #pressed
        EN.SelectWindow("Giveaway");
        EN.ClickOn("Beer");
        step(21);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(22);
        // Beer > ordered number(O) = 3
        EN.VerifyValue("ordered number", "3");
        step(23);
        // Total price(O) = 41
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "41");
        step(24);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(25);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(26);
        // Pizza Rucola XXL > Delete(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Delete");
        step(27);
        // Total price(O) = 13
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "13");
        step(28);
        // Beer > ordered number(O) = 2
        EN.SelectWindow("Beer");
        EN.VerifyValue("ordered number", "2");
        step(29);
        // Pay(A) = #pressed
        EN.SelectWindow("Shopping");
        EN.ClickOn("Pay");
        step(30);
        // Pay(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Pay");
        step(31);
        // Total price(O) = 16
        EN.SelectWindow("Payment");
        EN.VerifyValue("Total price", "16");
        step(32);
        // Order(O) = #active
        EN.VerifyIsActive("Order", "YES");
        step(33);
        // Order(A) = #pressed
        EN.ClickOn("Order");
        step(34);
        // Order > Message(O) = "Thank you for ordering!"
        EN.SelectWindow("Order");
        EN.VerifyValue("Message", "Thank you for ordering!");
        step(35);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(36);
        
        EN.EndTest();
    }
}