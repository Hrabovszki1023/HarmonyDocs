package okw.gui.frames;

import okw.OKW;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.proxy.ChildWindowProxy;

@OKW( FN="Registration" )
public class RegistrationFrame extends SeBrowserChild {
    
    @OKW( FN = "Name" )
    public IGUIChildwindow name = new ChildWindowProxy( "((((/)//*[@data-4test=\"Registration\"]))//*[@data-4test=\"Name\"])");
    
    @OKW( FN = "Password" )
    public IGUIChildwindow password = new ChildWindowProxy( "((((/)//*[@data-4test=\"Registration\"]))//*[@data-4test=\"Password\"])");
    
    @OKW( FN = "Second psw" )
    public IGUIChildwindow secondPsw = new ChildWindowProxy( "((((/)//*[@data-4test=\"Registration\"]))//*[@data-4test=\"Second psw\"])");
    
    @OKW( FN = "Next" )
    public IGUIChildwindow next = new ChildWindowProxy( "((((/)//*[@data-4test=\"Registration\"]))//*[@data-4test=\"Next\"])");
    
    @OKW( FN = "Message" )
    public IGUIChildwindow message = new ChildWindowProxy( "((((/)//*[@data-4test=\"Registration\"]))//*[@data-4test=\"Message\"])");
    
    @OKW( FN = "Yes" )
    public IGUIChildwindow yes = new ChildWindowProxy( "((((/)//*[@data-4test=\"Registration\"]))//*[@data-4test=\"Yes\"])");
    public RegistrationFrame() {
        setLocator("((/)//*[@data-4test=\"Registration\"])");
    }
}