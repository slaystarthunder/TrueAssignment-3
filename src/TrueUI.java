import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.*;

public class TrueUI implements ActionListener {

    // I've tried to keep the same structure in the code, but have removed a lot of verbose and unnecessary code and repetitions

    // Arrays of buttons, fields, and panels instead of hardcoding all of them seven times each.
    private final JButton[] buttons = new JButton[7];
    private final JTextArea[] fields = new JTextArea[7];
    private final JTextField[] sendFields = new JTextField[7];
    private final JPanel[] panels = new JPanel[7];
    private final JPanel[] specialPanels = new JPanel[7];

    // Array holding the names of the days of the week.
    private static final String[] dayNames = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};

    // Constructor to initialize the UI.
    TrueUI() {
        initializeUI();
    }

    // The days in the calendar are calculated by getting a numerical value from a variable that contains the day number (1-7, mon-sun).
    public LocalDate[] getWeekDays(LocalDate today) {
        LocalDate[] weekDays = new LocalDate[7];
        DayOfWeek[] dayOfWeekValues = DayOfWeek.values();

        /* This for loop uses the value of the local date array variable to calculate how many days
         * in numerical values have passed since the current day. Today's 'day' is always 0, the day
         * before that is -1, the day after that is +1, etc.
         */
        for (int i = 0; i < 7; i++) {
            int daysSince = today.getDayOfWeek().getValue() - dayOfWeekValues[i].getValue();
            weekDays[i] = today.plusDays(-daysSince);
        }

        return weekDays;
    }

    // Method to initialize the UI components and layout.
    public void initializeUI() {
        LocalDate today = LocalDate.now();
        LocalDate[] weekDays = getWeekDays(today);

        JFrame frame = new JFrame("Kalender");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

        // Setting up the UI for each day of the week.
        for (int i = 0; i < 7; i++) {
            panels[i] = new JPanel();
            panels[i].setLayout(new BorderLayout());

            specialPanels[i] = new JPanel();
            specialPanels[i].setLayout(new BoxLayout(specialPanels[i], BoxLayout.Y_AXIS));

            // Adding a label with the day name and date.
            JLabel label = new JLabel(dayNames[i] + " " + weekDays[i].getDayOfMonth() + " " + weekDays[i].getMonth() + " | ");
            panels[i].add(label, BorderLayout.NORTH);

            // Adding a text area for the day's events.
            fields[i] = new JTextArea("\n");
            fields[i].setLineWrap(true);
            fields[i].setWrapStyleWord(true);
            if (today.equals(weekDays[i])) {
                fields[i].setBackground(Color.LIGHT_GRAY); // Highlighting the current day.
            }
            panels[i].add(fields[i], BorderLayout.CENTER);

            // Adding a text field for inputting new events.
            sendFields[i] = new JTextField("");
            specialPanels[i].add(sendFields[i], BorderLayout.SOUTH);

            // Adding a button to create a new event.
            buttons[i] = new JButton("Skapa event");
            buttons[i].addActionListener(this::actionPerformed);
            specialPanels[i].add(buttons[i], BorderLayout.SOUTH);

            // Adding the special panel (containing text field and button) to the main panel.
            panels[i].add(specialPanels[i], BorderLayout.SOUTH);

            // Adding the main panel to the frame.
            frame.add(panels[i]);
        }

        // Setting frame properties.
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Method to handle button click events.
    @Override
    public void actionPerformed(ActionEvent e) {
        // Looping through each button to find which one was clicked.
        for (int i = 0; i < 7; i++) {
            if (e.getSource() == buttons[i]) {
                // Adding the text from the input field to the text area.
                fields[i].append(sendFields[i].getText() + "\n");
                sendFields[i].setText(""); // Clearing the input field after adding the event.
                fields[i].setLineWrap(true); // Ensuring text area line wrap.
                fields[i].setWrapStyleWord(true); // Ensuring text area word wrap.
            }
        }
    }
}
