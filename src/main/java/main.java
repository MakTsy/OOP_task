public class main {
    public static void main(String[] args) {
        LinuxApp linuxApp = new LinuxApp("10.9.8.7");
        WindowsApp windowsApp = new WindowsApp("7.8.9.10");
        WebApplication webApplication = new WebApplication();

        linuxApp.whoAmI();
        windowsApp.whoAmI();
        webApplication.whoAmI();
    }
}
