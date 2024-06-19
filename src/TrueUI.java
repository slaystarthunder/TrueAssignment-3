import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.*;

public class TrueUI implements ActionListener {


// I've tried to keep the same structure in the code, but have removed a lot of verbose and unnecessary code and repetitions

    private final JButton[] buttons = new JButton[7];
    private final JTextArea[] fields = new JTextArea[7];
    private final JTextField[] sendFields = new JTextField[7];
    private final JPanel[] panels = new JPanel[7];
    private final JPanel[] specialPanels = new JPanel[7];

    private static final String[] dayNames = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};

    TrueUI() {
        BoxLayout();
    }


    public LocalDate[] getWeekDays(LocalDate today) {
        LocalDate[] weekDays = new LocalDate[7];
        DayOfWeek[] dayOfWeekValues = DayOfWeek.values();

        for (int i = 0; i < 7; i++) {
            int daysSince = today.getDayOfWeek().getValue() - dayOfWeekValues[i].getValue();
            weekDays[i] = today.plusDays(-daysSince);
        }

        return weekDays;
    }

    public void BoxLayout() {
        LocalDate today = LocalDate.now();
        LocalDate[] weekDays = getWeekDays(today);

        JFrame frame = new JFrame("Kalander");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

        for (int i = 0; i < 7; i++) {
            panels[i] = new JPanel();
            panels[i].setLayout(new BorderLayout());
            specialPanels[i] = new JPanel();
            specialPanels[i].setLayout(new BoxLayout(specialPanels[i], BoxLayout.Y_AXIS));

            JLabel label = new JLabel(dayNames[i] + " " + weekDays[i].getDayOfMonth() + " " + weekDays[i].getMonth() + " | ");
            panels[i].add(label, BorderLayout.NORTH);

            fields[i] = new JTextArea("\n");
            fields[i].setLineWrap(true);
            fields[i].setWrapStyleWord(true);
            if (today.equals(weekDays[i])) {
                fields[i].setBackground(Color.LIGHT_GRAY);
            }
            panels[i].add(fields[i], BorderLayout.CENTER);

            sendFields[i] = new JTextField("");
            specialPanels[i].add(sendFields[i], BorderLayout.SOUTH);

            buttons[i] = new JButton("Skapa event");
            buttons[i].addActionListener(this::actionPerformed);
            specialPanels[i].add(buttons[i], BorderLayout.SOUTH);

            panels[i].add(specialPanels[i], BorderLayout.SOUTH);
            frame.add(panels[i]);
        }

        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 7; i++) {
            if (e.getSource() == buttons[i]) {
                fields[i].append(sendFields[i].getText() + "\n");
                sendFields[i].setText("");
                fields[i].setLineWrap(true);
                fields[i].setWrapStyleWord(true);
            }
        }
    }
}
