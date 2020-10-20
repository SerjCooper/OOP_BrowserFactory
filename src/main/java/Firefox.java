public class Firefox extends Browser {
    private int firefoxVersion;

    public Firefox(String version){
        super("Firefox", version);
        this.firefoxVersion = Integer.parseInt(version);
    }

    public String test() {
        return version + " " + name + " " +  (int) (Math.random() * 10);
    }

    public int getFirefoxVersion(){
        return firefoxVersion;
    }

    public int execute() {
        return getFirefoxVersion();
    }
}