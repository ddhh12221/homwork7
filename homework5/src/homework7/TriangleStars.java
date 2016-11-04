package homework5;

import java.util.Scanner;

public class TriangleStars {

	    void input(){
	        int iData = 1;
	        int eData = 1;
	        String hiData = "";
	        String wiData = "";
	        Scanner s = new Scanner(System.in);
	        while (true){
	            try {
	                System.out.print("직각삼각형 높이입력 : (종료는 : Q)");
	                hiData = s.next().trim().toLowerCase();
	                System.out.print("직각삼각형 여백입력 : (종료는 : Q)");
	                wiData = s.next().trim().toLowerCase();
	                iData = Integer.parseInt(hiData);
	                eData = Integer.parseInt(wiData);
	                System.out.printf("%n2)오른쪽 직각 삼각형%n");
	                for(int i=0 ; i<iData; i++) {
	                	for(int j=0 ; j<(eData) ; j++)
	                        System.out.print(" ");
	                	for(int j=0 ; j<(iData-i-1) ; j++)
	                        System.out.print(" ");
	                    for(int j=0 ; j<i+1 ; j++)
	                        System.out.print("*");
	                    System.out.println();
	        


                    }
	            }
	            catch (NumberFormatException e){
	                if("q".equals(iData)){
	                    new ExamForWhileStars().start();
	                }
	                else if("q".equals(eData)){
	                    new ExamForWhileStars().start();
	                }
	                else System.out.println("입력값 확인하세요");
	            }
	        }
	    }
	}