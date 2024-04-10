package AJP;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CurrencyExample
{
	
	JFrame f;
	JLabel l1;
	JTextField t1,t2;
	JButton b;
	JMenu m1,m2;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6;
	
	
	CurrencyExample()
	{
		f=new JFrame("Currency Converter");
		f.setVisible(true);
		f.setSize(500,500);
		f.setLayout(null);
		init();
		addComponents();
	}
	public void init()
	{
		l1=new JLabel("Currency Converter");
		l1.setBounds(100,10,100,20);
		t1=new JTextField();
		t1.setBounds(20,20,100,100);
		m1=new JMenu();
		m1.setBounds(20,130,100,100);
		m2=new JMenu();
		m2.setBounds(20,240,100,100);
		
	}
	public void addComponents()
	{
		f.add(l1);
	}

}
public class Currency_converter 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CurrencyExample();

	}

}
