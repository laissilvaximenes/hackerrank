
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        

        // If  is odd, print Weird
        // If  is even and in the inclusive range of  to , print Not Weird
        // If  is even and in the inclusive range of  to , print Weird
        // If  is even and greater than , print Not Weird
    }
}
