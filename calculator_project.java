import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
public class calculator_project extends JFrame{
private Container c;
private JTextField t;
private JPasswordField p;
private JLabel j,j2,j3,j4,j5;
private JButton b1,b2;
private ImageIcon icon;
Font font;
calculator_project(){
 
    setBounds(500,50,600,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    login();
}
public void login(){

c=this.getContentPane();
c.setLayout(null);
c.setBackground(Color.magenta);
font=new Font("Arial",Font.BOLD,22);


j3=new JLabel();
j3.setBounds(30,50,500,40);
j3.setText("Chandpur Science and Technology University");
j3.setFont(font);
c.add(j3);

j4=new JLabel();
j4.setBounds(30,65,550,40);
j4.setText("Department of Computer Science and Engineering");
j4.setFont(font);
c.add(j4);

icon =new ImageIcon(getClass().getResource("CSTU.png"));
j5=new JLabel(icon);
j5.setBounds(100,20,100,100);
c.add(j5);


j=new JLabel();
j.setText("UserName:");
j.setBounds(10,350,200,40);
c.add(j);

t=new JTextField();
t.setBounds(90,350,200,40);
c.add(t);
j2=new JLabel();
j2.setText("Password:");
j2.setBounds(10,450,200,40);

c.add(j2);

p=new JPasswordField();
p.setBounds(90,450,200,40);
c.add(p);

b1=new JButton("LOGIN");
b1.setBounds(60,250,80,40);
c.add(b1);

b2=new JButton("CANCEL");
b2.setBounds(180,250,90,40);
c.add(b2);

b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){

String name=t.getText();
String name2=p.getText();
if(name.equals("MD:NAZMUL ISLAM")&&name2.equals("01308508965"))
{
JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFUL");
}

else
{
  JOptionPane.showMessageDialog(null,"INCORECT PASSWORD OR USERNAME");  
}
}
});
b2.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
t.setText("");
p.setText("");
}
});
}

public static void main(String[] args){

calculator_project sc=new calculator_project();
sc.setVisible(true);
sc.setTitle("LOGIN");

}
}