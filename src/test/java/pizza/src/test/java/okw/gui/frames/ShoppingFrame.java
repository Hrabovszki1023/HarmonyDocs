package okw.gui.frames;

import okw.OKW;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.proxy.ChildWindowProxy;

@OKW( FN="Shopping" )
public class ShoppingFrame extends SeBrowserChild {
    
    @OKW( FN = "Total price" )
    public IGUIChildwindow totalPrice = new ChildWindowProxy( "((((/)//*[@data-4test=\"Shopping\"]))//*[@data-4test=\"Total price\"])");
    
    @OKW( FN = "Pay" )
    public IGUIChildwindow pay = new ChildWindowProxy( "((((/)//*[@data-4test=\"Shopping\"]))//*[@data-4test=\"Pay\"])");
    
    @OKW( FN = "Warning" )
    public IGUIChildwindow warning = new ChildWindowProxy( "((((/)//*[@data-4test=\"Shopping\"]))//*[@data-4test=\"Warning\"])");
    
    @OKW( FN = "Giveaway" )
    public IGUIChildwindow giveaway = new ChildWindowProxy( "((((/)//*[@data-4test=\"Shopping\"]))//*[@data-4test=\"Giveaway\"])");
    public ShoppingFrame() {
        setLocator("((/)//*[@data-4test=\"Shopping\"])");
    }
}