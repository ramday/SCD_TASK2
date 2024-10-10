// DesignUI.java
import java.awt.*;

public class DesignUI {

    public void designUI() {
        // Create a new panel with a different layout (e.g., BorderLayout)
        Panel panel = new Panel();
        panel.setLayout(new BorderLayout()); // Change layout to BorderLayout for a better UI

        // Create components
        Button submitButton = new Button("Submit");
        Button cancelButton = new Button("Cancel");
        Label nameLabel = new Label("Enter Name:");
        TextField nameField = new TextField(20); // Input field for name

        // Add components to the layout
        panel.add(nameLabel, BorderLayout.NORTH);
        panel.add(nameField, BorderLayout.CENTER);
        panel.add(submitButton, BorderLayout.EAST);
        panel.add(cancelButton, BorderLayout.WEST);

        // Display the panel (this part would depend on the rest of your UI framework)
        Frame frame = new Frame("New Layout Design");
        frame.add(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
