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
        // Platform(I) = Chrome
        
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
        step(1);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(2);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(3);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(4);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(5);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(6);
        // Pay(A) = #pressed
        EN.SelectWindow("Shopping");
        EN.ClickOn("Pay");
        step(7);
        // Platform(I) = Chrome
        
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
        step(8);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(9);
        // Log in(O) = #present
        EN.SelectWindow("Main menu");
        EN.VerifyExists("Log in", "YES");
        step(10);
        // Log in(A) = #pressed
        EN.ClickOn("Log in");
        step(11);
        // Login name(I) = Smith
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Smith");
        step(12);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(13);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(14);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(15);
        // Price of delivery(O) = 3
        EN.SelectWindow("Payment");
        EN.VerifyValue("Price of delivery", "3");
        step(16);
        // Total price(O) = 27.5
        EN.VerifyValue("Total price", "27.5");
        step(17);
        // Platform(I) = Chrome
        
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
        step(18);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(19);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(20);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(21);
        // Pay(A) = #pressed
        EN.SelectWindow("Shopping");
        EN.ClickOn("Pay");
        step(22);
        // Platform(I) = Chrome
        
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
        step(23);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(24);
        // Pay(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Pay");
        step(25);
        // Price of delivery(O) = FREE!
        EN.SelectWindow("Payment");
        EN.VerifyValue("Price of delivery", "FREE!");
        step(26);
        // Platform(I) = Chrome
        
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
        step(27);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(28);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(29);
        // Beer > Delete(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Delete");
        step(30);
        // Pay(A) = #pressed
        EN.SelectWindow("Shopping");
        EN.ClickOn("Pay");
        step(31);
        // Price of delivery(O) = 3
        EN.SelectWindow("Payment");
        EN.VerifyValue("Price of delivery", "3");
        step(32);
        // Order(A) = #pressed
        EN.ClickOn("Order");
        step(33);
        // Order > Message(O) = "Thank you for ordering!"
        EN.SelectWindow("Order");
        EN.VerifyValue("Message", "Thank you for ordering!");
        step(34);
        // Platform(I) = Chrome
        
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
        step(35);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(36);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(37);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void payWithNoDeliveryPrice() throws Exception {
        EN.BeginTest( "payWithNoDeliveryPrice" );
        
        step(0);
        // Platform(I) = Chrome
        
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
        step(1);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(2);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(3);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(4);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(5);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(6);
        // Coke > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(7);
        // Total price(O) = 25
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "25");
        step(8);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(9);
        // Go to login(O) = #active
        EN.SelectWindow("Payment");
        EN.VerifyIsActive("Go to login", "YES");
        step(10);
        // Price of delivery(O) = FREE!
        EN.VerifyValue("Price of delivery", "FREE!");
        step(11);
        // Total price(O) = 25
        EN.VerifyValue("Total price", "25");
        step(12);
        // Go to login(A) = #pressed
        EN.ClickOn("Go to login");
        step(13);
        // Login name(I) = Smith
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Smith");
        step(14);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(15);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(16);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(17);
        // Go to login(O) = #non-present
        EN.SelectWindow("Payment");
        EN.VerifyExists("Go to login", "NO");
        step(18);
        // Order(O) = #active
        EN.VerifyIsActive("Order", "YES");
        step(19);
        // Order(A) = #pressed
        EN.ClickOn("Order");
        step(20);
        // Order > Message(O) = "Thank you for ordering!"
        EN.SelectWindow("Order");
        EN.VerifyValue("Message", "Thank you for ordering!");
        step(21);
        // Platform(I) = Chrome
        
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
        step(22);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(23);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(24);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void backToShopping() throws Exception {
        EN.BeginTest( "backToShopping" );
        
        step(0);
        // Platform(I) = Chrome
        
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
        step(1);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(2);
        // Log in(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log in");
        step(3);
        // Login name(I) = Smith
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Smith");
        step(4);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(5);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(6);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(7);
        // Platform(I) = Chrome
        
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
        step(8);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(9);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(10);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(11);
        // Pizza Mexicana > ordered number(O) = 1
        EN.VerifyValue("ordered number", "1");
        step(12);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(13);
        // Total price(O) = 10
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "10");
        step(14);
        // Pay(O) = #active
        EN.VerifyIsActive("Pay", "YES");
        step(15);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(16);
        // Platform(I) = Chrome
        
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
        step(17);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(18);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(19);
        // Price of delivery(O) = 3
        EN.SelectWindow("Payment");
        EN.VerifyValue("Price of delivery", "3");
        step(20);
        // Total price(O) = 13
        EN.VerifyValue("Total price", "13");
        step(21);
        // Platform(I) = Chrome
        
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
        step(22);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(23);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(24);
        // Total price(O) = 10
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "10");
        step(25);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(26);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(27);
        // Total price(O) = 38
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "38");
        step(28);
        // Giveaway > Beer(I) = #pressed
        EN.SelectWindow("Giveaway");
        EN.ClickOn("Beer");
        step(29);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(30);
        // Beer > ordered number(O) = 3
        EN.VerifyValue("ordered number", "3");
        step(31);
        // Total price(O) = 41
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "41");
        step(32);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(33);
        // Price of delivery(O) = FREE!
        EN.SelectWindow("Payment");
        EN.VerifyValue("Price of delivery", "FREE!");
        step(34);
        // Total price(O) = 41
        EN.VerifyValue("Total price", "41");
        step(35);
        // Go to login(A) = #pressed
        EN.ClickOn("Go to login");
        step(36);
        // Login name(I) = Smith
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Smith");
        step(37);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(38);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(39);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(40);
        // Order(O) = #active
        EN.SelectWindow("Payment");
        EN.VerifyIsActive("Order", "YES");
        step(41);
        // Platform(I) = Chrome
        
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
        step(42);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(43);
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(44);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void payWithRegistration() throws Exception {
        EN.BeginTest( "payWithRegistration" );
        
        step(0);
        // Platform(I) = Chrome
        
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
        step(1);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(2);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(3);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(4);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(5);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(6);
        // Pay(A) = #pressed
        EN.SelectWindow("Shopping");
        EN.ClickOn("Pay");
        step(7);
        // Go to login(A) = #pressed
        EN.SelectWindow("Payment");
        EN.ClickOn("Go to login");
        step(8);
        // Login name(I) = Incorrect
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Incorrect");
        step(9);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(10);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(11);
        // Msg(O) = Incorrect name or password
        EN.VerifyValue("Msg", "Incorrect name or password");
        step(12);
        // Platform(I) = Chrome
        
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
        step(13);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(14);
        // Register(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Register");
        step(15);
        // Name(I) = Wigner
        EN.SelectWindow("Registration");
        EN.SetValue("Name", "Wigner");
        step(16);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(17);
        // Second psw(I) = 123456789012
        EN.SetValue("Second psw", "123456789012");
        step(18);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(19);
        // Online shopping > Alert(O) = Registration successful
        EN.SelectWindow("Online shopping");
        EN.VerifyValue("Alert", "Registration successful");
        step(20);
        // Platform(I) = Chrome
        
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
        step(21);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(22);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(23);
        // Platform(I) = Chrome
        
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
        step(24);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(25);
        // Log in(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log in");
        step(26);
        // Platform(I) = Chrome
        
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
        step(27);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(28);
        // Log in(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log in");
        step(29);
        // Login name(I) = Wigner
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Wigner");
        step(30);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(31);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(32);
        // Platform(I) = Chrome
        
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
        step(33);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(34);
        // Pay(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Pay");
        step(35);
        // Total price(O) = 29.5
        EN.SelectWindow("Payment");
        EN.VerifyValue("Total price", "29.5");
        step(36);
        // Order(O) = #active
        EN.VerifyIsActive("Order", "YES");
        step(37);
        // Order(A) = #pressed
        EN.ClickOn("Order");
        step(38);
        // Order > Message(O) = "Thank you for ordering!"
        EN.SelectWindow("Order");
        EN.VerifyValue("Message", "Thank you for ordering!");
        step(39);
        // Platform(I) = Chrome
        
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
        step(40);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(41);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(42);
        // Platform(I) = Chrome
        
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
        step(43);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(44);
        // Log in(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log in");
        step(45);
        // Login name(I) = Wigner
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Wigner");
        step(46);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(47);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(48);
        // Platform(I) = Chrome
        
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
        step(49);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(50);
        // Delete(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Delete");
        step(51);
        // Yes(A) = #pressed
        EN.SelectWindow("Registration");
        EN.ClickOn("Yes");
        step(52);
        // Platform(I) = Chrome
        
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
        step(53);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(54);
        // Log in(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log in");
        step(55);
        // Login name(I) = Wigner
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Wigner");
        step(56);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(57);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(58);
        // Msg(O) = Incorrect name or password
        EN.VerifyValue("Msg", "Incorrect name or password");
        step(59);
        // Platform(I) = Chrome
        
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
        step(60);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(61);
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(62);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void reduceBelow30() throws Exception {
        EN.BeginTest( "reduceBelow30" );
        
        step(0);
        // Platform(I) = Chrome
        
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
        step(1);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(2);
        // Log in(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log in");
        step(3);
        // Login name(I) = Smith
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Smith");
        step(4);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(5);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(6);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(7);
        // Platform(I) = Chrome
        
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
        step(8);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(9);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(10);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(11);
        // Pizza Mexicana > ordered number(O) = 1
        EN.VerifyValue("ordered number", "1");
        step(12);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(13);
        // Total price(O) = 10
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "10");
        step(14);
        // Pay(O) = #active
        EN.VerifyIsActive("Pay", "YES");
        step(15);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(16);
        // Platform(I) = Chrome
        
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
        step(17);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(18);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(19);
        // Platform(I) = Chrome
        
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
        step(20);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(21);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(22);
        // Total price(O) = 10
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "10");
        step(23);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(24);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(25);
        // Total price(O) = 38
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "38");
        step(26);
        // Giveaway > Beer(I) = #pressed
        EN.SelectWindow("Giveaway");
        EN.ClickOn("Beer");
        step(27);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(28);
        // Beer > ordered number(O) = 3
        EN.VerifyValue("ordered number", "3");
        step(29);
        // Total price(O) = 41
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "41");
        step(30);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(31);
        // Platform(I) = Chrome
        
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
        step(32);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(33);
        // Go shopping(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Go shopping");
        step(34);
        // Pizza Rucola XXL > Delete(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Delete");
        step(35);
        // Total price(O) = 13
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "13");
        step(36);
        // Beer > ordered number(O) = 2
        EN.SelectWindow("Beer");
        EN.VerifyValue("ordered number", "2");
        step(37);
        // Pay(A) = #pressed
        EN.SelectWindow("Shopping");
        EN.ClickOn("Pay");
        step(38);
        // Platform(I) = Chrome
        
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
        step(39);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(40);
        // Pay(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Pay");
        step(41);
        // Total price(O) = 16
        EN.SelectWindow("Payment");
        EN.VerifyValue("Total price", "16");
        step(42);
        // Order(O) = #active
        EN.VerifyIsActive("Order", "YES");
        step(43);
        // Order(A) = #pressed
        EN.ClickOn("Order");
        step(44);
        // Order > Message(O) = "Thank you for ordering!"
        EN.SelectWindow("Order");
        EN.VerifyValue("Message", "Thank you for ordering!");
        step(45);
        // Platform(I) = Chrome
        
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
        step(46);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(47);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(48);
        
        EN.EndTest();
    }
}