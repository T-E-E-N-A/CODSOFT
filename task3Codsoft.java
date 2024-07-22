import java.util.timer;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class timerQuiz {
    public static int flag=0;
    public static int ques(int b){
        String[] q={"2*2*2=?\n1.8\n2.4\n3.9\n4.12","3*8=?\n1.20\n2.28\n3.24\n4.32","10-3*3=\n1.21\n2.1\n3.(-1)\n4.0","square root of 49?\n1.9\n2.2401\n3.7\n4.2301"};
        int[] ans={1,3,2,3};
        System.out.println("\nYour questions is \n"+q[b]);
        return ans[b];
    }
    public static void main(String[] args){
        int score=0;
        Scanner sc = new Scanner(System.in);
        int[] answ = new int[4];
        int ans,a;
        for(int i=0;i<4;i++){
            ans = ques(i);
            System.out.print("Enter your answer number : "); 
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                public void run(){
                    System.out.println("Time Up! 5 seconds");
                    flag=1;
                    timer.cancel();
                }
            };
            timer.schedule(timerTask,5000);
            a = sc.nextInt();
            if(flag==1){
                a=0;
                flag=0;
            }
            answ[i]=a;
            if(a==ans){
                score++;
            }
            timer.cancel();
        }
        System.out.println("\n                          Your TOTAL SCORE is : "+score);
        System.out.print("\n                          To see answers summary press 1 else anything:");
        int b = sc.nextInt();
        if(b==1){    
            for(int i=0 ; i<4; i++){
                ans = ques(i);
                if(ans==answ[i]){
                    System.out.println("Your Answer is CORRECT : "+ans);
                }else if(answ[i]==0){
                    System.out.println("Time was up! So ANSWER NOT REMARKED");
                    System.out.println("Correct Answer is "+ans);
                }
                else{
                    System.out.println("Your Answer is WRONG which is : "+answ[i]+"\nCorrect Answer is : "+ans);
                }
            }
        }
    }
}
