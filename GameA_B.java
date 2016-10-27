package test;

import java.util.Scanner;

public class GameA_B 
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		int area;
		System.out.println("Game Start......Please enter the area:(1-9)"+
		'\n'+"1,2,3 means easy"+'\n'+"4,5,6 means middle"+'\n'+
		"7,8,9 means hard"+'\n'+"Please choice:");
	area = reader.nextInt();
	switch((area-1)/3)
	{
	case 0:System.out.println("You choice easy!");break;
	case 1:System.out.println("You choice middle!");break;
	case 2:System.out.println("You choice hard!");break;
	}
	System.out.println("Good Luck!");
	GameProcess game1 = new GameProcess(area);
		game1.process();
	}
}
