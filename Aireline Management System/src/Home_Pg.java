import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home_Pg extends JFrame implements ActionListener {
    JMenu ADD_Customer_details;
    JMenu Flight_details;
    JMenu Book_flight;
    JMenu Journey_details;
    JMenu Cancle_flight;

    JMenu Ticket_menu;

    Home_Pg() {

        ImageIcon BG = new ImageIcon("C:\\Users\\HP\\OneDrive\\Desktop\\Airline Home_PG_BG.png");
        setContentPane(new JLabel(BG));

        // JPanel p = new JPanel();
        setTitle("Who Cares  Airline ");
        JLabel WEL_Lb = new JLabel("WELCOME TO Who Cares Airline ");
        WEL_Lb.setBounds(440, 50, 900, 50);
        WEL_Lb.setFont(new Font("railway", Font.BOLD, 33));
        WEL_Lb.setForeground(Color.darkGray);
        WEL_Lb.setBackground(Color.WHITE);
        add(WEL_Lb);

        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        JMenu detail_menu = new JMenu("Details");

        JMenuItem addCustomerItem = new JMenuItem("ADD Customer");
        addCustomerItem.addActionListener(this);
        detail_menu.add(addCustomerItem);

        JMenuItem flightDetailsItem = new JMenuItem("Flight details");
        flightDetailsItem.addActionListener(this);
        detail_menu.add(flightDetailsItem);

        JMenuItem bookFlightItem = new JMenuItem("Book flight");
        bookFlightItem.addActionListener(this);
        detail_menu.add(bookFlightItem);

        JMenuItem journeyDetailsItem = new JMenuItem("Journey details");
        journeyDetailsItem.addActionListener(this);
        detail_menu.add(journeyDetailsItem);

        JMenuItem cancelFlightItem = new JMenuItem("Cancle flight");
        cancelFlightItem.addActionListener(this);
        detail_menu.add(cancelFlightItem);

        JMenu Ticket_menu = new JMenu("Ticket");
        menubar.add(detail_menu);
        menubar.add(Ticket_menu);

        JMenuItem Boarding_Pass = new JMenuItem("Boarding Pass");
        Boarding_Pass.addActionListener(this);
        Ticket_menu.add(Boarding_Pass);

        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}