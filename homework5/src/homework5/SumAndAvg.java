package homework5;

import java.util.Scanner;

public class SumAndAvg {
	void input(){
		
		int  i=0, v=0,sum=0, avg=0;
		while(true){
			System.out.println("숫자를 입력(Q:종료) >>");
			Scanner s = new Scanner(System.in);
		
		
		int c= s.nextInt();
		
		v=v+c;
		i++;
		
		if(c=='q')
		{
			sum=v;
			avg=v/i;
			  System.out.print("합은" + sum + "이고,");
			  System.out.println("평균은" + avg + "입니다.");
			break;
		}
		
	}
	}
}
