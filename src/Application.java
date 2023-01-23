import javax.swing.Timer;
import java.awt.event.ActionEvent;

public class Application
{
    // constructor is run at the start of the program
    public Application ()
    {
        gui = new GUI (this);
        state = false;
        gui.Timer();
        // create and start a timer: timers can be used to perform
        // functions without user-initiated events; the given lambda


    }

    // the "state" of this simple application is just a boolean, and
    // this method will change the state by flipping the value

    private GUI gui;
    private boolean state;
    private Timer timer;
}
