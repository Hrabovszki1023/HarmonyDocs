package okw.gui.adapter.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import okw.gui.adapter.selenium.SeAnyChildWindow;
import okw.gui.adapter.selenium.webdriver.SeDriver;
import okw.gui.OKWLocator;

public class SeGoogleComboListBox extends SeAnyChildWindow
{

    /** 
     * \~german
     * Konstruktor der Klasse. iframeID wird auf den Wert "" (empty string) gesetzt.
     *  
     *  @param Locator definiert die Objekterkennungseigenschaft des Objektes. Dieser wird als XPATH angegeben
     *  @param Locators Locatoren z.B. von Elternobjekten, die zu einem gesamt Locator verkettet werden sollen.
     *  
     *  \~english
     *  
     *  \~
     *  @author Zoltán Hrabovszki
     *  @date 2013.05.03
     */
     public SeGoogleComboListBox( String Locator, OKWLocator... Locators )
     {
         super( Locator, Locators );
         this.iframeID = "";
     }

     /** 
      * \~german
      * Konstruktor der Klasse. iframeID wird auf den Wert des Parameters fpIframeID gesetzt.
      * 
      *  @param IframeID ID des iframes in dem Sich das GUI-Objekt befindet. "" falls 
      *  @param Locator definiert die Objekterkennungseigenschaft des Objektes. Dieser wird als XPATH angegeben
      *  @param Locators Locatoren (z.B. von Elternobjekten), die mit dem fpLocator verkettet werden sollen.
      *  
      *  \~english
      *  
      *  \~
      *  @author Zoltán Hrabovszki
      */
     public SeGoogleComboListBox( String IframeID, String Locator, OKWLocator... Locators )
     {
         super( Locator, Locators );
         this.iframeID = IframeID;
     }
     
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
             // Warten auf das Objekt. Wenn es nicht existiert wird mit OKWGUIObjectNotFoundException beendet...
             this.WaitForMe();
             
             this.Me().click();

             try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             
             // String Selector = "//content[contains(text(),'" + fps_Values.get( 0 ) + "')]";
             String Selector = "//content";
             
             List<WebElement> Elements = this.Me().findElements( By.xpath( Selector ) );
             
             // Der Wievielte eintrag ist es?
             int Counter = 1;
             
             for (WebElement element : Elements) {
                 if ( element.getText().contains( fps_Values.get( 0 ) ) ) break;
                 else Counter++;
             }
             
             // Auswahl an den Anfang setzen...
//             for (int i=1; i<=20; i++ )
//             {
//                 this.Me().
//                 this.Me().sendKeys(Keys.ARROW_UP);
//             }
                 
             // Das rictige element auswählen...
             for (int i=1; i<=Counter; i++ )
             {
                 this.Me().sendKeys(Keys.ARROW_DOWN);
             }
         }
         finally
         {
             this.LogFunctionEndDebug();
         }
     }
}
