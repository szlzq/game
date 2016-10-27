package test;

import java.awt.*;
import java.awt.event.*;

class WindowButton extends Frame
implements ActionListener
	{
		int number;
		Label  提示;
		TextField 输入框;
		
		Button buttonGetNumber,buttonEnter;
		WindowButton(String s)
		{
			super(s);
			setLayout(new FlowLayout());
			buttonGetNumber = new Button("得到一个随机数");
			add(buttonGetNumber);
			提示 = new Label("输入您的猜测:",Label.CENTER);
			提示.setBackground(Color.cyan);
			输入框  = new TextField("0",10);
//			str = new String(str.getBytes("GB2312"),"8859_1");
			add(提示);
			add(输入框);
			buttonEnter = new Button("确定");
			add(buttonEnter);
			buttonEnter.addActionListener(this);
			buttonGetNumber.addActionListener(this);
			setBounds(100,100,150,150);
			setVisible(true);
			validate();
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==buttonGetNumber)
			{
				number = (int)(Math.random()*100)+1;
				提示.setText("输入你的猜测:");
			}
			else if(e.getSource()==buttonEnter)
			{
				int guess = 0;
				try
				{
					guess = Integer.parseInt(输入框.getText());
					if(guess == number)
					{
						提示.setText("猜对了!");
					}
					else if(guess>number)
					{
						提示.setText("猜大了");
						输入框.setText(null);
					}
					else if(guess<number)
					{
						提示.setText("猜小了");
						输入框.setText(null);
					}
				}
				catch(NumberFormatException event)
				{
					提示.setText("请输入数字字符");
				}
			}
			}
			
			
		}

public class Example7_6 
{
	public static void main(String args[])
	{
		WindowButton win = new WindowButton("窗口");
	}
}
