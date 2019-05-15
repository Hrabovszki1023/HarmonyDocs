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
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().getDriver().navigate().to("data:,");
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
        // Pizza Mexicana > ordered number(O) = 0
        EN.SelectWindow("Pizza Mexicana");
        EN.VerifyValue("ordered number", "0");
        step(3);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(4);
        // Pizza Mexicana > ordered number(O) = 1
        EN.VerifyValue("ordered number", "1");
        step(5);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(6);
        // Total price(O) = 9
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "9");
        step(7);
        // Pay(O) = #non-active
        EN.VerifyIsActive("Pay", "NO");
        step(8);
        // Warning(O) = "You should order more for at least 1 euro"
        EN.VerifyValue("Warning", "You should order more for at least 1 euro");
        step(9);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(10);
        // Pizza Mexicana > Delete(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Delete");
        step(11);
        // Warning(O) = "You should order more for at least 5 euros"
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Warning", "You should order more for at least 5 euros");
        step(12);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void under30() throws Exception {
        EN.BeginTest( "under30" );
        
        step(0);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().getDriver().navigate().to("data:,");
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
        // Pizza Mexicana > ordered number(O) = 0
        EN.SelectWindow("Pizza Mexicana");
        EN.VerifyValue("ordered number", "0");
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
        // Total price(O) = 29.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "29.5");
        step(7);
        // Pay(O) = #active
        EN.VerifyIsActive("Pay", "YES");
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
    public void deleteGiveawayBeer() throws Exception {
        EN.BeginTest( "deleteGiveawayBeer" );
        
        step(0);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().getDriver().navigate().to("data:,");
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
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(4);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(5);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(6);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(7);
        // Total price(O) = 48
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "48");
        step(8);
        // Pizza Rucola XXL > Delete(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Delete");
        step(9);
        // Pizza Rucola XXL > ordered number(O) = 0
        EN.VerifyValue("ordered number", "0");
        step(10);
        // Total price(O) = 20
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "20");
        step(11);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(12);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(13);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(14);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(15);
        // Total price(O) = 40.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "40.5");
        step(16);
        // Giveaway(O) = #present
        EN.VerifyExists("Giveaway", "YES");
        step(17);
        // Giveaway > Beer(I) = #pressed
        EN.SelectWindow("Giveaway");
        EN.ClickOn("Beer");
        step(18);
        // Beer > ordered number(O) = 3
        EN.SelectWindow("Beer");
        EN.VerifyValue("ordered number", "3");
        step(19);
        // Beer > Delete(A) = #pressed
        EN.ClickOn("Delete");
        step(20);
        // Beer > ordered number(O) = 0
        EN.VerifyValue("ordered number", "0");
        step(21);
        // Total price(O) = 34.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "34.5");
        step(22);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(23);
        // Total price(O) = 41.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "41.5");
        step(24);
        // Giveaway(O) = #non-present
        EN.VerifyExists("Giveaway", "NO");
        step(25);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(26);
        // Total price(O) = 43.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "43.5");
        step(27);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(28);
        // Total price(O) = 43.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "43.5");
        step(29);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void deleteGiveawayCoke() throws Exception {
        EN.BeginTest( "deleteGiveawayCoke" );
        
        step(0);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().getDriver().navigate().to("data:,");
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
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(4);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(5);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(6);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(7);
        // Total price(O) = 48
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "48");
        step(8);
        // Pizza Rucola XXL > Delete(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Delete");
        step(9);
        // Pizza Rucola XXL > ordered number(O) = 0
        EN.VerifyValue("ordered number", "0");
        step(10);
        // Total price(O) = 20
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "20");
        step(11);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(12);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(13);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(14);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(15);
        // Total price(O) = 40.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "40.5");
        step(16);
        // Giveaway(O) = #present
        EN.VerifyExists("Giveaway", "YES");
        step(17);
        // Giveaway > Coke(I) = #pressed
        EN.SelectWindow("Giveaway");
        EN.ClickOn("Coke");
        step(18);
        // Coke > ordered number(O) = 2
        EN.SelectWindow("Coke");
        EN.VerifyValue("ordered number", "2");
        step(19);
        // Coke > Delete(A) = #pressed
        EN.ClickOn("Delete");
        step(20);
        // Coke > ordered number(O) = 0
        EN.VerifyValue("ordered number", "0");
        step(21);
        // Total price(O) = 38.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "38.5");
        step(22);
        // Pizza Mexicana > Plus(A) = #pressed
        EN.SelectWindow("Pizza Mexicana");
        EN.ClickOn("Plus");
        step(23);
        // Total price(O) = 45.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "45.5");
        step(24);
        // Giveaway(O) = #non-present
        EN.VerifyExists("Giveaway", "NO");
        step(25);
        // Beer > Plus(A) = #pressed
        EN.SelectWindow("Beer");
        EN.ClickOn("Plus");
        step(26);
        // Total price(O) = 48.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "48.5");
        step(27);
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(28);
        // Total price(O) = 48.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "48.5");
        step(29);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void noDoubleGiveaway() throws Exception {
        EN.BeginTest( "noDoubleGiveaway" );
        
        step(0);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().getDriver().navigate().to("data:,");
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
        // Coke > Plus(A) = #pressed
        EN.SelectWindow("Coke");
        EN.ClickOn("Plus");
        step(3);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(4);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(5);
        // Pizza Rucola XXL > ordered number(O) = 2
        EN.VerifyValue("ordered number", "2");
        step(6);
        // Total price(O) = 30
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "30");
        step(7);
        // Pay(O) = #active
        EN.VerifyIsActive("Pay", "YES");
        step(8);
        // Pizza Rucola XXL > Delete(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Delete");
        step(9);
        // Pizza Rucola XXL > ordered number(O) = 0
        EN.VerifyValue("ordered number", "0");
        step(10);
        // Pizza Chicken > Plus(A) = #pressed
        EN.SelectWindow("Pizza Chicken");
        EN.ClickOn("Plus");
        step(11);
        // Pizza Chicken > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(12);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(13);
        // Giveaway(O) = #present
        EN.SelectWindow("Shopping");
        EN.VerifyExists("Giveaway", "YES");
        step(14);
        // Total price(O) = 33
        EN.VerifyValue("Total price", "33");
        step(15);
        // Giveaway > Coke(I) = #pressed
        EN.SelectWindow("Giveaway");
        EN.ClickOn("Coke");
        step(16);
        // Coke > ordered number(O) = 2
        EN.SelectWindow("Coke");
        EN.VerifyValue("ordered number", "2");
        step(17);
        // Total price(O) = 33
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "33");
        step(18);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.SelectWindow("Pizza Rucola XXL");
        EN.ClickOn("Plus");
        step(19);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(20);
        // Pizza Rucola XXL > Plus(A) = #pressed
        EN.ClickOn("Plus");
        step(21);
        // Total price(O) = 75
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "75");
        step(22);
        // Giveaway(O) = #non-present
        EN.VerifyExists("Giveaway", "NO");
        step(23);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void twentyfive() throws Exception {
        EN.BeginTest( "twentyfive" );
        
        step(0);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().getDriver().navigate().to("data:,");
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
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void belowTwentyfive() throws Exception {
        EN.BeginTest( "belowTwentyfive" );
        
        step(0);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().getDriver().navigate().to("data:,");
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
        // Total price(O) = 24.5
        EN.SelectWindow("Shopping");
        EN.VerifyValue("Total price", "24.5");
        step(6);
        // Pay(A) = #pressed
        EN.ClickOn("Pay");
        step(7);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void ten() throws Exception {
        EN.BeginTest( "ten" );
        
        step(0);
        // URL(I) = "http://www.online-shopping.eskuvoje.net"
        
        if (System.getProperty("okw.app.Chrome.started") == null) {
            EN.StartApp("Chrome");
        } else {
            try {
                SeDriver.getInstance().getDriver().navigate().to("data:,");
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
        
        EN.EndTest();
    }
}