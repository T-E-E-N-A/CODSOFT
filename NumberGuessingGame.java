import java.util.Scanner;
import java.util.Random;
class task1Codsoft{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int finalScore=0;
        int score=0;
        int key=1;
        int n=0;
        do{
            System.out.print("Choose level of Game:\n1.Easy\n2.Medium\n3.Hard\nEnter number: ");
            int a = sc.nextInt();
            if(a==1){
                score = 8;
                n = 11;
            }else if(a==2){
                score = 12;
                n=51;
            }else if(a==3){
                score = 16;
                n = 101;
            }else{
                System.out.println("Pressed wrong key");
                break;
            }
            int num = rand.nextInt(1,n);
            System.out.println("Guess a number in range of 1-"+(n-1));
            int number = sc.nextInt();
            while(num!=number && score!=0){
                if(((num-4)<number && num>number) || ((num+4)>number)&& num<number){
                    System.out.print("You are nearer to number .\nTIP:");
                }
                if(num>number){
                    System.out.println("You have entered smaller number than real number!");
                }else{
                    System.out.println("You have entered greater number than real number!");
                }
                score-=2;
                number = sc.nextInt();
            }
            if(score==0){
                System.out.println("\nSorry! No more attempts.");
                System.out.println("real number is "+num+"\n");
            }else{
                System.out.println();
                System.out.println("\nYEAH! YOU GUESSED IT CORRECT\n\nYour score : "+score);
                System.out.println();
            }
            System.out.println("To continue this game press 1\nTo exit this game press any key except 1");
            key = sc.nextInt();
            finalScore += score;
        }while(key==1);
        if(finalScore!=score){
            System.out.println("==============================================================================================================");
            System.out.println("                                       Your overall scores is "+finalScore);
            System.out.println("===============================================================================================================");
        }
    }
}
