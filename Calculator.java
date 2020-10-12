package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * @author shabeersha.github.io
 *
 */
public class Calculator implements ActionListener {

	JFrame jf;
	JLabel displayLabel;
	JButton JB7;
	JButton JB8;
	JButton JB9;
	JButton JB6;
	JButton JB4;
	JButton JB5;
	JButton JB3;
	JButton JB2;
	JButton JB1;
	JButton JBDOT;
	JButton JBsub;
	JButton JBadd;
	JButton JBEqual;
	JButton JBdiv;
	JButton JBmul;
	JButton JBZero;
	JButton JBclear;
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300, 150);
		
		displayLabel = new JLabel();
		displayLabel.setBounds(20, 20, 540, 70);
		displayLabel.setFont(new Font("Arial",Font.PLAIN,30));
		displayLabel.setBackground(Color.gray);
		displayLabel.setForeground(Color.white);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(displayLabel);
		
		
		JB7=new JButton("7");
		JB7.setBounds(20, 120, 80, 80);
		JB7.addActionListener(this);
		JB7.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JB7);
		
		JB8=new JButton("8");
		JB8.setBounds(130, 120, 80, 80);
		JB8.addActionListener(this);
		JB8.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JB8);
		
		JB9=new JButton("9");
		JB9.setBounds(240, 120, 80, 80);
		JB9.addActionListener(this);
		JB9.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JB9);
		
		JBclear=new JButton("Clear");
		JBclear.setBounds(450, 120, 100, 380);
		JBclear.addActionListener(this);
		JBclear.setFont(new Font("Arial",Font.PLAIN,20));
		jf.add(JBclear);
		
		JB4=new JButton("4");
		JB4.setBounds(20, 220, 80, 80);
		JB4.addActionListener(this);
		JB4.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JB4);
		
		JB5=new JButton("5");
		JB5.setBounds(130, 220, 80, 80);
		JB5.addActionListener(this);
		JB5.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JB5);
		
		JB6=new JButton("6"); 
		JB6.setBounds(240, 220, 80, 80);
		JB6.addActionListener(this);
		JB6.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JB6);
		
		JB1=new JButton("1");
		JB1.setBounds(20, 320, 80, 80);
		JB1.addActionListener(this);
		JB1.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JB1);
		
		JB2=new JButton("2");
		JB2.setBounds(130, 320, 80, 80);
		JB2.addActionListener(this);
		JB2.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JB2);
		
		JB3=new JButton("3");
		JB3.setBounds(240, 320, 80, 80);
		JB3.addActionListener(this);
		JB3.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JB3);
		
		JBDOT=new JButton(".");
		JBDOT.setBounds(20, 420, 80, 80);
		JBDOT.addActionListener(this);
		JBDOT.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JBDOT);
		
		JBZero=new JButton("0");
		JBZero.setBounds(130, 420, 80, 80);
		JBZero.addActionListener(this);
		JBZero.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JBZero);
		
		JBEqual=new JButton("=");
		JBEqual.setBounds(240, 420, 80, 80);
		JBEqual.addActionListener(this);
		JBEqual.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JBEqual);
		
		JBdiv=new JButton("/");
		JBdiv.setBounds(350, 120, 80, 80);
		JBdiv.addActionListener(this);
		JBdiv.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JBdiv);
		
		JBmul=new JButton("*");
		JBmul.setBounds(350, 220, 80, 80);
		JBmul.addActionListener(this);
		JBmul.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JBmul);
		
		JBsub=new JButton("-");
		JBsub.setBounds(350, 320, 80, 80);
		JBsub.addActionListener(this);
		JBsub.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JBsub);
		
		JBadd=new JButton("+");
		JBadd.setBounds(350, 420, 80, 80);
		JBadd.addActionListener(this);
		JBadd.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(JBadd);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== JB1) {
			displayLabel.setText(displayLabel.getText()+"1");
		}else if(e.getSource()==JB2) {
			displayLabel.setText(displayLabel.getText()+"2");
		}else if(e.getSource()==JB3) {
			displayLabel.setText(displayLabel.getText()+"3");
		}else if(e.getSource()==JB4) {
			displayLabel.setText(displayLabel.getText()+"4");
		}else if(e.getSource()==JB5) {
			displayLabel.setText(displayLabel.getText()+"5");
		}else if(e.getSource()==JB6) {
			displayLabel.setText(displayLabel.getText()+"6");
		}else if(e.getSource()==JB7) {
			displayLabel.setText(displayLabel.getText()+"7");
		}else if(e.getSource()==JB8) {
			displayLabel.setText(displayLabel.getText()+"8");
		}else if(e.getSource()==JB9) {
			displayLabel.setText(displayLabel.getText()+"9");
		}else if(e.getSource()==JBZero) {
			displayLabel.setText(displayLabel.getText()+"0");
		}else if(e.getSource()==JBDOT) {
			displayLabel.setText(displayLabel.getText()+".");
		}else if(e.getSource()==JBadd) {
			
		}else if(e.getSource()==JBsub) {
			
		}else if(e.getSource()==JBmul) {
			
		}else if(e.getSource()==JBdiv) {
			
		}else if(e.getSource()==JBclear) {
			displayLabel.setText("");
			
		}else if(e.getSource()==JBEqual) {
			
		}
	}
	
}
