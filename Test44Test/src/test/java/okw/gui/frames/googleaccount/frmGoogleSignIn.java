package okw.gui.frames.googleaccount;

import okw.OKW;
import okw.gui.adapter.selenium.*;


/**
 * Frame for https://4test.io:10443/login
 * 
 * @author zoltan
 */
@OKW( FN = "Google SignIn" )
public class frmGoogleSignIn extends SeBrowserChild
{
    @OKW( FN = "Email or PhoneNumber" )
    public SeInputText Email = new SeInputText("//input[@name='identifier']"); 

    @OKW( FN = "Password" )
    public SeInputText Password = new SeInputText("//input[@name='password']"); 

    @OKW( FN = "Next" )
    public SeInputText Next = new SeInputText("//div[@id='identifierNext' or @id='passwordNext']"); 
    
    @OKW( FN = "Error Message" )
    public SeAnyChildWindow EmailErrorMessage = new SeAnyChildWindow("//div[@id='password']/div[@class='LXRPh'] | //div[contains(@class, 'rFrNMe KSczvd uyaebd vHVGub zKHdkd sdJrJc Tyc9J')]/div[@class='LXRPh']"); 
    
    @OKW( FN = "Language" )
    public SeGoogleComboListBox Language = new SeGoogleComboListBox("//div[@id='lang-chooser']");     
    
    public frmGoogleSignIn()
    {
        setLocator( "//body" );
    }

}
