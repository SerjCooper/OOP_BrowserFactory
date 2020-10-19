public class DefaultBrowser extends Browser {

    public DefaultBrowser(String name, String version) {
        super(name, version);
    }

    public String test() {
        return name + " " + version;
    }
}
