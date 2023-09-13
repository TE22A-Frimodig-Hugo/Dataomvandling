import java.util.Scanner;

public class App {
            public static void main(String[] args) {
                // int dividend = 4;   // Dividend (4)
                // int divisor = 5;    // Divisor (5)
        
                // // Typomvandling till double för att få decimalkvoten
                // double decimalKvot = (double) dividend / divisor;
        
                // // Heltalsdivision ger heltalskvoten (avrundas mot noll)
                // int heltalsKvot = dividend / divisor;
        
                // // Skriv ut resultatet
                // System.out.println("Kvoten som decimaltal: " + decimalKvot);
                // System.out.println("Kvoten som heltal: " + heltalsKvot);

                Scanner tangentbord = new Scanner(System.in);
                System.out.print("Ange tal1:");
                int tal1 = tangentbord.nextInt();
                System.out.print( "Ange tal2:");
                int tal2 = tangentbord.nextInt();
                double kvot = (double)tal1/tal2;

                System.out.println("kvoten är "+kvot) ;
                System.out.println("");

            }
     
    }
