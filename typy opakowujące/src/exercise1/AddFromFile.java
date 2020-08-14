package exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class AddFromFile {
    public static void main(String[] args) throws IOException {
        String fileName = "exercise1.txt";
        var fileReader = new FileReader(fileName);
        var reader = new BufferedReader(fileReader);
        Number[] numbers = new Number[5];

        try (
                fileReader;
                reader;
        ) {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                if (Long.valueOf(nextLine) > 10000) {
                    numbers[lines] = BigInteger.valueOf(Long.valueOf(nextLine));
                } else {
                    numbers[lines] = Integer.valueOf(nextLine);
                }
                System.out.println("Wczytano liczbę " + (lines + 1) + " : " + numbers[lines]);
                lines++;
            }
            System.out.println("Suma pierwszych trzech liczb: "+sumThree(numbers[0].intValue(),numbers[1].intValue(),numbers[2].intValue()));
            System.out.println("Suma liczby czwartej i piątej: "+sumBig(BigInteger.valueOf(numbers[3].longValue()),BigInteger.valueOf(numbers[4].longValue())));
        }
    }
    private static int sumThree(int a, int b, int c){
        return a+b+c;
    }

    private static BigInteger sumBig(BigInteger a, BigInteger b){
        return a.add(b);
    }

}
