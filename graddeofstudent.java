package conditional;

import java.util.Scanner;
public class graddeofstudent{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.print("enter the marks:");
int n= sc.nextInt();{
    if(n>=81)System.out.println("very good");
    else if(n>=65)System.out.println("good");
    else if(n>=40)System.out.println("average");
    else System.out.println("fail");
}
    }
    
}
