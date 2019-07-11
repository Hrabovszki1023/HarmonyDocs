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

public class ShoppingTest {
    
    private static Log2HTML myLog2HTML = null;
    
    private static List<ILogger> loggers = new LinkedList<ILogger>();
    public static void addLogger(ILogger logger) {
        loggers.add(logger);
    }
    
    private static String logFileName = "target/Shopping_Chrome_Test.html";
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
    public void underTen() throws Exception {
        EN.BeginTest( "underTen" );
        
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
        // Pizza Mexicana > ordered number(O) = 0
        EN.SelectWindow("Pizza Mexicana");
        EN.VerifyValue("ordered number", "0");
        step(4);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(5);
        // Pizza Mexicana > ordered number(O) = 1
        EN.VerifyValue("ordered number", "1");
        step(6);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(7);
        // Total price(O) = 9
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "9");
        step(8);
        // Pay(O) = #non-active
        EN.VerifyIsActive("Pay", "NO");
        step(9);
        // Warning(O) = "You should order more for at least 1 euro"
        EN.VerifyValue("Warning", "You should order more for at least 1 euro");
        step(10);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(11);
        // Pizza Mexicana > Delete(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Delete");
        step(12);
        // Warning(O) = "You should order more for at least 5 euros"
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Warning", "You should order more for at least 5 euros");
        step(13);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void under30() throws Exception {
        EN.BeginTest( "under30" );
        
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
        // Pizza Mexicana > ordered number(O) = 0
        EN.SelectWindow("Pizza Mexicana");
        EN.VerifyValue("ordered number", "0");
        step(4);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(5);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(6);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(7);
        // Total price(O) = 29.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "29.5");
        step(8);
        // Pay(O) = #active
        EN.VerifyIsActive("Pay", "YES");
        step(9);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(10);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void deleteGiveawayBeer() throws Exception {
        EN.BeginTest( "deleteGiveawayBeer" );
        
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
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(5);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(6);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(7);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(8);
        // Total price(O) = 48
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "48");
        step(9);
        // Pizza Rucola XXL > Delete(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Delete");
        step(10);
        // Pizza Rucola XXL > ordered number(O) = 0
        EN.VerifyValue("ordered number", "0");
        step(11);
        // Total price(O) = 20
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "20");
        step(12);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(13);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(14);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(15);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(16);
        // Total price(O) = 40.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "40.5");
        step(17);
        // Giveaway(O) = #present
        EN.VerifyExists("Giveaway", "YES");
        step(18);
        // Giveaway > Beer(I) = #pressed
        EN.SelectWindow("Giveaway");
        EN.ClickOn("Beer");
        step(19);
        // Beer > ordered number(O) = 3
        EN.SelectWindow("Beer");
        EN.VerifyValue("ordered number", "3");
        step(20);
        // Beer > Delete(A) = #pressed
        EN.ClickOn("Delete");
        step(21);
        // Beer > ordered number(O) = 0
        EN.VerifyValue("ordered number", "0");
        step(22);
        // Total price(O) = 34.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "34.5");
        step(23);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(24);
        // Total price(O) = 41.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "41.5");
        step(25);
        // Giveaway(O) = #non-present
        EN.VerifyExists("Giveaway", "NO");
        step(26);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(27);
        // Total price(O) = 43.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "43.5");
        step(28);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(29);
        // Total price(O) = 43.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "43.5");
        step(30);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void deleteGiveawayCoke() throws Exception {
        EN.BeginTest( "deleteGiveawayCoke" );
        
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
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(5);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(6);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(7);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(8);
        // Total price(O) = 48
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "48");
        step(9);
        // Pizza Rucola XXL > Delete(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Delete");
        step(10);
        // Pizza Rucola XXL > ordered number(O) = 0
        EN.VerifyValue("ordered number", "0");
        step(11);
        // Total price(O) = 20
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "20");
        step(12);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(13);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(14);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(15);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(16);
        // Total price(O) = 40.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "40.5");
        step(17);
        // Giveaway(O) = #present
        EN.VerifyExists("Giveaway", "YES");
        step(18);
        // Giveaway > Coke(I) = #pressed
        EN.SelectWindow("Giveaway");
        EN.ClickOn("Coke");
        step(19);
        // Coke > ordered number(O) = 2
        EN.SelectWindow("Coke");
        EN.VerifyValue("ordered number", "2");
        step(20);
        // Coke > Delete(A) = #pressed
        EN.ClickOn("Delete");
        step(21);
        // Coke > ordered number(O) = 0
        EN.VerifyValue("ordered number", "0");
        step(22);
        // Total price(O) = 38.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "38.5");
        step(23);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(24);
        // Total price(O) = 45.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "45.5");
        step(25);
        // Giveaway(O) = #non-present
        EN.VerifyExists("Giveaway", "NO");
        step(26);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(27);
        // Total price(O) = 48.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "48.5");
        step(28);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(29);
        // Total price(O) = 48.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "48.5");
        step(30);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void noDoubleGiveaway() throws Exception {
        EN.BeginTest( "noDoubleGiveaway" );
        
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
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(4);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(5);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(6);
        // Pizza Rucola XXL > ordered number(O) = 2
        EN.VerifyValue("ordered number", "2");
        step(7);
        // Total price(O) = 30
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "30");
        step(8);
        // Pay(O) = #active
        EN.VerifyIsActive("Pay", "YES");
        step(9);
        // Pizza Rucola XXL > Delete(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Delete");
        step(10);
        // Pizza Rucola XXL > ordered number(O) = 0
        EN.VerifyValue("ordered number", "0");
        step(11);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(12);
        // Pizza Chicken > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(13);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(14);
        // Giveaway(O) = #present
        EN.SelectWindow("Shopping");
        EN.VerifyExists("Giveaway", "YES");
        step(15);
        // Total price(O) = 33
        EN.VerifyValue("Total price", "33");
        step(16);
        // Giveaway > Coke(I) = #pressed
        EN.SelectWindow("Giveaway");
        EN.ClickOn("Coke");
        step(17);
        // Coke > ordered number(O) = 2
        EN.SelectWindow("Coke");
        EN.VerifyValue("ordered number", "2");
        step(18);
        // Total price(O) = 33
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "33");
        step(19);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(20);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(21);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(22);
        // Total price(O) = 75
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "75");
        step(23);
        // Giveaway(O) = #non-present
        EN.VerifyExists("Giveaway", "NO");
        step(24);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void twentyfive() throws Exception {
        EN.BeginTest( "twentyfive" );
        
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
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void belowTwentyfive() throws Exception {
        EN.BeginTest( "belowTwentyfive" );
        
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
        // Total price(O) = 24.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "24.5");
        step(7);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(8);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void ten() throws Exception {
        EN.BeginTest( "ten" );
        
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
        
        EN.EndTest();
    }
}