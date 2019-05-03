package okw.gui.frames;

import okw.OKW;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.proxy.ChildWindowProxy;

@OKW( FN="Online shopping" )
public class OnlineShoppingFrame extends SeBrowserChild {
    
    @OKW( FN = "Alert" )
    public IGUIChildwindow alert = new ChildWindowProxy( "//*[@data-4test=\"Online shopping\"]//*[@data-4test=\"Alert\"]");
    public OnlineShoppingFrame() {
        setLocator("//*[@data-4test=\"Online shopping\"]");
    }
}