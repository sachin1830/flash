package finalcalculater;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class finalcalculater {
	Label l1=new Label("enter the 1st number");
	TextField t1=new TextField(10);
	Label l2=new Label("enter the 2nd number");
	TextField t2=new TextField(10);
	Label l3=new Label("result");
	TextField t3=new TextField(10);
	Button add=new Button("add");
	Button sub=new Button("sub");
	Button mul=new Button("mul");
	Button div=new Button("div");
	public finalcalculater()
	{
		Panel p1=new Panel();
		GridLayout g=new GridLayout(5,2);
		p1.setLayout(g);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(add);
		p1.add(sub);
		p1.add(mul);
		p1.add(div);
		JFrame frame =new JFrame("finalcalculater");
		frame.setContentPane(p1);
		frame.setVisible(true);
		frame.setSize(500,200);
		add.addActionListener(new addition());
		sub.addActionListener(new sub());
		mul.addActionListener(new multiplication());
		div.addActionListener(new division());
		}
	public class addition implements ActionListener{
		public  void actionPerformed(ActionEvent e) {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a+b;
			String result=String.valueOf(c);
			t3.setText(result);
			
		}
	}
	public class sub implements ActionListener{
		public  void actionPerformed(ActionEvent e) {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a-b;
			String result=String.valueOf(c);
			t3.setText(result);
			
		}
	}
	public class multiplication implements ActionListener{
		public  void actionPerformed(ActionEvent e) {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a*b;
			String result=String.valueOf(c);
			t3.setText(result);
			
		}
	}
	public class division implements ActionListener{
		public  void actionPerformed(ActionEvent e) {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a/b;
			String result=String.valueOf(c);
			t3.setText(result);
			
		}
	}
	public static void main(String[] args) {
		finalcalculater c1=new finalcalculater();

	}

}
