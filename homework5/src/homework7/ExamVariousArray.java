package homework5;

import java.util.*;

public class IsoscelesTriangleStars {

	    void input(){
	        int iData = 1;
	        String strData = "";
	        Scanner s = new Scanner(System.in);
	        while (true){
	            try {
	            	System.out.print("�̵�ﰢ�� �����Է� : (����� : Q)");
	                strData = s.next().trim().toLowerCase();
	                iData = Integer.parseInt(strData);
	                for(int i=0; i<iData; i++)               
	                {
	                    for(int j=iData-i; j>0; j--)       
	                    {
	                        System.out.print(" ");       
	                    }
	              
	                    for(int k=0; k<i*2+1; k++)     
	                    {
	                        System.out.print("*");     
	                    }
	              
	                    System.out.println();          
	                }
	                

	                }
	            
	            catch (NumberFormatException e){
	                if("q".equals(strData)){
	                    new ExamForWhileStars().start();
	                }
	                else System.out.println("�Է°� Ȯ���ϼ���");
	            }
	        }
	    }
	}