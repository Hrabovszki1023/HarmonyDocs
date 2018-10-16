package okw.gui.frames;

import okw.OKW;
import okw.gui.adapter.selenium.*;


/**
 * Frame for https://4test.io:10443/login
 * 
 * @author zoltan
 */
@OKW( FN = "4Test Projects" )
public class frm4T_Projects extends SeBrowserChild
{
    @OKW( FN = "Project List" )
    public SeAnyChildWindow GoogleSignin = new SeAnyChildWindow("//div[contains(@class, 'projectsList')]"); 
    
    public frm4T_Projects()
    {
        setLocator( "//*[contains(@class, 'projectsWrapper')]/../../.." );
    }

}
