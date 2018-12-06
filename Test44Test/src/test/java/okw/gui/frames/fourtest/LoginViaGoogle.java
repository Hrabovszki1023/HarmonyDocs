package okw.gui.frames.fourtest;

import okw.OKW;
import okw.gui.adapter.selenium.*;


/**
 * Frame for https://4test.io:10443/login
 * 
 * @author zoltan
 */
@OKW( FN = "Login Via Google" )
public class LoginViaGoogle extends SeBrowserChild
{
    @OKW( FN = "Sign in with Google" )
    public SeButton GoogleSignin = new SeButton("//button[contains(@class, 'googlesignin')]"); 
    
    public LoginViaGoogle()
    {
        setLocator( "//*[contains(@class, 'loginArea')]/../../.." );
    }

}
