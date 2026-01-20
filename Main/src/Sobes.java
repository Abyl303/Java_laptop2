import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Sobes {

    public static void main(String[] args){
        int n = 15;
        System.out.println(new String(fizzbuzzTest(n), StandardCharsets.UTF_8));
    }

    public static byte[] fizzbuzzTest(int value){
        if(value%3==0 && value%5==0){
            return "FizzBuzz".getBytes();
        }
        else if(value%3==0){
            return "Fizz".getBytes();
        }
        else if(value%5==0){
            return "Buzz".getBytes();
        }
        else throw new IllegalArgumentException("Not divisible by 3 or 5: " + value);
    }
}
