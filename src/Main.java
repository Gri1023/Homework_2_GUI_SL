import javax.swing.SwingUtilities;

public class Main
{
    public static void main (String[] args)
    {
        // use a lambda expression to define a method invoked
        // later (by event dispatcher)
        SwingUtilities.invokeLater (() -> new Application ());
    }
}