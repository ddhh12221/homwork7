package homework5;

import java.util.Scanner;

public class GuGuDan {
	void input(){
		while(true){
			System.out.println("출력하고 싶은 단(Q:종료) >>");
			Scanner s = new Scanner(System.in);
		
		int i= s.nextInt();
		if (i>1&&i<10)
		{
			for(int r=0; r<10;r++)
			{
				System.out.println("");
			}
		}
		int v=0, a=0;
		for( v=1; v<=i;i++)
		{
			a=a+v;
		}
		
		System.out.println("총 합은 "+ a+"입니다.");
		String c= s.next();
		if (c=="q")
		{
			break;
		}
	}
	}
}
