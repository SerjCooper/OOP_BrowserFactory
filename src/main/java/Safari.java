public class Safari extends Browser {
    private int safariVersion;

    public Safari(String version){
        super("Safari", version);
        this.safariVersion = Integer.parseInt(version);
    }

    public String test() {
        return "Apple " + version + " " + name;
    }

    public int getSafariVersion(){
        return safariVersion;
    }

    public int execute() {
        return getSafariVersion();
    }
}
