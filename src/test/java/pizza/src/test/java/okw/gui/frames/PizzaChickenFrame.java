package okw.gui.frames;

import okw.OKW;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.proxy.ChildWindowProxy;

@OKW( FN="Pizza Chicken" )
public class PizzaChickenFrame extends SeBrowserChild {
    
    @OKW( FN = "Plus" )
    public IGUIChildwindow plus = new ChildWindowProxy( "((((/)//*[@data-4test=\"Pizza Chicken\"]))//*[@data-4test=\"Plus\"])");
    public PizzaChickenFrame() {
        setLocator("((/)//*[@data-4test=\"Pizza Chicken\"])");
    }
}