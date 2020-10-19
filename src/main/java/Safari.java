public class Safari extends Browser {

    public Safari(String version){
        super("Safari", version);
    }

    public String test() {
        return "Apple " + version + " " + name;
    }
}
