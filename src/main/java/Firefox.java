public class Firefox extends Browser {

    public Firefox(String version){
        super("Firefox", version);
    }

    public String test() {
        return version + " " + name + " " +  (int) (Math.random() * 10);
    }
}