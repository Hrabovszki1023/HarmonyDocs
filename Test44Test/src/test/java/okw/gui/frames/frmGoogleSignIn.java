package okw.gui.frames;

import okw.OKW;
import okw.gui.adapter.selenium.*;


/**
 * Frame for https://4test.io:10443/login
 * 
 * @author zoltan
 */
@OKW( FN = "Google Login" )
public class frmGoogleSignIn extends SeBrowserChild
{
    @OKW( FN = "Email or PhoneNumber" )
    public SeInputText Email = new SeInputText("//input[@name='identifier']"); 

    @OKW( FN = "Password" )
    public SeInputText Password = new SeInputText("//input[@name='password']"); 
    
    @OKW( FN = "Next" )
    public SeInputText Next = new SeInputText("//div[@id='identifierNext' or @id='passwordNext']"); 
    
    
    public frmGoogleSignIn()
    {
        setLocator( "//body" );
    }

}
