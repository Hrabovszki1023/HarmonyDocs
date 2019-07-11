package okw.gui.frames;

import okw.OKW;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.proxy.ChildWindowProxy;

@OKW( FN="Login" )
public class LoginFrame extends SeBrowserChild {
    
    @OKW( FN = "Login name" )
    public IGUIChildwindow loginName = new ChildWindowProxy( "((((/)//*[@data-4test=\"Login\"]))//*[@data-4test=\"Login name\"])");
    
    @OKW( FN = "Password" )
    public IGUIChildwindow password = new ChildWindowProxy( "((((/)//*[@data-4test=\"Login\"]))//*[@data-4test=\"Password\"])");
    
    @OKW( FN = "Next" )
    public IGUIChildwindow next = new ChildWindowProxy( "((((/)//*[@data-4test=\"Login\"]))//*[@data-4test=\"Next\"])");
    
    @OKW( FN = "Msg" )
    public IGUIChildwindow msg = new ChildWindowProxy( "((((/)//*[@data-4test=\"Login\"]))//*[@data-4test=\"Msg\"])");
    public LoginFrame() {
        setLocator("((/)//*[@data-4test=\"Login\"])");
    }
}