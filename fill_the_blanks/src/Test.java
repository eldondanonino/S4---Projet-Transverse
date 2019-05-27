import javax.swing.JFrame; 
import javax.swing.JButton; 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.awt.Color;

import javax.swing.JFormattedTextField;

import java.applet.*;


/**
 * 
 * @author V.dofal
 *
 */
public class Test extends JFrame implements ActionListener 
{ 
	
JButton btn1=null; 
JButton btn2=null; 
Container conteneur=null; 
JLabel titre; 
JTextField TestSaisie1; 
JTextField TestSaisie2; 
JTextField TestSaisie3; 
JTextField TestSaisie4; 
JTextField TestSaisie5;
JTextField TestSaisie6;
JTextField TestSaisie7;
JTextField TestSaisie8;

String entree1;
public Test() 
{ 
	
this.setTitle("scratch"); 
this.setSize(new Dimension(1920,1080));
conteneur=this.getContentPane(); 
conteneur.setLayout(null); 



JLabel titre; 
titre = new JLabel("Veuillez compléter le texte à trous avec les mots suivants :",JLabel.CENTER); 
conteneur.add(titre); 
titre.setBounds(0,10,400,30);

JLabel subtitle;
subtitle = new JLabel("WATER   GET_UP   DRINK   GRAB   EAT   GRAB   PLATE   FOOD",JLabel.CENTER); 
conteneur.add(subtitle); 
subtitle.setBounds(0,40,400,30); 

JLabel date; 
date= new JLabel("void date( ){",JLabel.CENTER);	
conteneur.add(date); 
date.setBounds(10,70,100,30);



JLabel Plate; 
Plate= new JLabel("Plate = empty;",JLabel.CENTER);	
conteneur.add(Plate); 
Plate.setBounds(10,90,200,30);

JLabel thirsty; 
thirsty= new JLabel("if (thirsty){",JLabel.CENTER);	
conteneur.add(thirsty); 
thirsty.setBounds(10,110,200,30); 

JLabel parentheses; 
parentheses= new JLabel("(                  );",JLabel.CENTER);	
conteneur.add(parentheses); 
parentheses.setBounds(10,130,400,30); 




JLabel full; 
full= new JLabel("Plate = full;",JLabel.CENTER);	
conteneur.add(full); 
full.setBounds(10,150,250,30); 

JLabel close; 
close= new JLabel("}",JLabel.CENTER);	
conteneur.add(close); 
close.setBounds(10,170,150,30);

JLabel sinon; 
sinon= new JLabel("else {",JLabel.CENTER);	
conteneur.add(sinon);  
sinon.setBounds(10,190,150,30);

JLabel food; 
food= new JLabel("( food );",JLabel.CENTER);	
conteneur.add(food); 
food.setBounds(10,210,400,30);

JLabel full2; 
full2= new JLabel("Plate = full;",JLabel.CENTER);	
conteneur.add(full2); 
full2.setBounds(10,230,250,30); 

JLabel close2; 
close2= new JLabel("}",JLabel.CENTER);	
conteneur.add(close2); 
close2.setBounds(10,250,150,30);

JLabel si1; 
si1= new JLabel("if (plate != empty) {",JLabel.CENTER);	
conteneur.add(si1); 
si1.setBounds(10,270,255,30);

JLabel parentheses2; 
parentheses2= new JLabel("(                  );",JLabel.CENTER);	
conteneur.add(parentheses2); 
parentheses2.setBounds(10,290,400,30);

JLabel empty; 
empty= new JLabel("Plate = empty;",JLabel.CENTER);	
conteneur.add(empty); 
empty.setBounds(10,310,250,30);
JLabel close3; 
close3= new JLabel("}",JLabel.CENTER);	
conteneur.add(close3); 
close3.setBounds(10,330,150,30);

JLabel si2; 
si2= new JLabel("If (plate == empty) {",JLabel.CENTER);	
conteneur.add(si2); 
si2.setBounds(10,350,270,30); 


JLabel parentheses3; 
parentheses3= new JLabel("(                  );",JLabel.CENTER);	
conteneur.add(parentheses3); 
parentheses3.setBounds(10,370,400,30);


TestSaisie1=new JTextField(); 
TestSaisie1.setMaximumSize(TestSaisie1.getPreferredSize());
conteneur.add(TestSaisie1); 
TestSaisie1.setBounds(110,130,60,30);



TestSaisie2=new JTextField(); 
TestSaisie2.setMaximumSize(TestSaisie2.getPreferredSize()); 
conteneur.add(TestSaisie2); 
TestSaisie2.setBounds(110,290,60,30); 

TestSaisie3=new JTextField(); 
TestSaisie3.setMaximumSize(TestSaisie3.getPreferredSize()); 
conteneur.add(TestSaisie3); 
TestSaisie3.setBounds(180,290,60,30); 
 

TestSaisie4=new JTextField(); 
TestSaisie4.setMaximumSize(TestSaisie4.getPreferredSize()); 
conteneur.add(TestSaisie4); 
TestSaisie4.setBounds(170,130,60,30); 

TestSaisie5=new JTextField(); 
TestSaisie5.setMaximumSize(TestSaisie5.getPreferredSize()); 
conteneur.add(TestSaisie5); 
TestSaisie5.setBounds(110,370,60,30); 


TestSaisie6=new JTextField(); 
TestSaisie6.setMaximumSize(TestSaisie6.getPreferredSize()); 
conteneur.add(TestSaisie6); 
TestSaisie6.setBounds(180,370,60,30);

TestSaisie7=new JTextField(); 
TestSaisie7.setMaximumSize(TestSaisie7.getPreferredSize()); 
conteneur.add(TestSaisie3); 
TestSaisie7.setBounds(110,390,60,30); 

TestSaisie8=new JTextField(); 
TestSaisie8.setMaximumSize(TestSaisie8.getPreferredSize()); 
conteneur.add(TestSaisie8); 
TestSaisie8.setBounds(120,210,60,30); 



JLabel virgule; 
virgule= new JLabel(";",JLabel.CENTER);	
conteneur.add(virgule); 
virgule.setBounds(10,390,325,30); 

JLabel close4; 
close4= new JLabel("}",JLabel.CENTER);	
conteneur.add(close4); 
close4.setBounds(10,410,150,30);

JLabel close5; 
close5= new JLabel("}",JLabel.CENTER);	
conteneur.add(close5); 
close5.setBounds(10,430,50,30);
}






// Programme main 

public static void main (String args[]) 
{ 
new Test().setVisible(true);


}






@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}