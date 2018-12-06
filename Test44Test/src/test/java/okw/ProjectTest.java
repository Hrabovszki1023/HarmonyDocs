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
public class ProjectTest
{

    private static Log2HTML myLog2HTML = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        Logger_Sngltn.getInstance();
        // Reset des Loggers: Alle geladenen Instanzen löschen
        Logger_Sngltn.init();

        myLog2HTML = new Log2HTML("target/ProjektTest_Chrome.html");
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
   *  Prüft, ob 4Test startet.
   *
   * \~
   * \author Zoltan Hrabovszki
   * \date 2018.10.16
   */
  @Test
  public void ST_Project() throws Exception
  {
    EN.BeginTest( name.getMethodName() );
    EN.StartApp( "Chrome" );
    EN.TypeKey( "URL", "https://4test.io:20443/login" );

    EN.SelectWindow( "4Test Login" );
    EN.Select( "Select user", "User 5" );
    EN.ClickOn( "Log in" );
        
    EN.SelectWindow( "4Test Projects" );
    EN.VerifyExists( "Project List", "YES" );

    EN.VerifyExists( "Create New Project", "YES" );
    EN.VerifyCaption( "Create New Project", "Create New Project" );
    
    EN.VerifyExists( "Import", "YES" );
    EN.VerifyCaption( "Import", "Import" );    

    EN.StopApp( "Chrome" );
    EN.EndTest();
   }
}
