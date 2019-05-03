package okw.gui.frames;

import okw.OKW;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.proxy.ChildWindowProxy;

@OKW( FN="Payment" )
public class PaymentFrame extends SeBrowserChild {
    
    @OKW( FN = "Price of delivery" )
    public IGUIChildwindow priceOfDelivery = new ChildWindowProxy( "//*[@data-4test=\"Payment\"]//*[@data-4test=\"Price of delivery\"]");
    
    @OKW( FN = "Total price" )
    public IGUIChildwindow totalPrice = new ChildWindowProxy( "//*[@data-4test=\"Payment\"]//*[@data-4test=\"Total price\"]");
    
    @OKW( FN = "Order" )
    public IGUIChildwindow order = new ChildWindowProxy( "//*[@data-4test=\"Payment\"]//*[@data-4test=\"Order\"]");
    
    @OKW( FN = "Go to login" )
    public IGUIChildwindow goToLogin = new ChildWindowProxy( "//*[@data-4test=\"Payment\"]//*[@data-4test=\"Go to login\"]");
    public PaymentFrame() {
        setLocator("//*[@data-4test=\"Payment\"]");
    }
}