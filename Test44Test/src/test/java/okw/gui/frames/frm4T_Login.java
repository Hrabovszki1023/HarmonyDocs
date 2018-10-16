package okw.gui.frames;

import okw.OKW;
import okw.gui.adapter.selenium.*;


/**
 * Frame for https://4test.io:10443/login
 * 
 * @author zoltan
 */
@OKW( FN = "4Test Login" )
public class frm4T_Login extends SeBrowserChild
{
    @OKW( FN = "Sign in with Google" )
    public SeButton GoogleSignin = new SeButton("//button[contains(@class, 'googlesignin')]"); 
    
    public frm4T_Login()
    {
        setLocator( "//*[contains(@class, 'loginArea')]/../../.." );
    }

}
