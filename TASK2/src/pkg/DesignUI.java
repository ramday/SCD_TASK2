package pkg;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

// DesignUI.java
public class DesignUI {
    
    public void designUI() {
        // Changing button color and font size
        Button button = new Button("Submit");
        button.setBackground(Color.RED); // Modify button color
        button.setFont(new Font("Arial", Font.BOLD, 14)); // Modify font size
    }
}
