package tem3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("n=");
        int n=scanner.nextInt();
        int i=2;
        int a=1;
        while(i<n){
            if(n%i==0){
                System.out.println(i);
                a=0;
            }
            i++;
        }
        if(a==1){
            System.out.println("numarul este prim");
        }
    }
}
