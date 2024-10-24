public class Application {
    private Button button;
    private Checkbox checkbox;

    // Constructor takes the GUIFactory to create products
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}