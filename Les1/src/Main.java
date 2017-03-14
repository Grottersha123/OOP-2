
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.IOException;
import javax.swing.*;
/**
/**
 *
 * @author admin
 */


/**
 *
 * @author admin
 */
class Boy extends Human{
    public Boy(double w, double h, String name){
        super(w, h, name);
    }
    public String flower() {
        return (name + ": " + "Gives flowers");
    }
    public String cinema() {
        return (name + ": " + "Lats go to the sinema?");
    }

}


/**
 *
 * @author admin
 */
class Girl extends Human{
    public Girl(double w, double h, String name){
        super(w, h, name);
    }
    public String yes() {
        return (name + ": " + "Yes!");
    }
    public String no() {
        return (name + ": " + "No!");
    }
    @Override
    public String hallo() {
        return (name + ": " + "Hallo!");
    }
}

/**
 *
 * @author admin
 */
class Human {
    public double w = 0;
    public double h = 0;
    public String name = "";

    public Human(double w, double h, String name) {
        this.w = w;
        this.h = h;
        this.name = name;
    }

    public String hallo() {
        return (name + ": " + "Hi!");
    }

    public String hallo(String namePerson) {
        return (name + ": " + "Hi, " + namePerson + "!");
    }


}
class MeetinGue extends JFrame {


    public MeetinGue() {
        super("Probno");
        JFrame myWindow = new JFrame("Пробное окно");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        JLabel l = new JLabel();
        JButton b = new JButton("Knopф");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                l.setForeground(Color.blue);
                p.add(new JLabel("LOL"), BorderLayout.WEST);
            }
        });
        p.add(b);



        setContentPane(p);
        setSize(250,250);
    }
}

class Main {
    public String dialog;
    private static final String TEXT = "Vot eto vstrecha!";
    public static void main(String[] args) throws IOException {
        String dialog;
        Girl lisa = new Girl (40, 150, "Lisa");
        Boy ivan = new Boy (50, 150, "Ivan");
        System.out.println(TEXT);
        dialog = lisa.hallo()+"\n"+ ivan.hallo(lisa.name)+"\n"+
                ivan.flower()+"\n"+ivan.cinema()+"\n"+lisa.yes();
        System.out.println(dialog);
        JFrame m = new MeetinGue();
        m.setVisible(true);


    }
}







/**
 *
 * @author admin
 */

