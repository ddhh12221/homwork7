package homework5;

import java.util.*;

public class ExamForWhileStars {



    public static void main(String[] args){

        new ExamForWhileStars().start();
    }

    void start(){
        Scanner s = new Scanner(System.in);
        System.out.println("1. 정사각형 별찍기");
        System.out.println("2. 직각삼각 별찍기");
        System.out.println("3. 이등변삼각형 별찍기");
        System.out.println("4. 다이아몬드 별찍기");
        System.out.println("5. 종료하기");
        System.out.print("원하는 메뉴는 >>");
        try {
            int d = s.nextInt();
            new ExamForWhileStars().next(d);
        } catch (InputMismatchException e) {
            System.out.println("입력값 확인");
            this.start();
        }
    }

    void next(int i){
        if(i==1) { new RectagleStars().input(); }
        else if(i==2) { new TriangleStars().input(); }
        else if(i==3) { new IsoscelesTriangleStars().input(); }
        else if(i==4) { new DiamondStars().input(); }
        else if(i==5) { System.out.println("종료합니다."); System.exit(0); }
        else { System.out.println("입력값 확인하세요."); }
    }
}