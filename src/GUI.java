// Copyright (C) 2021 Jarmo Hurri

// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.

// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

// gui extends frame and inherits all its methods (e.g., for setting
// size, adding components)

public class GUI extends JFrame
{
    // constructor will create all GUI components and set their properties
    public GUI (Application application)
    {
        super ("A simple GUI demo");
        this.application = application;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame properties
        setSize (400, 300);
        setLayout (new FlowLayout ());

        // menu bar with one item for quitting the program
        menuBar = new JMenuBar ();
        JMenu fileMenu = new JMenu ("File");
        JMenuItem quitItem = new JMenuItem ("Quit");
        quitItem.addActionListener ((ActionEvent e) ->
                System.exit (0));
        fileMenu.add (quitItem);
        menuBar.add (fileMenu);
        setJMenuBar (menuBar);

        // a label to show time as string, and timer for updating string
        timeLabel = new JLabel ();
        showTime ();
        add (timeLabel);


        setVisible(true);
    }
    public static void Timer() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                showTime();
            }
        };
        timer.scheduleAtFixedRate (task,0,100);
    }

    static int counter = 0;
    public static void showTime()
    {
        counter++;
        timeLabel.setText (String.valueOf(counter));
    }

    // format an int as a string so that the minimum length is 2
    // characters, zero-padded if needed

    private Application application;
    private JMenuBar menuBar;
    private JLabel stateLabel;
    private static JLabel timeLabel;
    private JButton flipButton;
}
