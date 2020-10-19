import org.testng.Assert;

public class TestUi {
    private Browser browser;

    public TestUi(Browser browser){
        this.browser = browser;
    }

    public void runBrowser(){
        browser.run();
    }

    public String testBrowser(){
        return browser.test();
    }

    public void compareBrowsers(Browser firstBro, Browser secondBro){
        Assert.assertEquals(firstBro, secondBro);
    }
}
