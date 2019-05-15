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

public class LoginTest {
    
    private static Log2HTML myLog2HTML = null;
    
    private static List<ILogger> loggers = new LinkedList<ILogger>();
    public static void addLogger(ILogger logger) {
        loggers.add(logger);
    }
    
    private static String logFileName = "target/Login_Chrome_Test.html";
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
    public void testSuccessful() throws Exception {
        EN.BeginTest( "testSuccessful" );
        
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
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
        step(7);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void loginWignerDeleted() throws Exception {
        EN.BeginTest( "loginWignerDeleted" );
        
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
        // Login name(I) = Wigner
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Wigner");
        step(3);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(4);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(5);
        // Msg(O) = Incorrect name or password
        EN.VerifyValue("Msg", "Incorrect name or password");
        step(6);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void failedLogin() throws Exception {
        EN.BeginTest( "failedLogin" );
        
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
        // Login name(I) = Incorrect
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Incorrect");
        step(3);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(4);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(5);
        // Msg(O) = Incorrect name or password
        EN.VerifyValue("Msg", "Incorrect name or password");
        step(6);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void testWrongPassword() throws Exception {
        EN.BeginTest( "testWrongPassword" );
        
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
        // Password(I) = wrong-PSW
        EN.SetValue("Password", "wrong-PSW");
        step(4);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(5);
        // Msg(O) = Incorrect name or password
        EN.VerifyValue("Msg", "Incorrect name or password");
        step(6);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void goShopping() throws Exception {
        EN.BeginTest( "goShopping" );
        
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
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void a() throws Exception {
        EN.BeginTest( "a" );
        
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
        // Login name(I) = Wigner
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Wigner");
        step(3);
        // Password(I) = 2a4b6c
        EN.SetValue("Password", "2a4b6c");
        step(4);
        // Msg(O) = Incorrect name or password
        EN.VerifyValue("Msg", "Incorrect name or password");
        step(5);
        
        EN.EndTest();
    }
}