package okw.gui.frames.fourtest;

import okw.OKW;
import okw.gui.adapter.selenium.*;


/**
 * Frame for https://4test.io:10443/login
 * 
 * @author zoltan
 */
@OKW( FN = "4Test Login" )
public class Login extends SeBrowserChild
{
    @OKW( FN = "Select user" )
    public SeSelect SelectUser = new SeSelect("//select[contains(@class, 'loginUserSelect')]"); 
    
    @OKW( FN = "Log in" )
    public SeButton GoogleSignin = new SeButton("//div[contains(@class, 'loginArea')]//button"); 
    
    public Login()
    {
        setLocator( "//div[contains(@class, 'loginArea')]/../../.." );
    }

}
