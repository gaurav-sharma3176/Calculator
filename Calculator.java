import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.lang.Math;
class Calculator
{
	static double  i=0,j=0,plus=0,sub=0,mul=0,div=0,d=0;
	static boolean BL=true,DC=false;
	public static void main(String args[])
	{
		JFrame f=new JFrame("Calculator");
		JTextField tf1=new JTextField("0");
		tf1.setBounds(0,140,470,100);
		Font font1 = new Font(tf1.getFont().getName(),tf1.getFont().getStyle(), 30);
		tf1.setFont(font1);
		
		JButton a1=new JButton("0");
		Font newButtonFont=new Font(a1.getFont().getName(),a1.getFont().getStyle(),24);
		a1.setFont(newButtonFont);
		a1.setBounds(0,490,117,60);
		a1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(BL)
				{	
					if(i==0)
					{
						i=0;
					}
					else
					{
						i=i*10+0;
					}
					tf1.setText(String.valueOf(i));
				}
				else
				{
					if(j==0)
						j=0;
					else
						j=j*10+0;
					tf1.setText(String.valueOf(j));
				}
			}
		});
		
		JButton a2=new JButton("RST");
		a2.setFont(newButtonFont);
		a2.setBounds(119,490,117,60);
		a2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				i=0;
				j=0;
				plus=0;
				sub=0;
				mul=0;
				div=0;
				BL=true;
				tf1.setText(String.valueOf("0"));
				
			}
		});
		
		JButton a3=new JButton("=");
		a3.setFont(newButtonFont);
		a3.setBounds(236,490,117,60);
		a3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(plus==1)
				{
					i=i+j;
					j=0;
					plus=0;
					sub=0;
					mul=0;
					div=0;
					tf1.setText(String.valueOf(i));
				}
				else if(sub==1)
				{
					i=i-j;
					j=0;
					plus=0;
					sub=0;
					mul=0;
					div=0;
					
					tf1.setText(String.valueOf(i));
				}
				else if(mul==1)
				{
					i=i*j;
					j=0;
					plus=0;
					sub=0;
					mul=0;
					div=0;
					tf1.setText(String.valueOf(i));
				}
				else if(div==1)
				{
					i=i/j;
					j=0;
					plus=0;
					sub=0;
					mul=0;
					div=0;
					tf1.setText(String.valueOf(i));
					
				}
			}
		});
		
		JButton a4=new JButton("+");
		a4.setFont(newButtonFont);
		a4.setBounds(353,490,117,60);
		a4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				BL=false;
				plus=1;
			}
		});
		
		JButton a5=new JButton("3");
		a5.setFont(newButtonFont);
		a5.setBounds(0,428,117,60);
		a5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(BL)
				{	
					
					if(i==0)
					{
						i=3;
					}
					else
					{
						i=i*10+3;
					}
					tf1.setText(String.valueOf(i));
				}
				else
				{
					if(j==0)
						j=3;
					else
						j=j*10+3;
					tf1.setText(String.valueOf(j));
				}
			}
		});
		
		JButton a6=new JButton("2");
		a6.setFont(newButtonFont);
		a6.setBounds(119,428,117,60);
		a6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(BL)
				{
					if(i==0)
					{
						i=2;
					}
					else
					{
						i=i*10+2;
					}
					tf1.setText(String.valueOf(i));
				}
				else
				{
					if(j==0)
						j=2;
					else
						j=j*10+2;
					tf1.setText(String.valueOf(j));
				}
			}
		});
		
		JButton a7=new JButton("1");
		a7.setFont(newButtonFont);
		a7.setBounds(236,428,117,60);
		a7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(BL)
				{
					if(i==0)
					{
						i=1;
					}
					else
					{
						i=i*10+1;
					}
					tf1.setText(String.valueOf(i));
				}
				else
				{
					if(j==0)
						j=1;
					else
						j=j*10+1;
					tf1.setText(String.valueOf(j));
				}
			}
		});
		
		JButton a8=new JButton("-");
		a8.setFont(newButtonFont);
		a8.setBounds(353,428,117,60);
		a8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				BL=false;
				sub=1;
			}
		});
		
		JButton a9=new JButton("6");
		a9.setFont(newButtonFont);
		a9.setBounds(0,366,117,60);
		a9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(BL)
				{
					if(i==0)
					{
						i=6;
					}
					else
					{
						i=i*10+6;
					}
					tf1.setText(String.valueOf(i));
				
				}	
				else
				{
					if(j==0)
						j=6;
					else
						j=j*10+6;
					tf1.setText(String.valueOf(j));
				}
			}
		});
		
		JButton a10=new JButton("5");
		a10.setFont(newButtonFont);
		a10.setBounds(119,366,117,60);
		a10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(BL)
				{
					if(i==0)
					{
						i=5;
					}
					else
					{
						i=i*10+5;
					}
					tf1.setText(String.valueOf(i));
				}
				else
				{
					if(j==0)
						j=5;
					else
						j=j*10+5;
					tf1.setText(String.valueOf(j));
				}
			}
		});
		
		JButton a11=new JButton("4");
		a11.setFont(newButtonFont);
		a11.setBounds(236,366,117,60);
		a11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(BL)
				{
					if(i==0)
					{
						i=4;
					}
					else
					{
						i=i*10+4;
					}
					tf1.setText(String.valueOf(i));
				}
				else
				{
					if(j==0)
						j=4;
					else
						j=j*10+4;
					tf1.setText(String.valueOf(j));
				}
			}
		});
		
		JButton a12=new JButton("*");
		a12.setFont(newButtonFont);
		a12.setBounds(353,366,117,60);
		a12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				BL=false;
				mul=1;
			}
		});
		
		JButton a13=new JButton("9");
		a13.setFont(newButtonFont);
		a13.setBounds(0,304,117,60);
		a13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(BL)
				{
					if(i==0)
					{
						i=9;
					}
					else
					{
						i=i*10+9;
					}
					tf1.setText(String.valueOf(i));
				}
				else
				{
					if(j==0)
						j=9;
					else
						j=j*10+9;
					tf1.setText(String.valueOf(j));
				}
			}
		});
		
		JButton a14=new JButton("8");
		a14.setFont(newButtonFont);
		a14.setBounds(119,304,117,60);
		a14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(BL)
				{
					if(i==0)
					{
						i=8;
					}
					else
					{
						i=i*10+8;
					}
					tf1.setText(String.valueOf(i));
				}
				else
				{
					if(j==0)
						j=8;
					else
						j=j*10+8;
					tf1.setText(String.valueOf(j));
				}
			}
		});
		
		JButton a15=new JButton("7");
		a15.setFont(newButtonFont);
		a15.setBounds(236,304,117,60);
		a15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(BL)
				{
					if(i==0)
					{
						i=7;
					}
					else
					{
						i=i*10+7;
					}
					tf1.setText(String.valueOf(i));
				}
				else
				{
					if(j==0)
						j=7;
					else
						j=j*10+7;
					tf1.setText(String.valueOf(j));
				}
			}
		});
		
		JButton a16=new JButton("/");
		a16.setFont(newButtonFont);
		a16.setBounds(353,304,117,60);
		a16.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				BL=false;
				div=1;
			}
		});
		
		JButton a17=new JButton("CALCULATOR");
		a17.setFont(newButtonFont);
		a17.setBounds(0,60,470,80);
		
		
		JButton a18=new JButton("SQRT");
		a18.setBounds(0,242,117,60);
		a18.setFont(newButtonFont);
		a18.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				i=Math.sqrt(i);
				tf1.setText(String.valueOf(i));
				
			}
		});
		
		JButton a19=new JButton("DEL");
		a19.setBounds(353,242,117,60);
		a19.setFont(newButtonFont);
		
		JButton a20=new JButton(".");
		a20.setBounds(236,242,117,60);
		a20.setFont(newButtonFont);
		
		JButton a21=new JButton("SQRE");
		a21.setBounds(119,242,117,60);
		a21.setFont(newButtonFont);
		a21.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				i=i*i;
				tf1.setText(String.valueOf(i));
				
			}
		});
		
		
		
		
		f.add(a21);	
		f.add(a20);
		f.add(a19);
		f.add(a18);
		f.add(a17);
		f.add(tf1);
		f.add(a1);
		f.add(a2);
		f.add(a3);
		f.add(a4);
		f.add(a5);
		f.add(a6);
		f.add(a7);
		f.add(a8);
		f.add(a9);
		f.add(a10);
		f.add(a11);
		f.add(a12);
		f.add(a13);
		f.add(a14);
		f.add(a15);
		f.add(a16);
		
		f.setSize(500,600);
		f.setLayout(null);
		f.setVisible(true);
	}
}
