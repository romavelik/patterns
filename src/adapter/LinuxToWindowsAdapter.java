package adapter;

public class LinuxToWindowsAdapter implements WindowsGUI {
    LinuxGUI linux = new LinuxGUI();

    @Override
    public void drawIco() {
        linux.drawLinuxIco();
    }

    @Override
    public void drawFrame() {
        linux.drawLinuxFrame();
    }
}
