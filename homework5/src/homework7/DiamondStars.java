package homework5;

import java.util.Scanner;

public class DiamondStars {

		    void input(){
		        int iData = 1;
		        String strData = "";
		        Scanner s = new Scanner(System.in);
		        while (true){
		            try {
		            	System.out.print("다이아몬드의 크기입력 (종료는 : Q)");
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
		                for(int i=iData-1; i>0; i--)
		                {
		                    for(int j=i-1; j<iData; j++)
		                    {
		                        System.out.print(" "); 
		                    }
		                      
		                    for(int k=i*2-1; k>0; k--)
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
		                else System.out.println("입력값 확인하세요");
		            }
		        }
		    }
		}