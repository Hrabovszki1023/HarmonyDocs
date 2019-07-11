package okw.gui.proxy;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;

import okw.core.IOKW_FN;
import okw.gui.AnyChildwindow;
import okw.gui.AnyWinBase;
import okw.gui.IGUIChildwindow;
import okw.gui.adapter.selenium.SeAnyChildWindow;
import okw.gui.adapter.selenium.SeButton;
import okw.gui.adapter.selenium.SeImage;
import okw.gui.adapter.selenium.SeInputButton;
import okw.gui.adapter.selenium.SeInputCheckbox;
import okw.gui.adapter.selenium.SeInputRadio;
import okw.gui.adapter.selenium.SeInputText;
import okw.gui.adapter.selenium.SeLink;
import okw.gui.adapter.selenium.SeRadioList;
import okw.gui.adapter.selenium.SeSelect;
import okw.gui.adapter.selenium.SeTable;
import okw.gui.adapter.selenium.SeTextarea;
import okw.gui.adapter.selenium.webdriver.SeDriver;

public class ChildWindowProxy extends AnyWinBase implements IGUIChildwindow, IOKW_FN {
    private AnyChildwindow instance;
    private AnyChildwindow getInstance() {
        if (instance == null) {
            WebElement element = SeDriver.getInstance().getElement( "", this.getLocator() );
            if (matches(element, "//input[@type='checkbox']")) {
                instance = new SeInputCheckbox(getLocator());
            } else if (matches(element, "//input[@type='button']")) {
                instance = new SeInputButton(getLocator());
            } else if (matches(element, "//input[@type='radio']")) {
                instance = new SeInputRadio(getLocator());
            } else if (matches(element, "//input")) {
                instance = new SeInputText(getLocator());
            } else if (matches(element, "//a")) {
                instance = new SeLink(getLocator());
            } else if (matches(element, "//fieldset")) {
                instance = new SeRadioList(getLocator());
            } else if (matches(element, "//select")) {
                instance = new SeSelect(getLocator());
            } else if (matches(element, "//button")) {
                instance = new SeButton(getLocator());
            } else if (matches(element, "//table")) {
                instance = new SeTable(getLocator());
            } else if (matches(element, "//textarea")) {
                instance = new SeTextarea(getLocator());
            } else if (matches(element, "//img")) {
                instance = new SeImage(getLocator());
            } else {
                instance = new SeAnyChildWindow(getLocator());
            }
            
            instance.setFN(getFN());
            instance.setKN(getKN());
            instance.setParentFN(getParentFN());
        }
        return instance;
    };
    
    private boolean matches(WebElement element, String xpath) {
        return SeDriver.getInstance().getElements("", xpath).contains(element);
    }
    
    public ChildWindowProxy(String Locator) {
        super(Locator);
    }
    
    @Override
    public ArrayList<String> getCaption() {
        return getInstance().getCaption();
    }
    
    @Override
    public Boolean getHasFocus() {
        return getInstance().getHasFocus();
    }
    
    @Override
    public Boolean getIsActive() {
        return getInstance().getIsActive();
    }
    
    @Override
    public ArrayList<String> getLabel() {
        return getInstance().getLabel();
    }
    
    @Override
    public ArrayList<String> getPlaceholder() {
        return getInstance().getPlaceholder();
    }
    
    @Override
    public ArrayList<String> getTooltip() {
        return getInstance().getTooltip();
    }
    
    @Override
    public ArrayList<String> getValue() {
        return getInstance().getValue();
    }
    
    @Override
    public void ClickOn() {
        getInstance().ClickOn();
    }
    
    @Override
    public void DoubleClickOn() {
        getInstance().DoubleClickOn();
    }
    
    @Override
    public ArrayList<String> LogCaption() {
        return getInstance().LogCaption();
    }
    
    @Override
    public boolean LogExists() {
        return getInstance().LogExists();
    }
    
    @Override
    public boolean LogHasFocus() {
        return getInstance().LogHasFocus();
    }
    
    @Override
    public boolean LogIsActive() {
        return getInstance().LogIsActive();
    }
    
    @Override
    public ArrayList<String> LogLabel() {
        return getInstance().LogLabel();
    }
    
    @Override
    public ArrayList<String> LogPlaceholder() {
        return getInstance().LogPlaceholder();
    }
    
    @Override
    public ArrayList<String> LogSelected() {
        return getInstance().LogSelected();
    }
    
    @Override
    public ArrayList<String> LogTablecellValue(String COL, String ROW) {
        return getInstance().LogTablecellValue(COL, ROW);
    }
    
    @Override
    public ArrayList<String> LogTooltip() {
        return getInstance().LogTooltip();
    }
    
    @Override
    public ArrayList<String> LogValue() {
        return getInstance().LogValue();
    }
    
    @Override
    public ArrayList<String> MemorizeCaption() {
        return getInstance().MemorizeCaption();
    }
    
    @Override
    public boolean MemorizeExists() {
        return getInstance().MemorizeExists();
    }
    
    @Override
    public boolean MemorizeHasFocus() {
        return getInstance().MemorizeHasFocus();
    }
    
    @Override
    public boolean MemorizeIsActive() {
        return getInstance().MemorizeIsActive();
    }
    
    @Override
    public ArrayList<String> MemorizeLabel() {
        return getInstance().MemorizeLabel();
    }
    
    @Override
    public ArrayList<String> MemorizePlaceholder() {
        return getInstance().MemorizePlaceholder();
    }
    
    @Override
    public ArrayList<String> MemorizeSelectedValue() {
        return getInstance().MemorizeSelectedValue();
    }
    
    @Override
    public ArrayList<String> MemorizeTablecellValue(String COL, String ROW) {
        return getInstance().MemorizeTablecellValue(COL, ROW);
    }
    
    @Override
    public ArrayList<String> MemorizeTooltip() {
        return getInstance().MemorizeTooltip();
    }
    
    @Override
    public ArrayList<String> MemorizeValue() {
        return getInstance().MemorizeValue();
    }
    
    @Override
    public void Select(ArrayList<String> Val) {
        getInstance().Select(Val);
    }
    
    @Override
    public void SelectMenu() throws Exception {
        getInstance().SelectMenu();
    }
    
    @Override
    public void SelectMenu(ArrayList<String> Val) {
        getInstance().SelectMenu(Val);
    }
    
    @Override
    public void SelectTablecell(String COL, String ROW) {
        getInstance().SelectTablecell(COL, ROW);
    }
    
    @Override
    public void SetFocus() throws Exception {
        getInstance().SetFocus();
    }
    
    @Override
    public void SetValue(ArrayList<String> Val) {
        getInstance().SetValue(Val);
    }
    
    @Override
    public void TypeKey(ArrayList<String> Val) {
        getInstance().TypeKey(Val);
    }
    
    @Override
    public ArrayList<String> VerifyLabel() {
        return getInstance().VerifyLabel();
    }
    
    @Override
    public ArrayList<String> VerifyPlaceholder() {
        return getInstance().VerifyPlaceholder();
    }
    
    @Override
    public ArrayList<String> VerifyCaption() {
        return getInstance().VerifyCaption();
    }
    
    @Override
    public ArrayList<String> VerifyTooltip() {
        return getInstance().VerifyTooltip();
    }
    
    @Override
    public ArrayList<String> VerifyValue() {
        return getInstance().VerifyValue();
    }
    
    @Override
    public ArrayList<String> VerifySelectedValue() {
        return getInstance().VerifySelectedValue();
    }
    
    @Override
    public ArrayList<String> VerifyTablecellValue(String COL, String ROW) {
        return getInstance().VerifyTablecellValue(COL, ROW);
    }
    
    @Override
    public Boolean VerifyExists() {
        return getInstance().VerifyExists();
    }
    
    @Override
    public Boolean VerifyIsActive() {
        return getInstance().VerifyIsActive();
    }
    
    @Override
    public Boolean VerifyHasFocus() {
        return getInstance().VerifyHasFocus();
    }
    
    @Override
    public Integer getMaxLength() {
        return getInstance().getMaxLength();
    }
    
    @Override
    public Integer VerifyMaxLength() {
        return getInstance().VerifyMaxLength();
    }
    
}