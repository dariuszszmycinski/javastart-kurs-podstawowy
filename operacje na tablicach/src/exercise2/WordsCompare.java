package exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class WordsCompare {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszy napis: ");
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        System.out.println("Podaj drugi napis: ");
        String line2 = sc.nextLine();
        sc.close();
        if (sameLine(line1,line2)==true){
            System.out.println("Napisy zawierają te same znaki.");
        }else {
            System.out.println("Napisy zawierają różne znaki.");
        }

    }

    static boolean sameLine(String line1, String line2){
        if (line1==null&&line2==null){
            return true;
        } else if (line1==null||line2==null||line1.length()!=line2.length()){
            return false;
        }else {
            return sameCharArrays(line1.toCharArray(),line2.toCharArray());
        }
    }



    static boolean sameCharArrays (char[] array1, char[] array2){

        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1,array2);
    }

}
