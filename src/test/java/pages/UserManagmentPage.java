package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserSleep;
import utilities.Driver;

import java.util.List;

public class UserManagmentPage {
    public UserManagmentPage() {
        PageFactory.initElements(Driver.setDriver(), this);
    }

    //@todo "Show Records" feature Web Elements and Methods starts from here
    @FindBy(xpath = "(//*[contains(text(),\"Users\")])[1]/..")
    private WebElement users_link;

    @FindBy(name = "tbl_users_length")
    private WebElement show_records;

    @FindBy(css = "h2#user_count")
    private WebElement users_count;
    public void click_on_users_link() {
        users_link.click();
    }

    public boolean verify_show_records_default_value(int default_value) {
        Select select = new Select(show_records);
        int value = (int) Integer.parseInt(select.getFirstSelectedOption().getText());
        System.out.println(value);
        return value == default_value;
    }

    public boolean verify_show_records_values(List<Integer> expectedValues) {
        Select select = new Select(show_records);
        List<WebElement> actualValues = select.getOptions();
        for (int i = 0; i < actualValues.size(); i++) {
            System.out.println(actualValues.get(i).getText() + " default");
            if (Integer.parseInt(actualValues.get(i).getText()) != expectedValues.get(i)) {
                show_records.click();
                BrowserSleep.time(1);
                return false;
            }
        }
        return true;
    }
    //@todo "Show Records" feature Web Elements and Methods ends here

    //@todo "Search Results" feature Web Elements and Methods starts from here

    @FindBy (css = "table#tbl_users thead th")
    private List<WebElement> table_headers;

    public boolean verify_table_headers(List<String> expectedTableHeaders){
        for(int i = 0;i < table_headers.size();i++){
            if(!table_headers.get(i).getText().equals(expectedTableHeaders.get(i))){
                return false;
            }
        }
        return true;
    }

    public int get_users_count(){
        String text = users_count.getText();
        System.out.println(text);
        return Integer.parseInt(text);
    }
}
