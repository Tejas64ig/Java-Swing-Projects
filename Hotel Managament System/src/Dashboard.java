import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    
    JMenuBar menuBar;
    JMenu hotelMenu, adminMenu;
    JMenuItem receptionItem, addEmployeeItem, addRoomItem, addDriversItem;
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
        
        setSize(800, 480);
        setLocation(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setForeground(Color.CYAN);

        ImageIcon i1 = new ImageIcon("C:\\Users\\HP\\Downloads\\.jpg");
        Image i2 = i1.getImage().getScaledInstance(800, 480, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel newLabel = new JLabel(i3);
        newLabel.setBounds(0, 0, 800, 480);
        add(newLabel);

        JLabel titleLabel = new JLabel("THE Who Cares GROUP WELCOMES U");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        titleLabel.setBounds(100, 50, 600, 60);
        newLabel.add(titleLabel);

        menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 800, 30);
        menuBar.setBackground(new Color(0, 0, 0, 150));
        add(menuBar);

        hotelMenu = new JMenu("HOTEL MANAGEMENT");
        hotelMenu.setForeground(Color.BLUE);
        menuBar.add(hotelMenu);

        receptionItem = new JMenuItem("RECEPTION");
        receptionItem.addActionListener(this);
        hotelMenu.add(receptionItem);

        // Admin Menu
        adminMenu = new JMenu("ADMIN");
        adminMenu.setForeground(Color.RED);
        menuBar.add(adminMenu);

        addEmployeeItem = new JMenuItem("ADD EMPLOYEE");
        addEmployeeItem.addActionListener(this);
        adminMenu.add(addEmployeeItem);

        addRoomItem = new JMenuItem("ADD ROOMS");
        addRoomItem.addActionListener(this);
        adminMenu.add(addRoomItem);

        addDriversItem = new JMenuItem("ADD DRIVERS");
        addDriversItem.addActionListener(this);
        adminMenu.add(addDriversItem);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == receptionItem) {
            new Reception().setVisible(true);
            setVisible(false);
        } else if (ae.getSource() == addEmployeeItem) {
            try {
                new AddEmployee().setVisible(true);
            } catch (Exception e) {}
        } else if (ae.getSource() == addRoomItem) {
            try {
                new AddRoom().setVisible(true);
            } catch (Exception e) {}
        } else if (ae.getSource() == addDriversItem) {
            try {
                new AddDrivers().setVisible(true);
            } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
