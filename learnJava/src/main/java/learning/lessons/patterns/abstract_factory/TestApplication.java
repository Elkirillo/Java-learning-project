package main.java.learning.lessons.patterns.abstract_factory;

public class TestApplication {
    private OrderCarForm form;

    public void drawOSForm() {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory guiFactory;
        if (osName.startsWith("win")) {
            guiFactory = new WindowsGUIFactory();
        } else if (osName.startsWith("linux")) {
            guiFactory = new LinuxGUIFactory();
        } else {
            return;
        }

        form = new OrderCarForm(guiFactory);
    }

    static public void main (String [] args) {
        TestApplication application = new TestApplication();
        application.drawOSForm();
    }
}
