package basicJava.arraysAndNumbers;
/*
You have 10 boxes of balls (each ball weighing exactly10 gm) with one box with defective balls (each one of the defective balls weigh 9 gm).
You are given an electronic weighing machine and only one chance at it. How will find out which box has the defective balls?  
 */

public class BallsQuestion {
    public static void main(String[] args) {

        int[] ballArrayWeight = {10,20,27,40,50,60,70,80,90,100};

        int total =0 ;
        for (int i=1;i<=10;i++){
            total = total+i*10;
        }

        int totalBallWeight =0;
        for (int i=0;i<ballArrayWeight.length;i++){
            totalBallWeight = totalBallWeight+ballArrayWeight[i];
        }

        int defectiveBox = total - totalBallWeight;
        System.out.println(defectiveBox);
    }
}
