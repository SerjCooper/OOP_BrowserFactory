import org.testng.annotations.Test;

public class SomeTest {

    @Test
    public void TestBrowser(){
        BrowserFactory browserFactory = new BrowserFactory();

        Browser chroBro = browserFactory.createBrowser("Chrome", "12.23");
        Browser chroBro2 = browserFactory.createBrowser("Chrome", "12.23");
        Browser fireBro = browserFactory.createBrowser("firefox", "12.23");
        Browser safBro = browserFactory.createBrowser("safari", "12.23");
        Browser defBro = browserFactory.createBrowser("kakoy-to browser", "100500");

        TestUi testUi = new TestUi(chroBro);
        testUi.runBrowser();
        System.out.println(testUi.testBrowser());

        TestUi testUi2 = new TestUi(fireBro);
        testUi2.runBrowser();
        System.out.println(testUi2.testBrowser());

        TestUi testUi3 = new TestUi(safBro);
        testUi3.runBrowser();
        System.out.println(testUi3.testBrowser());

        TestUi testUi4 = new TestUi(defBro);
        testUi4.runBrowser();
        System.out.println(testUi4.testBrowser());

        testUi.compareBrowsers(chroBro, chroBro2);
        testUi.compareBrowsers(chroBro, fireBro);
    }
}
