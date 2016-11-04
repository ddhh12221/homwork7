package homework5;

import java.util.*;

public class ExamForWhileStars {



    public static void main(String[] args){

        new ExamForWhileStars().start();
    }

    void start(){
        Scanner s = new Scanner(System.in);
        System.out.println("1. ���簢�� �����");
        System.out.println("2. �����ﰢ �����");
        System.out.println("3. �̵�ﰢ�� �����");
        System.out.println("4. ���̾Ƹ�� �����");
        System.out.println("5. �����ϱ�");
        System.out.print("���ϴ� �޴��� >>");
        try {
            int d = s.nextInt();
            new ExamForWhileStars().next(d);
        } catch (InputMismatchException e) {
            System.out.println("�Է°� Ȯ��");
            this.start();
        }
    }

    void next(int i){
        if(i==1) { new RectagleStars().input(); }
        else if(i==2) { new TriangleStars().input(); }
        else if(i==3) { new IsoscelesTriangleStars().input(); }
        else if(i==4) { new DiamondStars().input(); }
        else if(i==5) { System.out.println("�����մϴ�."); System.exit(0); }
        else { System.out.println("�Է°� Ȯ���ϼ���."); }
    }
}