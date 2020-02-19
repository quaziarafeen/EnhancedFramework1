package homepage.webelement;

public class HomePageWebelemnts {
    /**
     * Given we are in Amazon Homepage
     * Enter mobile phone in searchbox
     * click on the searchButton
     * validate the searchResult
     */
    public static final String searchFieldWebElement= "//input[@id='twotabsearchtextbox']";
    public static final String searchbuttonWebElement= "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']";
    public static final String searchResultValidateForMobilePhone= "//a[contains(text(),'\"mobile phone\"')]";
}
