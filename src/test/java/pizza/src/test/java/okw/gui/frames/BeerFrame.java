package okw.gui.frames;

import okw.OKW;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.proxy.ChildWindowProxy;

@OKW( FN="Beer" )
public class BeerFrame extends SeBrowserChild {
    
    @OKW( FN = "Plus" )
    public IGUIChildwindow plus = new ChildWindowProxy( "((((/)//*[@data-4test=\"Beer\"]))//*[@data-4test=\"Plus\"])");
    
    @OKW( FN = "ordered number" )
    public IGUIChildwindow orderedNumber = new ChildWindowProxy( "((((/)//*[@data-4test=\"Beer\"]))//*[@data-4test=\"ordered number\"])");
    
    @OKW( FN = "Delete" )
    public IGUIChildwindow delete = new ChildWindowProxy( "((((/)//*[@data-4test=\"Beer\"]))//*[@data-4test=\"Delete\"])");
    public BeerFrame() {
        setLocator("((/)//*[@data-4test=\"Beer\"])");
    }
}