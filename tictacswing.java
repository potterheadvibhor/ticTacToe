import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class fdemo extends JFrame implements ActionListener
{ 
    JButton b[]=new JButton[9];
    int x,y=50,check=0;
    Label l1;
    Font f1=new Font("Arial Black",Font.BOLD, 20);

    fdemo()
    {
        setTitle("TICTAC");
setLayout(null);
setResizable(false);
Font f=new Font("Arial Black",Font.BOLD, 20);

int i=0;
for(int k=1;k<=3;k++)
{
    x=40;
    for(int j=1;j<=3;j++)
    {
        b[i]=new JButton();
        b[i].setLocation(x,y);
        b[i].setSize(80,70);
        b[i].setFont(f);
        
         add(b[i]);
        b[i].addActionListener(this);
   x=x+81;
   i++;
    }
    y=y+71;
    }
}
public void actionPerformed(ActionEvent e)
{
JButton b1=(JButton)e.getSource();
if(check==0)
{
b1.setText("X");
check=1;
}
else
{
b1.setText("0");
check=0;
}
b1.removeActionListener(this);
if(
    (b[0].getText()=="X" && b[1].getText()=="X" && b[2].getText()=="X")  
    ||
    (b[3].getText()=="X" && b[4].getText()=="X" && b[5].getText()=="X")
    ||
    (b[6].getText()=="X" && b[7].getText()=="X" && b[8].getText()=="X")
    ||
    (b[0].getText()=="X" && b[3].getText()=="X" && b[6].getText()=="X")
    ||
    (b[1].getText()=="X" && b[4].getText()=="X" && b[7].getText()=="X")
    ||
    (b[2].getText()=="X" && b[5].getText()=="X" && b[8].getText()=="X")
    ||
    (b[0].getText()=="X" && b[4].getText()=="X" && b[8].getText()=="X")
    ||
    (b[2].getText()=="X" && b[4].getText()=="X" && b[6].getText()=="X")
    )
{
    l1=new Label("X is the winner");
    l1.setLocation(300, 60);
   l1.setFont(f1);
    l1.setSize(200,50);
    add(l1);
    
}
if(
    (b[0].getText()=="0" && b[1].getText()=="0" && b[2].getText()=="0")  
    ||
    (b[3].getText()=="0" && b[4].getText()=="0" && b[5].getText()=="0")
    ||
    (b[6].getText()=="0" && b[7].getText()=="0" && b[8].getText()=="0")
    ||
    (b[0].getText()=="0" && b[3].getText()=="0" && b[6].getText()=="0")
    ||
    (b[1].getText()=="0" && b[4].getText()=="0" && b[7].getText()=="0")
    ||
    (b[2].getText()=="0" && b[5].getText()=="0" && b[8].getText()=="0")
    ||
    (b[0].getText()=="0" && b[4].getText()=="0" && b[8].getText()=="0")
    ||
    (b[2].getText()=="0" && b[4].getText()=="0" && b[6].getText()=="0")
    )
{
    l1=new Label("0 is the winner");
    l1.setLocation(300, 60);
    l1.setFont(f1);
    l1.setSize(200,50);
    add(l1);

}





}
}
class tictacswing
{
    public static void main(String []args)
    {
fdemo f=new fdemo();
f.setVisible(true);
f.setLocation(400,200);
f.setSize(500,400);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
Color C=new Color(59,89, 152);
f.getContentPane().setBackground(C);
    }
}