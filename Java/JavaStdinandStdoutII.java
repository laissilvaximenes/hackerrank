import java.util.Scanner;

public class JavaStdinandStdoutII {
    
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        int inInteger = scannerInt.nextInt();
        scannerInt.close();

        Scanner scannerDouble = new Scanner(System.in);
        double inDouble = scannerDouble.nextDouble();
        scannerDouble.close();

        Scanner scannerString = new Scanner(System.in);
        String inString = scannerString.nextLine();
        scannerString.close();

        
        System.out.println("String: " + inString);
        System.out.println("Double: " + inDouble);
        System.out.println("Int: " + inInteger );

    }

}

