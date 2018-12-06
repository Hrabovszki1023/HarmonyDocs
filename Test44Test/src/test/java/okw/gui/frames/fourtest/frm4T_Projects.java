package okw.gui.frames.fourtest;

import okw.OKW;
import okw.gui.adapter.selenium.*;
import okw.gui.adapter.selenium.fourtest.projectsList;


/**
 * Frame for https://4test.io:10443/project/
 * 
 * @author zoltan
 */
@OKW( FN = "4Test Projects" )
public class frm4T_Projects extends SeBrowserChild
{
    @OKW( FN = "Project List" )
    public projectsList myList = new projectsList("//div[contains(@class, 'projectsList')]");
    
    /**
     * <a class="button---17Y0b" href="/project/new">Create New Project</a>
     */
    @OKW( FN = "Create New Project" )
    public SeLink createNewProject= new SeLink( "//a[contains(@class, 'button') and @href='/project/new']" );

    /**
     * <a class="button---17Y0b" href="/project/new">Create New Project</a>
     */
    @OKW( FN = "Import" )
    public SeLink myImport= new SeLink( "//a[contains(@class, 'button') and @href='/project/import']" );

    public frm4T_Projects()
    {
        setLocator( "//*[contains(@class, 'projectsWrapper')]/../../.." );
    }

}
