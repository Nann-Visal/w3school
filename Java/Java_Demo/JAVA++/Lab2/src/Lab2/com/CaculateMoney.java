package Lab2.com;

import java.util.Scanner;

public class CaculateMoney {
    public static void main(String[] args){
        int money=150;
        int score;
        System.out.print("Enter score = ");
        Scanner scanner = new Scanner(System.in);
        score=scanner.nextInt();
        if(score>=6){
            money += 20;
            if(score>=8 && score<=10){
                money +=50;
            }
        }
        System.out.printf("Money = %d$$",money);
    }
}
