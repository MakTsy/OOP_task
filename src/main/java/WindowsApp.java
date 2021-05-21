public class WindowsApp extends DesktopApplication {

    private String osVersion;

    public WindowsApp(String osVersion) {
        this.osVersion = osVersion;
    }

    @Override
    public void whoAmI() {
        System.out.println("osVersion windows: " + this.osVersion);
        System.out.println(this.startApp());
        this.isAlive();
    }
}
