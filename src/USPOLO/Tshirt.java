package USPOLO;
import java.util.Scanner;

public class Tshirt {
        public void scanner(){
            System.out.println("PUMA,USPOLO,NIKE,MAX");
            Scanner sc=new Scanner(System.in);
            System.out.println("select your brand");
            String brand=sc.next();
            System.out.println("T shirt count");
            int count= sc.nextInt();
            System.out.println("T shirt colour");
            String colour= sc.next();
            System.out.println("T shirt size");
            char size=sc.next().charAt(0);

        }


    }

