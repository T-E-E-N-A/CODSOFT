import java.util.Scanner;
public class studentGradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of subjects");
        int num = sc.nextInt();
        int sum=0;
        int[] arr = new int[num];
        int n = num;
        for(int i=0 ; i<n ; i++){
            System.out.print("Enter Subject"+(i+1)+" marks out of 100 : ");
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        double averagePercent = sum*100.0/(100.0*num);
        String grade = "F";
        if(averagePercent>=90) grade="O";
        else if(averagePercent>=80) grade = "A+";
        else if(averagePercent>=70) grade = "A";
        else if(averagePercent>=60) grade = "B+";
        else if(averagePercent>=50) grade="B";
        else if(averagePercent>=40) grade = "C+";
        else grade = "F";
        System.out.println("Total marks : "+sum+"\nAverage Percentage : "+averagePercent+"\nGrade :"+grade);
    }
}
