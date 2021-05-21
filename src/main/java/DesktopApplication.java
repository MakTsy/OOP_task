import modules.DesktopCotroller;

public abstract class DesktopApplication extends BaseApplication{

    private DesktopCotroller desktopCotroller;

    DesktopApplication() {
        this.desktopCotroller = new DesktopCotroller("Second_Desktop");
    }

    @Override
    public int startApp() {
        this.desktopCotroller.starter();
        return 100;
    }
}
