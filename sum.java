import java.util.Scanner;
public class sum {
    static int sumofall(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sumofall(n-1);
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=sumofall(n);
        System.out.println(result);
    }   
}