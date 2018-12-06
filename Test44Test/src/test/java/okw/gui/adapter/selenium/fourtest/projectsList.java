package okw.gui.adapter.selenium.fourtest;

import java.util.ArrayList;

import okw.OKW;
import okw.gui.OKWLocator;
import okw.gui.adapter.selenium.*;

public class projectsList extends SeSelect
{
    @OKW( FN = "Projects List BUTTON" )
    public SeButton myProject = null;
    
    public projectsList(String Locator, OKWLocator... Locators)
    {
        super( Locator, Locators );

        myProject = new SeButton("");
    }
    /**
     *  @copydoc SeAnyChildWindow::SeAnyChildWindow(String,OKWLocator...)
     */

    /** \~german
     *  Methode wählt einen oder mehrere Werte in einer ListBox aus.
     *  
     *  Die Methode Select löscht bereits ausgewählte _nicht_.
     *  
     *  @param fps_Values Ein oder mehrere Werte, die ausgewählt werden sollen.
     *  \~
     *  @author Zoltan Hrabovszki
     *  @date 2013.04.11
     */
    @Override
    public void Select( ArrayList<String> fps_Values )
    {
        this.LogFunctionStartDebug( "Select", "fps_Values", fps_Values.toString() );

        try
        {
            // Waiting for the object. 
            // If it does not exist after TimeOut 
            // then the exception OKWGUIObjectNotFoundException is raised and terminated...
            this.WaitForMe();
            
            // "//div[@BuyBook</div>
            // Set Locator for the thButtone:
            // Create/Update the locator dynimacaly
            String newLocator = "$L1$//div[c­ont­ain­s(t­ext(), '" + fps_Values.get( 0 ) + "')]/.." ;
                
            myProject.setLocator( newLocator, this.getLOCATOR() );
            
            // ClickOn BUTTON
            myProject.ClickOn();
            
        }
        finally
        {
            this.LogFunctionEndDebug();
        }
    }    
}
