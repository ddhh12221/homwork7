package homework5;


import java.util.*;
public class SumOfNumbers {
	public void main (String[] args){
		
		Scanner s = new Scanner(System.in);
		int i= s.nextInt();
		if (i==1)
		{
			new input().SumOfNumbers();
		}
		else if (i==2)
		{
			new input().MaxAndMin();
		}
		else if (i==3)
		{
			new input().SumAndAvg();
		}
		else if (i==4)
		{
			new input().GuGuDan();
		}
		else if (i==5)
		{
			new input().GuGuDan2();
		}

		
	}
	
	
}
