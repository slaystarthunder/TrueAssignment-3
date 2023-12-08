import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class TrueUI implements ActionListener{

        int counter;
        private JButton button;
        private JButton button2;
        private JButton button3;
        private JButton button4;
        private JButton button5;
        private JButton button6;
        private JButton button7;
        private JTextArea field;

        private JTextArea field2;
    private JTextArea field3;
    private JTextArea field4;
    private JTextArea field5;
    private JTextArea field6;
    private JTextArea field7;
    private JTextField Sendfield;
    private JTextField Sendfield2;
    private JTextField Sendfield3;
    private JTextField Sendfield4;
    private JTextField Sendfield5;
    private JTextField Sendfield6;
    private JTextField Sendfield7;

    TrueUI(){
        BoxLayout();
        }
       public void BoxLayout(){
         //  Calendar.getInstance();
         //  int Trueweekday =  Calendar.DAY_OF_WEEK;
           LocalDate today = LocalDate.now();

           LocalDate tTrueoday = LocalDate.now();



           //not motnh stuff anymore
           int daysSinceMonday = tTrueoday.getDayOfWeek().getValue() - 1;
           LocalDate mondayOfWeek = tTrueoday.plusDays(-daysSinceMonday);

           int daysSinceTuesday = tTrueoday.getDayOfWeek().getValue() - 2;
           LocalDate Tuesdayofweek = tTrueoday.plusDays(-daysSinceTuesday);

           int daysSinceWednesday = tTrueoday.getDayOfWeek().getValue() - 3;
           LocalDate Wednesdayofweek = tTrueoday.plusDays(-daysSinceWednesday);

           int daysSinceTursday = tTrueoday.getDayOfWeek().getValue() - 4;
           LocalDate Tursdayofweek = tTrueoday.plusDays(-daysSinceTursday);

           int daysSinceFriday = tTrueoday.getDayOfWeek().getValue() - 5;
           LocalDate Fridayofweek = tTrueoday.plusDays(-daysSinceFriday);

           int daysSinceSaturday = tTrueoday.getDayOfWeek().getValue() - 6;
           LocalDate Saturdayofweek = tTrueoday.plusDays(-daysSinceSaturday);

           int daysSinceSunday = tTrueoday.getDayOfWeek().getValue() - 7;
           LocalDate Sundayofweek = tTrueoday.plusDays(-daysSinceSunday);

           //motnh thing here   int month = today.getMonthValue();
           //

           String monthtrue = String.valueOf(mondayOfWeek.getMonth());
           //fake motnhs now


           // end of fake motnhs
           //this is where deth lurksSATURDAYSaturday SUNDAYSunday
           LocalDate tempDate = mondayOfWeek;
               tempDate = tempDate.plusDays(1);
           LocalDate tempDate2 = tempDate.plusDays(2);

            // temp experimetning and maybe this works thing


           int dayles = mondayOfWeek.getDayOfMonth();
           int day = Tuesdayofweek.getDayOfMonth();
           //Plusdays

            int day2 = Wednesdayofweek.getDayOfMonth();
           int day4 =Tursdayofweek.getDayOfMonth();
           int day5 =Fridayofweek.getDayOfMonth();
           int day6 =Saturdayofweek.getDayOfMonth();
           int day7 =Sundayofweek.getDayOfMonth();
           //skapar fönster men syns inte på skärmen
            JFrame frame = new JFrame("Kalander");
            //skapr panel
           frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.X_AXIS));
           JPanel specialpanel = new JPanel();
           specialpanel.setLayout(new BoxLayout(specialpanel,BoxLayout.Y_AXIS));

           JPanel specialpanel2 = new JPanel();
           specialpanel2.setLayout(new BoxLayout(specialpanel2,BoxLayout.Y_AXIS));
           //number 3
           JPanel specialpanel3 = new JPanel();
           specialpanel3.setLayout(new BoxLayout(specialpanel3,BoxLayout.Y_AXIS));
           //number 4
           JPanel specialpanel4 = new JPanel();
           specialpanel4.setLayout(new BoxLayout(specialpanel4,BoxLayout.Y_AXIS));
           //number 5
           JPanel specialpanel5 = new JPanel();
           specialpanel5.setLayout(new BoxLayout(specialpanel5,BoxLayout.Y_AXIS));
           // number 6
           JPanel specialpanel6 = new JPanel();
           specialpanel6.setLayout(new BoxLayout(specialpanel6,BoxLayout.Y_AXIS));
           //number 7
           JPanel specialpanel7 = new JPanel();
           specialpanel7.setLayout(new BoxLayout(specialpanel7,BoxLayout.Y_AXIS));
           //end of special panel
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            JPanel panel2 = new JPanel();
            panel2.setLayout(new BorderLayout());
            //panel3
           JPanel panel3 = new JPanel();
           panel3.setLayout(new BorderLayout());
           //panel4
           JPanel panel4 = new JPanel();
           panel4.setLayout(new BorderLayout());
           //panel5
           JPanel panel5 = new JPanel();
           panel5.setLayout(new BorderLayout());
           //panel6
           JPanel panel6 = new JPanel();
           panel6.setLayout(new BorderLayout());
           //panel7
           JPanel panel7 = new JPanel();
           panel7.setLayout(new BorderLayout());
            // lägger penelen i frmulär
            frame.add(panel);
            frame.add(panel2);
            frame.add(panel3);
            frame.add(panel4);
            frame.add(panel5);
            frame.add(panel6);
            frame.add(panel7);
           frame.add(specialpanel);
           frame.add(specialpanel2);
           frame.add(specialpanel3);
           frame.add(specialpanel4);
           frame.add(specialpanel5);
           frame.add(specialpanel6);
           frame.add(specialpanel7);
         //  frame.add(specialpanel4);

            //sätter storlek på fönster
            frame.setSize(1000,1000);
            //bestäm vad som händer nar man stånger fönteret
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // skapar en ny label
            JLabel label = new JLabel(" MONDAY " + dayles + " " + monthtrue + " | ");
            panel.add(label,BorderLayout.NORTH);
            panel.setSize(100,100);

            JLabel label2 = new JLabel(" TUESDAY " + day + " " + monthtrue + " | ");

            panel2.add(label2,BorderLayout.NORTH);
            panel2.setSize(100,100);
            // panel 3
           JLabel label3 = new JLabel(" WEDNESDAY " + day2 + " " + monthtrue + " | ");
           panel3.add(label3,BorderLayout.NORTH);
           panel3.setSize(100,100);
           // panel 4
           JLabel label4 = new JLabel(" TURSDAY " + day4 + " " + monthtrue + " |");
           panel4.add(label4,BorderLayout.NORTH);
           panel4.setSize(100,100);
           // panel 5
           JLabel label5 = new JLabel(" FRIDAY " + day5 + " " + monthtrue + " | ");
           panel5.add(label5,BorderLayout.NORTH);
           panel5.setSize(100,100);
           // panel6
           JLabel label6 = new JLabel(" SATURDAY " + day6 + " " + monthtrue + " | ");
           panel6.add(label6,BorderLayout.NORTH);
           panel6.setSize(100,100);
           // panel 7
           JLabel label7 = new JLabel(" SUNDAY " + day7 +  " " + monthtrue + " | ");
           panel7.add(label7,BorderLayout.NORTH);
           panel7.setSize(100,100);

           panel.add(specialpanel,BorderLayout.SOUTH);
           panel2.add(specialpanel2,BorderLayout.SOUTH);
           panel3.add(specialpanel3,BorderLayout.SOUTH);
           panel4.add(specialpanel4,BorderLayout.SOUTH);
           panel5.add(specialpanel5,BorderLayout.SOUTH);
           panel6.add(specialpanel6,BorderLayout.SOUTH);
           panel7.add(specialpanel7,BorderLayout.SOUTH);
            //skapar knappar
            // JButton button2 = new JButton("clicka på mig nu");
            button = new JButton("Skapa event");
            //button2.addActionListener(this::button2actionPerformed);
            // panel.add(button2);
            //skapr button i kod och skärm
            button.addActionListener(this);
            //  frame.add(button);
           specialpanel.add(button);
            // other button
           button2 = new JButton("Skapa event");
           button2.addActionListener(this::button2actionPerformed);
           specialpanel2.add(button2);
            //button 3
           button3 = new JButton("Skapa event");
           button3.addActionListener(this::button3actionPerformed);
           specialpanel3.add(button3);
           //button4
           button4 = new JButton("Skapa event");
           button4.addActionListener(this::button4actionPerformed);
           specialpanel4.add(button4,BorderLayout.SOUTH);
           // button5
           button5 = new JButton("Skapa event");
           button5.addActionListener(this::button5actionPerformed);
           specialpanel5.add(button5,BorderLayout.SOUTH);
           //button6
           button6 = new JButton("Skapa event");
           button6.addActionListener(this::button6actionPerformed);
           specialpanel6.add(button6,BorderLayout.SOUTH);
           //button7
           button7 = new JButton("Skapa event");
           button7.addActionListener(this::button7actionPerformed);
           specialpanel7.add(button7,BorderLayout.SOUTH);
            //button.setSize(100,100);
            //jframe input aka textfeild dags och Text area
           Sendfield = new JTextField("");
           specialpanel.add(Sendfield);
                //sapa separate panerler för knapparna. skap en panel i panel skapar du din textfield och din knapp och sen lägger du panelen south.
           Sendfield2 = new JTextField("");
           specialpanel2.add(Sendfield2);

           Sendfield3 = new JTextField("");
           specialpanel3.add(Sendfield3);

           Sendfield4 = new JTextField("");
           specialpanel4.add(Sendfield4);

           Sendfield5 = new JTextField("");
           specialpanel5.add(Sendfield5);

           Sendfield6 = new JTextField("");
           specialpanel6.add(Sendfield6);

           Sendfield7 = new JTextField("");
           specialpanel7.add(Sendfield7);




           // TExtfield 1 //notering från marting knapparna ska skicka text från ett mindre textfield till den störe textfeild ovanfördem
            field = new JTextArea("\n");
           field.setLineWrap(true);
            // inistierar Textfeild och textarea
           if (tTrueoday.equals(mondayOfWeek)){
               field.setBackground(Color.LIGHT_GRAY);
           }
            panel.add(field,BorderLayout.CENTER);
            //jpanel time

            field2 = new JTextArea("\n");
           field2.setLineWrap(true);
           field2.setWrapStyleWord(true);
           if (tTrueoday.equals(Tuesdayofweek)){
               field2.setBackground(Color.LIGHT_GRAY);
           }
            panel2.add(field2,BorderLayout.CENTER);

            // feold 3
           field3 = new JTextArea("\n");
           if (tTrueoday.equals(Wednesdayofweek)){
               field3.setBackground(Color.LIGHT_GRAY);
           }
           panel3.add(field3,BorderLayout.CENTER);
           // field 4
           field4 = new JTextArea("\n");
           if (tTrueoday.equals(Tursdayofweek)){
               field4.setBackground(Color.blue);
           }
           panel4.add(field4,BorderLayout.CENTER);
           //field5
           field5 = new JTextArea("\n");
           if (tTrueoday.equals(Fridayofweek)){
               field5.setBackground(Color.LIGHT_GRAY);
           }
           panel5.add(field5,BorderLayout.CENTER);
           //field 6
           field6 = new JTextArea("\n");
           if (tTrueoday.equals(Saturdayofweek)){
               field6.setBackground(Color.LIGHT_GRAY);
           }
           panel6.add(field6,BorderLayout.CENTER);
           //field 7
           field7 = new JTextArea("\n");
           if (tTrueoday.equals(Sundayofweek)){
               field7.setBackground(Color.LIGHT_GRAY);
           }
           panel7.add(field7,BorderLayout.CENTER);






           // visar fönstret på skärmen sätt längst ner alstså sist
            frame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //  System.out.println("kittycity");
            field.append(Sendfield.getText() + "\n");
            Sendfield.setText("");
            field.setLineWrap(true);
            field.setWrapStyleWord(true);
        }
        public void button2actionPerformed(ActionEvent r) {
            field2.append(Sendfield2.getText() + "\n");
            Sendfield2.setText("");
            field2.setLineWrap(true);
            field2.setWrapStyleWord(true);

        }

    public void button3actionPerformed(ActionEvent f) {
        field3.append(Sendfield3.getText() + "\n");
        Sendfield3.setText("");
        field3.setLineWrap(true);
        field3.setWrapStyleWord(true);
    }
    public void button4actionPerformed(ActionEvent h) {
        field4.append(Sendfield4.getText()+ "\n");
        Sendfield4.setText("");
        field4.setLineWrap(true);
        field4.setWrapStyleWord(true);

    }
    public void button5actionPerformed(ActionEvent j) {
        field5.append(Sendfield5.getText() + "\n");
        Sendfield5.setText("");
        field5.setLineWrap(true);
        field5.setWrapStyleWord(true);

    }
    public void button6actionPerformed(ActionEvent k) {
        field6.append(Sendfield6.getText() + "\n");
        Sendfield6.setText("");
        field6.setLineWrap(true);
        field6.setWrapStyleWord(true);
    }
    public void button7actionPerformed(ActionEvent o) {
        field7.append(Sendfield7.getText() + "\n");
        Sendfield7.setText("");
        field7.setLineWrap(true);
        field7.setWrapStyleWord(true);
    }
    }

