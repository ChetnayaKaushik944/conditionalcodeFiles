package conditional;

import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a costprice:");13
        int cp=sc.nextInt();
        System.out.println("enter a sellingprice");
        int sp=sc.nextInt();
        if(sp>cp)System.out.println("profit is"+(sp-cp));
        if(cp>sp)        System.out.println("loss is"+(cp-sp));
        if(cp==sp)System.out.println("no profit no loss");
    
}
}
