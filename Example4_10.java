package test;

import java.applet.Applet;
import java.awt.*;

public class Example4_10 extends Applet
{
	Button redbutton;
	public void init()
	{
		redbutton = new Button("红按钮");
		redbutton.setBackground(Color.red);
		redbutton.setForeground(Color.white);
		add(redbutton);
	}
}
