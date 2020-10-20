import java.util.Arrays;
import java.util.List;

public class BrowserFactory {

    List<String> versionsChrome = Arrays.asList("84", "85", "86");
    List<String> versionsFirefox = Arrays.asList("80", "81");
    List<String> versionsSafari = Arrays.asList("45", "46");

    public Browser createBrowser(String name, String version){
        switch (name.toUpperCase()){
            case ("CHROME") :
                if (versionsChrome.contains(version))
                    return new Chrome(version);
            case ("FIREFOX") :
                if (versionsFirefox.contains(version))
                    return new Firefox(version);
            case ("SAFARI") :
                if (versionsSafari.contains(version))
                    return new Safari(version);
            default:
                return new Chrome(versionsChrome.get(versionsChrome.size() - 1));
        }
    }
}
