public abstract class Browser {

    protected String name;
    protected String version;

    public Browser(String name, String version) {
        this.name = name;
        this.version = version;
    }

    protected void run(){
        System.out.println("Запущен браузер " + name + " " + version);
    }

    protected abstract String test();

    public boolean equals(Object anObject){
        if(this == anObject)
            return true;
        if(anObject instanceof Browser){
            Browser anBrowser = (Browser) anObject;
            if(this.version == anBrowser.version && this.name == anBrowser.name)
                return true;
        }
        return false;
    }
}
