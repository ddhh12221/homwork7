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
	                System.out.print("�����ﰢ�� �����Է� : (����� : Q)");
	                hiData = s.next().trim().toLowerCase();
	                System.out.print("�����ﰢ�� �����Է� : (����� : Q)");
	                wiData = s.next().trim().toLowerCase();
	                iData = Integer.parseInt(hiData);
	                eData = Integer.parseInt(wiData);
	                System.out.printf("%n2)������ ���� �ﰢ��%n");
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
	                else System.out.println("�Է°� Ȯ���ϼ���");
	            }
	        }
	    }
	}