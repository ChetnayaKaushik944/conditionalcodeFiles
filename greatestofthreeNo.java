package conditional;
import java.util.Scanner;
public class greatestofthreeNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
int a= sc.nextInt();
System.out.println("enter second no");
int b= sc.nextInt();
System.out.println("enter3rd number");
int c = sc.nextInt();
{
    if(a>=b&&a>=c)System.out.println("a is greater");
   else if(b>=a&&b>=c)System.out.println("b is greater");
    else System.out.println("c is greater");
}
}
}