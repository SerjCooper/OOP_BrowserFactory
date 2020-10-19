public class BrowserFactory {
    public Browser createBrowser(String name, String version){
        switch (name.toUpperCase()){
            case ("CHROME") :
                return new Chrome(version);
            case ("FIREFOX") :
                return new Firefox(version);
            case ("SAFARI") :
                return new Safari(version);
            default:
                return new DefaultBrowser(name, version);
        }
    }
}
