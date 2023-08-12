import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First extends JFrame implements ActionListener {

private JMenuBar mb1;
private JMenu m1,m2,m3;

private JMenuItem i1,i2,i3,i4,i5,i6,i7,i8;
private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
private JTextField t1,t2,t3;
private JComboBox c1,c2;
private JScrollPane sp1;
private JTextArea a1;


public First(){

    setLayout(null);
    setTitle("Main Menu - EOLO Company");
    getContentPane().setBackground(new Color(255,255,255));
    setIconImage(new ImageIcon(getClass().getResource("Images/icon.jpg")).getImage());

    mb1 = new JMenuBar();
    mb1.setBackground(new Color(0,0,255));
    setJMenuBar(mb1);


    m1 = new JMenu("Options");
    m1.setBackground(new Color(0,0,255));
    m1.setFont(new Font("Andale Mono",1,14));
    m1.setForeground(new Color(255,255,255));
    mb1.add(m1);

    m2 = new JMenu("Calculate");
    m2.setBackground(new Color(0,0,255));
    m2.setFont(new Font("Andale Mono",1,14));
    m2.setForeground(new Color(255,255,255));
    mb1.add(m2);

    m3 = new JMenu("About");
    m3.setBackground(new Color(0,0,255));
    m3.setFont(new Font("Andale Mono",1,14));
    m3.setForeground(new Color(255,255,255));
    mb1.add(m3);

    i1 = new JMenu("Background Color");
    i1.setBackground(new Color(0,0,255));
    i1.setFont(new Font("Andale Mono",1,14));
    i1.setForeground(new Color(255,255,255));
    m1.add(i1);

    i2 = new JMenuItem("Vacancies");
    i2.setBackground(new Color(0,0,255));
    i2.setFont(new Font("Andale Mono",1,14));
    i2.setForeground(new Color(255,255,255));
    i2.addActionListener(this);
    m2.add(i2);

    i3 = new JMenuItem("Red");
    i3.setBackground(new Color(0,0,255));
    i3.setFont(new Font("Andale Mono",1,14));
    i3.setForeground(new Color(255,255,255));
    i3.addActionListener(this);
    i1.add(i3);

    i4 = new JMenuItem("black");
    i4.setBackground(new Color(0,0,255));
    i4.setFont(new Font("Andale Mono",1,14));
    i4.setForeground(new Color(255,255,255));
    i4.addActionListener(this);
    i1.add(i4);

    i5 = new JMenuItem("white");
    i5.setBackground(new Color(0,0,255));
    i5.setFont(new Font("Andale Mono",1,14));
    i5.setForeground(new Color(255,255,255));
    i5.addActionListener(this);
    i1.add(i5);

    i6 = new JMenuItem("New");
    i6.setBackground(new Color(0,0,255));
    i6.setFont(new Font("Andale Mono",1,14));
    i6.setForeground(new Color(255,255,255));
    i6.addActionListener(this);
    m1.add(i6);

    i7 = new JMenuItem("The creator");
    i7.setBackground(new Color(0,0,255));
    i7.setFont(new Font("Andale Mono",1,14));
    i7.setForeground(new Color(255,255,255));
    i7.addActionListener(this);
    m3.add(i7);

    i8 = new JMenuItem("exit");
    i8.setBackground(new Color(0,0,255));
    i8.setFont(new Font("Andale Mono",1,14));
    i8.setForeground(new Color(255,255,255));
    i8.addActionListener(this);
    m1.add(i8);

    l1 = new JLabel("EOLO Company");
    l1.setBounds(30,30,450,50);
    l1.setFont(new Font("Andale Mono",1,40));
    l1.setForeground(new Color(0,0,250));
    add(l1);

    l2 = new JLabel("Welcome");
    l2.setBounds(450,30,300,50);
    l2.setFont(new Font("Andale Mono",1,32));
    l2.setForeground(new Color(0,0,250));
    add(l2);

    l3 = new JLabel("Employee information to calculate the vacations period");
    l3.setBounds(25,140,700,30);
    l3.setFont(new Font("Andale Mono",1,24));
    l3.setForeground(new Color(0,0,250));
    add(l3);

    l4 = new JLabel("Legal name:");
    l4.setBounds(25,188,180,30);
    l4.setFont(new Font("Andale Mono",1,12));
    l4.setForeground(new Color(0,0,250));
    add(l4);

    t1 = new JTextField();
    t1.setBounds(25,213,150,30);
    t1.setBackground(new Color(255,255,255));
    t1.setFont(new Font("Andale Mono",1,12));
    t1.setForeground(new Color(0,0,250));
    add(t1);

    l5 = new JLabel("Last name:");
    l5.setBounds(25,248,180,25);
    l5.setFont(new Font("Andale Mono",1,12));
    l5.setForeground(new Color(0,0,250));
    add(l5);

    t2 = new JTextField();
    t2.setBounds(25,273,150,30);
    t2.setBackground(new Color(255,255,255));
    t2.setFont(new Font("Andale Mono",1,12));
    t2.setForeground(new Color(0,0,250));
    add(t2);

    l6 = new JLabel("Midle name:");
    l6.setBounds(25,308,700,30);
    l6.setFont(new Font("Andale Mono",1,12));
    l6.setForeground(new Color(0,0,250));
    add(l6);

    t3 = new JTextField();
    t3.setBounds(25,334,150,30);
    t3.setBackground(new Color(255,255,255));
    t3.setFont(new Font("Andale Mono",1,12));
    t3.setForeground(new Color(0,0,250));
    add(t3);

    l7 = new JLabel("Select the department:");
    l7.setBounds(220,188,180,30);
    l7.setFont(new Font("Andale Mono",1,12));
    l7.setForeground(new Color(0,0,250));
    add(l7);

    c1 = new JComboBox();
    c1.setBounds(220,213,220,30);
    c1.setFont(new Font("Andale Mono",1,12));
    c1.setForeground(new Color(0,0,255));
    c1.setBackground(new Color(255,255,255));
    add(c1);
    c1.addItem("");
    c1.addItem("Customer service");
    c1.addItem("Logistics");
    c1.addItem("Management");

    l8 = new JLabel("Select seniority :");
    l8.setBounds(220,248,180,30);
    l8.setFont(new Font("Andale Mono",1,12));
    l8.setForeground(new Color(0,0,250));
    add(l8);

    c2 = new JComboBox();
    c2.setBounds(220,273,220,30);
    c2.setFont(new Font("Andale Mono",1,12));
    c2.setForeground(new Color(0,0,255));
    c2.setBackground(new Color(255,255,255));
    add(c2);
    c2.addItem("");
    c2.addItem("1 Year of service");
    c2.addItem("2 to 6 years of service");
    c2.addItem("More than 7 years of service");

    l9 = new JLabel("Calculations results:");
    l9.setBounds(220,307,180,30);
    l9.setFont(new Font("Andale Mono",1,12));
    l9.setForeground(new Color(0,0,250));
    add(l9);

    a1 = new JTextArea();
    a1.setEditable(false);
    a1.setBackground(new Color(255,255,255));
    a1.setFont(new Font("Andale Mono",1,12));
    a1.setForeground(new Color(0,0,250));
    a1.setText("\n Here is show the result of the vacancies calculations");
    sp1 = new JScrollPane();
    sp1.setBounds(220,333,385,90);
    sp1.setBackground(new Color(255,255,255));
    add(sp1);

    l10 = new JLabel(" 2023 The EOLO Company -- all right reserved.");
    l10.setBounds(135,445,500,30);
    l10.setFont(new Font("Andale Mono",1,12));
    l10.setForeground(new Color(0,0,250));
    add(l10);
}

    public void actionPerformed(ActionEvent click){
        if(click.getSource()==mi){

        }
    }

}
