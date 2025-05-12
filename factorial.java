import java.util.Scanner;
public class factorial{
    static int product(int i){
        if(i==1){
            return 1;
        }
        else{
            return i*product(i-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=product(n);
        System.out.println(result);
    }
}