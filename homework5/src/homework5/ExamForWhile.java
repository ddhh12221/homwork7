package homework5;


import java.util.*;
public class ExamForWhile {
	public void main (String[] args){
		
		while(true)
		{
		Scanner s = new Scanner(System.in);
		int i= s.nextInt();
		if (i==1)
		{
			new SumOfNumbers().input();
		}
		else if (i==2)
		{
			new MaxAndMin().input();
		}
		else if (i==3)
		{
			new SumAndAvg().input(); 
		}
		else if (i==4)
		{
			new GuGuDan().input();
		}
		else if (i==5)
		{
			new GuGuDan2().input();	
		}
		else if (i==6)
		{
			break;
		}
		else
		{
			continue;
		}
		}
		

		
	}
	
	
}
