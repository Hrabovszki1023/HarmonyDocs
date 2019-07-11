package okw.gui.frames;

import okw.OKW;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.proxy.ChildWindowProxy;

@OKW( FN="Pizza Mexicana" )
public class PizzaMexicanaFrame extends SeBrowserChild {
    
    @OKW( FN = "ordered number" )
    public IGUIChildwindow orderedNumber = new ChildWindowProxy( "((((/)//*[@data-4test=\"Pizza Mexicana\"]))//*[@data-4test=\"ordered number\"])");
    
    @OKW( FN = "Plus" )
    public IGUIChildwindow plus = new ChildWindowProxy( "((((/)//*[@data-4test=\"Pizza Mexicana\"]))//*[@data-4test=\"Plus\"])");
    
    @OKW( FN = "Delete" )
    public IGUIChildwindow delete = new ChildWindowProxy( "((((/)//*[@data-4test=\"Pizza Mexicana\"]))//*[@data-4test=\"Delete\"])");
    public PizzaMexicanaFrame() {
        setLocator("((/)//*[@data-4test=\"Pizza Mexicana\"])");
    }
}