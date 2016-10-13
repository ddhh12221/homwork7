package homework5;

import java.util.Scanner;


public class GuGuDan {
    void input(){
        int iData = 1;
        String strData = "";
        Scanner s = new Scanner(System.in);
        while (true){
            try {
                System.out.print("출력하고싶은 단 : (종료는 : Q)");
                strData = s.next().trim().toLowerCase();
                iData = Integer.parseInt(strData);
                if(iData<=1 || iData>=10){
                    System.out.println("잘못입력");
                }
                else {
                    for(int i=1; i<=9; i++){
                        System.out.println(iData + " * " + i + " = " + iData*i);
                    }
                }
            }catch (NumberFormatException e){
                if("q".equals(strData)){
                    new ExamForWhile().start();
                }
                else System.out.println("입력값 확인하세요");
            }
        }
    }
}