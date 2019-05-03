package okw.gui.frames;

import okw.OKW;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.proxy.ChildWindowProxy;

@OKW( FN="Pizza Rucola XXL" )
public class PizzaRucolaXxlFrame extends SeBrowserChild {
    
    @OKW( FN = "Plus" )
    public IGUIChildwindow plus = new ChildWindowProxy( "//*[@data-4test=\"Pizza Rucola XXL\"]//*[@data-4test=\"Plus\"]");
    
    @OKW( FN = "Delete" )
    public IGUIChildwindow delete = new ChildWindowProxy( "//*[@data-4test=\"Pizza Rucola XXL\"]//*[@data-4test=\"Delete\"]");
    
    @OKW( FN = "ordered number" )
    public IGUIChildwindow orderedNumber = new ChildWindowProxy( "//*[@data-4test=\"Pizza Rucola XXL\"]//*[@data-4test=\"ordered number\"]");
    public PizzaRucolaXxlFrame() {
        setLocator("//*[@data-4test=\"Pizza Rucola XXL\"]");
    }
}