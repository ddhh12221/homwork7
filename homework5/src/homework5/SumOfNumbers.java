package homework5;


import java.util.*;
public class SumOfNumbers {
	void input(){
		
		while(true){
			System.out.println("1부터 입력하신 수만큼 더해 구합니다.");
			Scanner s = new Scanner(System.in);
		
		int i= s.nextInt();
		int v=0, a=0;
		for( v=1; v<=i;v++)
		{
			a=a+v;
		}
		
		System.out.println("총 합은 "+ a+"입니다.");
		String c= s.next();
		if (c=="q")
		{
			new ExamForWhile().start();
		}
	}
	}
	
}
