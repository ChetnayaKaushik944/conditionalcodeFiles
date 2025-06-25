package conditional;
import java.util.Scanner;
public class disiblebyfiveorthree{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.print("enter a number:");
int n= sc.nextInt();{
    if(n%5==0||n%3==0)System.out.println("no divisible by 5 or 3");
    else System.out.println("not divisible by five or three");
    
}
    }
}
