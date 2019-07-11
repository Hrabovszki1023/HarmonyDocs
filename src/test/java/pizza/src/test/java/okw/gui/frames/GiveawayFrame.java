package okw.gui.frames;

import okw.OKW;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.proxy.ChildWindowProxy;

@OKW( FN="Giveaway" )
public class GiveawayFrame extends SeBrowserChild {
    
    @OKW( FN = "Beer" )
    public IGUIChildwindow beer = new ChildWindowProxy( "((((/)//*[@data-4test=\"Giveaway\"]))//*[@data-4test=\"Beer\"])");
    
    @OKW( FN = "Coke" )
    public IGUIChildwindow coke = new ChildWindowProxy( "((((/)//*[@data-4test=\"Giveaway\"]))//*[@data-4test=\"Coke\"])");
    public GiveawayFrame() {
        setLocator("((/)//*[@data-4test=\"Giveaway\"])");
    }
}