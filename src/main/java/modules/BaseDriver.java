package modules;

public abstract class BaseDriver {
    protected String name;
    public abstract int configModule();

    public void starter() {
        configModule();
        System.out.println(this.name + ": I am working...");
    }
}
