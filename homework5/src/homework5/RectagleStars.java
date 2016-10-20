package homework5;

import java.util.Scanner;


public class RectagleStars {
    void input(){
        int iData = 1;
        String strData = "";
        Scanner s = new Scanner(System.in);
        while (true){
            try {
                System.out.print("정사각형 크기입력 : (종료는 : Q)");
                strData = s.next().trim().toLowerCase();
                iData = Integer.parseInt(strData);
                for(int j=1; j<=iData/2; j++){
                    for(int i=1; i<=iData; i++){
                        System.out.print("*");
                    }
                    System.out.println("");
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