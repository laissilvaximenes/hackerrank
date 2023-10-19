import java.io.*;
import java.util.*;

/* Task:
In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. */

public class  JavaStdinandStdoutI {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        scanner.close();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}