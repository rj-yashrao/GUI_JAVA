//Working with Java Swing, which is used to create Graphical User Interfaces (GUIs) in Java.

//Java comes with built-in tools to create GUIs that means there is no need to download anything extra!
import javax.swing.*;  // Import the Swing library for GUI components

//Create a public class and add a main method to begin.
public class GUI_JAVA {
    public static void main(String[] args) {

        // JFrame is a Swing component that allows you to set up your GUI so it shows up when you run your program

        // Create a new window (JFrame) with a title Used JFrame for Main Window
        JFrame frame = new JFrame("My First GUI");

        // Set the size of the window (width: 300px, height: 150px)
        frame.setSize(300, 150);

        // Make sure the application exits when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use absolute positioning (no layout manager)
        frame.setLayout(null); // absolute positioning

        // -------------------
        // Adding different types of components to make your app interactive:
        //  Each component (like buttons, text boxes, etc.) needs to be:
        //  1.Created (i.e., initialized)
        //  2.Positioned using .setBounds(x, y, width, height)
        // -------------------

        // Text field
        // Create a text field where the user can type their name
        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 150, 25);

        // Button
        // Create a button labeled "Click Me"
        JButton button = new JButton("Click Me");
        button.setBounds(180, 20, 90, 25);

        // Label
        // Create a label that displays a message
        JLabel label = new JLabel("Hello!");
        label.setBounds(20, 60, 250, 25);

        // Add components to the frame
        //   Once your components are created and positioned, you still need to attach them to the window using .add():
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        // Button action
        // When the button is clicked, get the text from the text field
        // and update the label with a personalized greeting
        button.addActionListener(e -> {
            String name = textField.getText(); // Get user input
            label.setText("Hello, " + name + "!"); // Update label
        });

        // Make frame visible after adding components
        frame.setVisible(true);
    }
}
