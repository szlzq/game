package test;

import java.util.Random;
import java.util.Scanner;

public class GameProcess 
{
	int area,i,arrcount,right,midright,t;
	int base [] = new int [arrcount],userNum[] = new int [area],sysNum[]=new int[area];
	Random random = new Random();
	Scanner reader = new Scanner(System.in);
	GameProcess(int a)
	{
		area = a;
		arrcount = 10;
		right = 0;
		midright = 0;
		t = 0;
		base = new int[arrcount];
		userNum = new int[area];
		sysNum = new int[area];
		for(int i=0;i<arrcount;i++)
		{
			base[i]=i;
		}
	}
	
	void process()
	{
		rand();
		while(right!=area)
		{
			scanf();
			compare();
			print();
			check();
		}
		}
		
	void rand()
	{
		for(i=0;i<area;i++)
		{
			t = random.nextInt(arrcount);
			System.out.println(t);
			sysNum[i] =base[t];
			System.out.println(base[t]);
			delarr(t);
		}
	}
		void delarr(int t)
		{
			for(int j=t;j<arrcount-1;j++)
				base[j] = base [j=1];
				arrcount--;
		}
		void scanf(){
			System.out.println("The system number has created!"+"\n"+"Please ente"+"area"+"Numbers");
			for(int i=0;i<area;i++)
			{
				userNum[i] = reader.nextShort();
			}
		}
		void check()
		{
			if(right==area)
			System.out.println("You win......!");
		}
		boolean check(int i)
		{
			return true;
		}
		void compare()
		{
			int i =0,j =0;
			right = midright = 0;
			for(i= 0;i<area;i++)
			{
				for(j=0;j<area;j++)
				{
					if(userNum[i]==sysNum[j])
					{
						if(i==j)
						right++;
						else
						midright++;
					}
					}
		}
		}
		void print ()
		{
			System.out.println(" A "+right+" B "+midright);
		}
}
