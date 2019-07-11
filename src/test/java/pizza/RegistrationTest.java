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

public class RegistrationTest {
    
    private static Log2HTML myLog2HTML = null;
    
    private static List<ILogger> loggers = new LinkedList<ILogger>();
    public static void addLogger(ILogger logger) {
        loggers.add(logger);
    }
    
    private static String logFileName = "target/Registration_Chrome_Test.html";
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
    public void identical() throws Exception {
        EN.BeginTest( "identical" );
        
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
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(3);
        // Register(A) = #pressed
        EN.ClickOn("Register");
        step(4);
        // Name(I) = Smith
        EN.SelectWindow("Registration");
        EN.SetValue("Name", "Smith");
        step(5);
        // Password(I) = 12345
        EN.SetValue("Password", "12345");
        step(6);
        // Second psw(I) = 123456789012
        EN.SetValue("Second psw", "123456789012");
        step(7);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(8);
        // Message(O) = Login name already exists
        EN.VerifyValue("Message", "Login name already exists");
        step(9);
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
        step(10);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(11);
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(12);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void differentPassword123456689012() throws Exception {
        EN.BeginTest( "differentPassword123456689012" );
        
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
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(3);
        // Register(A) = #pressed
        EN.ClickOn("Register");
        step(4);
        // Name(I) = Bartok
        EN.SelectWindow("Registration");
        EN.SetValue("Name", "Bartok");
        step(5);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(6);
        // Second psw(I) = 123456689012
        EN.SetValue("Second psw", "123456689012");
        step(7);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(8);
        // Message(O) = Passwords have to be identical
        EN.VerifyValue("Message", "Passwords have to be identical");
        step(9);
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
        step(10);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(11);
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(12);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void differentPassword1234567890123() throws Exception {
        EN.BeginTest( "differentPassword1234567890123" );
        
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
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(3);
        // Register(A) = #pressed
        EN.ClickOn("Register");
        step(4);
        // Name(I) = Bartok
        EN.SelectWindow("Registration");
        EN.SetValue("Name", "Bartok");
        step(5);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(6);
        // Second psw(I) = 1234567890123
        EN.SetValue("Second psw", "1234567890123");
        step(7);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(8);
        // Message(O) = Passwords have to be identical
        EN.VerifyValue("Message", "Passwords have to be identical");
        step(9);
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
        step(10);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(11);
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(12);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void differentPassword23456789012() throws Exception {
        EN.BeginTest( "differentPassword23456789012" );
        
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
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(3);
        // Register(A) = #pressed
        EN.ClickOn("Register");
        step(4);
        // Name(I) = Bartok
        EN.SelectWindow("Registration");
        EN.SetValue("Name", "Bartok");
        step(5);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(6);
        // Second psw(I) = 23456789012
        EN.SetValue("Second psw", "23456789012");
        step(7);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(8);
        // Message(O) = Passwords have to be identical
        EN.VerifyValue("Message", "Passwords have to be identical");
        step(9);
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
        step(10);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(11);
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(12);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void longOrShortPsw12345() throws Exception {
        EN.BeginTest( "longOrShortPsw12345" );
        
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
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(3);
        // Register(A) = #pressed
        EN.ClickOn("Register");
        step(4);
        // Password(I) = 12345
        EN.SelectWindow("Registration");
        EN.SetValue("Password", "12345");
        step(5);
        // Name(I) = Bartok
        EN.SetValue("Name", "Bartok");
        step(6);
        // Second psw(I) = 123456789012
        EN.SetValue("Second psw", "123456789012");
        step(7);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(8);
        // Message(O) = Password length shall be between 6 and 12
        EN.VerifyValue("Message", "Password length shall be between 6 and 12");
        step(9);
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
        step(10);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(11);
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(12);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void longOrShortPswA123456789012() throws Exception {
        EN.BeginTest( "longOrShortPswA123456789012" );
        
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
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(3);
        // Register(A) = #pressed
        EN.ClickOn("Register");
        step(4);
        // Password(I) = a123456789012
        EN.SelectWindow("Registration");
        EN.SetValue("Password", "a123456789012");
        step(5);
        // Name(I) = Bartok
        EN.SetValue("Name", "Bartok");
        step(6);
        // Second psw(I) = 123456689012
        EN.SetValue("Second psw", "123456689012");
        step(7);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(8);
        // Message(O) = Password length shall be between 6 and 12
        EN.VerifyValue("Message", "Password length shall be between 6 and 12");
        step(9);
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
        step(10);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(11);
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(12);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void empty() throws Exception {
        EN.BeginTest( "empty" );
        
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
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(3);
        // Register(A) = #pressed
        EN.ClickOn("Register");
        step(4);
        // Name(I) = ""
        EN.SelectWindow("Registration");
        EN.SetValue("Name", "");
        step(5);
        // Password(I) = 654321
        EN.SetValue("Password", "654321");
        step(6);
        // Second psw(I) = 1234567890123
        EN.SetValue("Second psw", "1234567890123");
        step(7);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(8);
        // Message(O) = Login name cannot be empty
        EN.VerifyValue("Message", "Login name cannot be empty");
        step(9);
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
        step(10);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(11);
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(12);
        
        EN.EndTest();
    }
    
    /**
     * 1
     */
    @Test
    public void newAndDeleteRegistration() throws Exception {
        EN.BeginTest( "newAndDeleteRegistration" );
        
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
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(3);
        // Register(A) = #pressed
        EN.ClickOn("Register");
        step(4);
        // Name(I) = Wigner
        EN.SelectWindow("Registration");
        EN.SetValue("Name", "Wigner");
        step(5);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(6);
        // Second psw(I) = 123456789012
        EN.SetValue("Second psw", "123456789012");
        step(7);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(8);
        // Online shopping > Alert(O) = Registration successful
        EN.SelectWindow("Online shopping");
        EN.VerifyValue("Alert", "Registration successful");
        step(9);
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
        step(10);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(11);
        // Log out(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log out");
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
        // Log in(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log in");
        step(15);
        // Login name(I) = Wigner
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Wigner");
        step(16);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(17);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(18);
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
        step(19);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(20);
        // Delete(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Delete");
        step(21);
        // Yes(A) = #pressed
        EN.SelectWindow("Registration");
        EN.ClickOn("Yes");
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
        // Log in(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Log in");
        step(25);
        // Login name(I) = Wigner
        EN.SelectWindow("Login");
        EN.SetValue("Login name", "Wigner");
        step(26);
        // Password(I) = 123456789012
        EN.SetValue("Password", "123456789012");
        step(27);
        // Next(A) = #pressed
        EN.ClickOn("Next");
        step(28);
        // Msg(O) = Incorrect name or password
        EN.VerifyValue("Msg", "Incorrect name or password");
        step(29);
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
        step(30);
        // URL(I) = "https://cloud.4test.io/pizza/"
        EN.SetValue("URL", "https://cloud.4test.io/pizza/");
        step(31);
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
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
        // Exit(A) = #pressed
        EN.SelectWindow("Main menu");
        EN.ClickOn("Exit");
        step(35);
        
        EN.EndTest();
    }
}