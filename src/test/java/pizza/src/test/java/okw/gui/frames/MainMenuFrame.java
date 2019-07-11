package okw.gui.frames;

import okw.OKW;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeBrowserChild;
import okw.gui.proxy.ChildWindowProxy;

@OKW( FN="Main menu" )
public class MainMenuFrame extends SeBrowserChild {
    
    @OKW( FN = "Exit" )
    public IGUIChildwindow exit = new ChildWindowProxy( "((((/)//*[@data-4test=\"Main menu\"]))//*[@data-4test=\"Exit\"])");
    
    @OKW( FN = "Register" )
    public IGUIChildwindow register = new ChildWindowProxy( "((((/)//*[@data-4test=\"Main menu\"]))//*[@data-4test=\"Register\"])");
    
    @OKW( FN = "Log out" )
    public IGUIChildwindow logOut = new ChildWindowProxy( "((((/)//*[@data-4test=\"Main menu\"]))//*[@data-4test=\"Log out\"])");
    
    @OKW( FN = "Log in" )
    public IGUIChildwindow logIn = new ChildWindowProxy( "((((/)//*[@data-4test=\"Main menu\"]))//*[@data-4test=\"Log in\"])");
    
    @OKW( FN = "Delete" )
    public IGUIChildwindow delete = new ChildWindowProxy( "((((/)//*[@data-4test=\"Main menu\"]))//*[@data-4test=\"Delete\"])");
    
    @OKW( FN = "Go shopping" )
    public IGUIChildwindow goShopping = new ChildWindowProxy( "((((/)//*[@data-4test=\"Main menu\"]))//*[@data-4test=\"Go shopping\"])");
    
    @OKW( FN = "Pay" )
    public IGUIChildwindow pay = new ChildWindowProxy( "((((/)//*[@data-4test=\"Main menu\"]))//*[@data-4test=\"Pay\"])");
    public MainMenuFrame() {
        setLocator("((/)//*[@data-4test=\"Main menu\"])");
    }
}