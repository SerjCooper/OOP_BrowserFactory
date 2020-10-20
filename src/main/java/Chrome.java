public class Chrome extends Browser {
    private int chromeVersion;

    public Chrome(String version){
        super("Chrome", version);
        this.chromeVersion = Integer.parseInt(version);
    }

    public String test() {
        return name + " " + version;
    }

    public int getChromeVersion() {
        return chromeVersion;
    }

    public int execute() {
        return getChromeVersion();
    }
}
