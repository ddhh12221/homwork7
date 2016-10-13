package homework5;

import java.util.*;

public class MaxAndMin {
	void input(){
		int  min=100, max=0, i=0;

			Scanner s = new Scanner(System.in);
		
		

	        String strData = "";

	        while (true){
	            System.out.print("0~100사이의 숫자를 입력(Q:종료) >> ");
	            try {
	                strData = s.next().trim().toLowerCase();
	                int iData = Integer.parseInt(strData);
	                if(iData>=0 && iData<=100)
	                {
	                    if(min>iData){ min = iData; }
	                    else if(max<iData){ max = iData; }
	                }
	                else if(iData<0 || iData>100){ System.out.println("범위초과입니다"); }
	            }
	            catch (NumberFormatException e){
	            	
	                if("q".equals(strData)){
	                	System.out.println("입력된 수에서 가장 큰 수는 " + max + "입니다."+"입력된 수에서 가장 작은 수는 " + min + "입니다.");
	                new ExamForWhile().start(); 
	                break; 
	                }
	                else { System.out.println("입력값 확인"); }
	            }
	        }
	    }
	}

