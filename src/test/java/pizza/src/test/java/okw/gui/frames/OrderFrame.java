package okw.gui.frames;

import okw.OKW;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.proxy.ChildWindowProxy;

@OKW( FN="Order" )
public class OrderFrame extends SeBrowserChild {
    
    @OKW( FN = "Message" )
    public IGUIChildwindow message = new ChildWindowProxy( "((((/)//*[@data-4test=\"Order\"]))//*[@data-4test=\"Message\"])");
    public OrderFrame() {
        setLocator("((/)//*[@data-4test=\"Order\"])");
    }
}