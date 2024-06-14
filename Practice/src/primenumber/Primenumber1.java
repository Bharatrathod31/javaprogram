package primenumber;
import java.util.Scanner;

public class Primenumber1 {
    //int no;
    //boolean isPrime=true;
    //int j;
    public static void main(String[] args) {
       
        
        boolean isPrime=true;
        int j;
        int no;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no to check if it prime no in given range: ");
        //Primenumber1 pm=new Primenumber1();
        no=scanner.nextInt();
        //no=j;
        for (j=2;j<=no;j++){
            isPrime=true;
            
            for (int i =2;(i*i <=j);i++){
                if(j%i ==0){
                    isPrime=false;
                    break;
                }

            }
            if(isPrime){
                System.out.println("This no is not prime no: "+j);
            }
            
            

        }
        
       // pm.j=scanner.nextInt();

    }


}
