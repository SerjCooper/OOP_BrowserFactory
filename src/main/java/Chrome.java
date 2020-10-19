public class Chrome extends Browser {
    public Chrome(String version){
        super("Chrome", version);
    }

    public String test() {
        return name + " " + version;
    }
}
