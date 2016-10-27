package test;

import java.awt.*;

class FirstWindow extends Frame 
{
	MenuBar menubar;
	Menu menu;
	MenuItem item1,item2;
	FirstWindow(String s)
	{
		setTitle(s);
		Toolkit tool = getToolkit();
		Dimension dim = tool.getScreenSize();
		setBounds(0,0,dim.width,dim.height/2);
		menubar = new MenuBar();
		menu = new Menu("文件");
		item1 = new MenuItem("打开");
		item2 = new MenuItem("保存");
		menu.add(item1);
		menu.add(item2);
		menubar.add(menu);
		setMenuBar(menubar);
		setVisible(true);
	}
}

public class Example7_1
	{
		public static void main(String args[])
		{
			FirstWindow win = new FirstWindow("一个带菜单的窗口");
		}
	}