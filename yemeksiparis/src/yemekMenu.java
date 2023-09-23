import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;


public class yemekMenu extends JFrame implements ActionListener{
    private JPanel mainPanel;
    private JComboBox cb1;
    private JComboBox cb2;
    private JLabel lb1;
    private JTextField textF1;
    private JButton siparis;
    private JComboBox cb3;
    private JLabel lb3;
    private JLabel lb4;
    private JLabel lb2;
    private JLabel img1;
    private JLabel img2;
    private JLabel img3;
    private JFrame frame;
    int n,tutar=0;


    public yemekMenu  () {
        cb1.addActionListener(this);
        cb2.addActionListener(this);
        cb3.addActionListener(this);
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLayout(null);


        siparis.setBounds(400, 400, 200, 50);
        lb2.setBounds(70, 200, 150, 100);
        lb3.setBounds(350, 200, 150, 100);
        lb4.setBounds(620, 200, 150, 100);
        cb1.setBounds(50, 300, 150, 30);
        cb2.setBounds(330, 300, 150, 30);
        cb3.setBounds(600, 300, 150, 30);
        img1.setBounds(70,150,150,80);
        img2.setBounds(350,150,150,80);
        img3.setBounds(620,150,150,80);
        siparis.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                     n = Integer.parseInt(textF1.getText());
                }
                catch (Exception exception){
                    System.out.println("Masa numarası boş geçilemez!");
                    System.out.println(exception.getMessage());
                    System.exit(0);
                }

    JOptionPane.showMessageDialog(null, "Toplam Tutar: " + tutar + "tl", "Masa " + n + " siparişi", JOptionPane.INFORMATION_MESSAGE);
                tutar=0;
    }
        }));

    }

    public static void main(String[] args)  {
JTextField textF1=new JTextField();
        JFrame frame=new yemekMenu();
        JPanel mainPanel=new JPanel();
        frame.setTitle("Sipariş Sayfası");
           frame.setVisible(true);
        JLabel lb1=new JLabel("Masa numarası:");
       frame.setBounds(200,300,800,600);
    Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Casper\\Pictures\\imageorder.png");
            frame.setIconImage(icon);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int yemek=0,tatli=0,icecek=0;

        if (e.getSource() == cb1) {
            JOptionPane.showMessageDialog(null, "Seçili Yemek:" + cb1.getSelectedItem());
            String input1 = JOptionPane.showInputDialog("Adedi giriniz:");
            yemek = Integer.parseInt(input1);
            if(cb1.getSelectedIndex()==0){
                tutar+=60*yemek;
            }
            if(cb1.getSelectedIndex()==1){
                tutar+=75*yemek;
            }
            if(cb1.getSelectedIndex()==2){
                tutar+=75*yemek;
            }
            if(cb1.getSelectedIndex()==3){
                tutar+=30*yemek;
            }
            if(cb1.getSelectedIndex()==4){
                tutar+=130*yemek;
            }
            if(cb1.getSelectedIndex()==5){
                tutar+=90*yemek;
            }
            if(cb1.getSelectedIndex()==6){
                tutar+=90*yemek;
            }
            if(cb1.getSelectedIndex()==7){
                tutar+=85*yemek;
            }

           }
        if (e.getSource() == cb2) {
            JOptionPane.showMessageDialog(null,"Seçili Tatlı:" + cb2.getSelectedItem());
            String input2=JOptionPane.showInputDialog("Adedi giriniz:");
            tatli=Integer.parseInt(input2);
            if(cb2.getSelectedIndex()==0){
                tutar+=85*tatli;
            }
            if(cb2.getSelectedIndex()==1){
                tutar+=20*tatli;
            }
            if(cb2.getSelectedIndex()==2){
                tutar+=20*tatli;
            }
            if(cb2.getSelectedIndex()==3){
                tutar+=20*tatli;
            }
            if(cb2.getSelectedIndex()==4){
                tutar+=55*tatli;
            }
            if(cb2.getSelectedIndex()==5){
                tutar+=55*tatli;
            }
            if(cb2.getSelectedIndex()==6){
                tutar+=50*tatli;
            }

        }
        if  (e.getSource() == cb3) {
            JOptionPane.showMessageDialog(null,"Seçili İçecek:" + cb3.getSelectedItem());
            String input3=JOptionPane.showInputDialog("Adedi giriniz:");
            icecek=Integer.parseInt(input3);
            if(cb3.getSelectedIndex()==0){
                tutar+=5*icecek;
            }
            if(cb3.getSelectedIndex()==1){
                tutar+=15*icecek;
            }
            if(cb3.getSelectedIndex()==2){
                tutar+=20*icecek;
            }
            if(cb3.getSelectedIndex()==3){
                tutar+=8*icecek;
            }
            if(cb3.getSelectedIndex()==4){
                tutar+=10*icecek;
            }
        }
    }

    private void createUIComponents() {
        img1=new JLabel(new ImageIcon("yemek.png"));
        img2=new JLabel(new ImageIcon("tatli.png"));
        img3=new JLabel(new ImageIcon("icecek.png"));


    }
}







