package conditional;

import java.util.Scanner;
public class cordinateofgraph{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.print("enter the value:");
int x= sc.nextInt();
int y= sc.nextInt();{
    if(x==0&&y==0)System.out.println("origin");
    else if(x>0&&y==0)System.out.println("x-axis");
    else if(y>0&&x==0)System.out.println("y-axis");
    else if   (x>0&&y>0)       System.out.println("I quadrant");
    else if(x<0&&y>0)System.out.println("II quadrant");
    else if(x<0&&y<0)System.out.println("III quadrant");
    else System.out.println("IV quadrant");
}
    }
    
}
