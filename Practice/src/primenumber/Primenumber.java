package primenumber;
import java.util.Scanner;

public class Primenumber {
    int no=12;
    boolean isPrime=true;
    public static void main(String[] args) {
        //int no=13;
        //boolean isPrime=true;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter no to check it it is prime: ");
        Primenumber pn=new Primenumber();
        pn.no=scanner.nextInt();
        

        
        for (int i =2;i<pn.no;i++){
            if(pn.no%i==0){
                pn.isPrime=false;
                break;
            }

        }
        if (pn.isPrime){
            System.out.println("the no is prime no: "+pn.no);
        }
        
    }

}
