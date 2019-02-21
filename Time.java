import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.lang.*;
import java.util.*;

public class Time
{
  public static void main(String []args) throws Exception
  {
    JFrame f=new JFrame("time");
    f.setLayout(null);
    f.setSize(700,700);
    f.setVisible(true);
    Button b1= new Button("");
  Button   b2= new Button("");
    Button b3= new Button("");
     Button b4= new Button("");
  Button   b5= new Button("");
  Button   b6= new Button("");
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    b1.setBackground(Color.green);
    b2.setBackground(Color.green);
    b3.setBackground(Color.yellow);
    b4.setBackground(Color.yellow);
    b5.setBackground(Color.magenta);
    b6.setBackground(Color.magenta);
    b1.setBounds(200,200,100,100);
    b2.setBounds(200,200,100,100);
    b3.setBounds(300,200,100,100);
    b4.setBounds(300,200,100,100);
    b5.setBounds(400,200,100,100);
    b6.setBounds(400,200,100,100);
    b1.setFont(new Font("Courier",Font.ITALIC,40));
    b2.setFont(new Font("Courier",Font.ITALIC,40));
    b3.setFont(new Font("Courier",Font.ITALIC,40));
    b4.setFont(new Font("Courier",Font.ITALIC,40));
    b5.setFont(new Font("Courier",Font.ITALIC,40));
    b6.setFont(new Font("Courier",Font.ITALIC,40));
    b1.setVisible(true);
    b2.setVisible(true);
    b3.setVisible(true);
    b4.setVisible(true);
    b5.setVisible(true);
    b6.setVisible(true);
    String s4=new String("");
    String s5=new String("");
    String s6=new String("");
    Date d1=new Date();
    DateFormat f11= new SimpleDateFormat("hh");
    DateFormat f21= new SimpleDateFormat("mm");
    DateFormat f31= new SimpleDateFormat("ss");
    String s1=f11.format(d1);
    String s2=f21.format(d1);
    String s3=f31.format(d1);
    b1.setLabel(s1);
    b3.setLabel(s2);
    b5.setLabel(s3);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    while(true)
    {
      Date d=new Date();
      DateFormat f1= new SimpleDateFormat("hh");
      DateFormat f2= new SimpleDateFormat("mm");
      DateFormat f3= new SimpleDateFormat("ss");
      s1=f1.format(d);
       s2=f2.format(d);
       s3=f3.format(d);
      if(s3.equals(s6)){}
      else{
        b6.setVisible(true);
        b6.setLabel(s3);
        b6.setBounds(400,100,100,100);
        for(int i=1;i<=100;i=i+2)
        {
          b6.setBounds(400,200,100,i);
          b5.setBounds(400,200+i,100,100-i);
          Thread.sleep(10);
        }
        s6=s3;
        b5.setLabel(s6);
        b5.setBounds(400,200,100,100);
        b6.setVisible(false);
      }

      if(s2.equals(s5))
      {

      }
      else{
        b4.setVisible(true);
        b4.setLabel(s2);
        b4.setBounds(300,100,100,100);
        for(int i=1;i<=100;i++)
        {
          b4.setBounds(300,200,100,i);
          b3.setBounds(300,200+i,100,100-i);
          Thread.sleep(10);
        }
        b3.setLabel(s2);
        b3.setBounds(300,200,100,100);
        b4.setVisible(false);
        b3.setFont(new Font("Courier",Font.ITALIC,40));
        s5=s2;

      }
      if(s1.equals(s4))
      {}
      else{
        b2.setVisible(true);
        b2.setLabel(s1);
        b2.setBounds(200,100,100,100);
        for(int i=1;i<=100;i++)
        {
          b2.setBounds(200,200,100,i);
          b1.setBounds(200,200+i,100,100-i);
          Thread.sleep(10);

        }
        b1.setLabel(s1);
        b1.setBounds(200,200,100,100);
        b2.setVisible(false);
        s4=s1;

      }

    }




  }
void hrs()
{

}
void min()
{

}
void sec()
{

}
}
