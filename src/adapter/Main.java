package adapter;

public class Main {
    public static void main(String[] args) {
        WindowsGUI windowsGUI = new LinuxToWindowsAdapter();
        windowsGUI.drawIco();
    }
}
