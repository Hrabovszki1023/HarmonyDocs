package okw;

import okw.core.EN;
import okw.log.Logger_Sngltn;
import okw.log.log2html.Log2HTML;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
* \~
* @ingroup groupSeleniumChildGUIAdapterTests
* 
* @author zoltan
*/
public class LogonTest
{

    private static Log2HTML myLog2HTML = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        Logger_Sngltn.getInstance();
        // Reset des Loggers: Alle geladenen Instanzen löschen
        Logger_Sngltn.init();

        myLog2HTML = new Log2HTML("target/LogonTest_Chrome_Test.html");
        Logger_Sngltn.getInstance().addLogger(myLog2HTML);
        Logger_Sngltn.getInstance().setDebugMode(false);
    }

    @After
    public void afterChrome() throws Exception
    {
        Runtime rt = Runtime.getRuntime();
        
        if (System.getProperty("os.name").toLowerCase().indexOf("windows") > -1) rt.exec("taskkill Chrome");
        else rt.exec("pkill -f Chrome");
          
        Thread.sleep( 1000 );
    }
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
        myLog2HTML.Result2HTML();
    }

    
    
  @Rule
  public TestName         name = new TestName();



  /** \~german
   *  Prüft, ob 4Test Startet.
   *
   * \~
   * \author Zoltan Hrabovszki
   * \date 2018.10.16
   */
  @Test
  public void tc_StartTest() throws Exception
  {
    EN.BeginTest( name.getMethodName() );
    EN.StartApp( "Chrome" );
    EN.TypeKey( "URL", "https://4test.io:10443/login" );

    EN.SelectWindow( "4Test Login" );
    EN.VerifyExists( "Sign in with Google", "YES" );
    EN.ClickOn( "Sign in with Google" );
    
    EN.SelectWindow( "Google Login" );
    EN.SetValue( "Email or PhoneNumber", "fourtest003@gmail.com" );    
    EN.ClickOn( "Next" );
    EN.SetValue( "Password", "four-test3" );
    EN.ClickOn( "Next" );
    EN.VerifyExists( "Next", "NO" );
    
    EN.SelectWindow( "4Test Projects" );
    EN.VerifyExists( "Project List", "YES" );

    EN.StopApp( "Chrome" );
    EN.EndTest();
}
}
