public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        // Simulate platform selection
        String os = "MAC"; // This could be dynamically detected
        if ("WINDOWS".equalsIgnoreCase(os)) {
            factory = new WindowsFactory();
        } else if ("MAC".equalsIgnoreCase(os)) {
            factory = new MacFactory();
        } else {
            throw new UnsupportedOperationException("Unknown OS");
        }

        // Create the application with the selected factory
        Application app = new Application(factory);
        app.paint();  // Output will differ based on platform
    }
}