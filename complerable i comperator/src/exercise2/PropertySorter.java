package exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class PropertySorter {
    public static void main(String[] args) throws FileNotFoundException {
        final String fileName = "properties.txt";
        Property[] properties = readFile(fileName);
        System.out.println(Arrays.toString(properties));
        Arrays.sort(properties);
        System.out.println(Arrays.toString(properties));
    }

    static Property[] readFile(String fileName) throws FileNotFoundException {
        final int linesNumber = 10;
        Property[] properties = new Property[linesNumber];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            for (int i = 0; i < linesNumber; i++) {
                String txtLine = scanner.nextLine();
                properties[i] =  createPropertyFromTxt(txtLine);
            }
        }catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        }
        return properties;
    }

    private static Property createPropertyFromTxt(String line){
        String[] data = line.split(";");
        String city = data[0];
        double price = Double.parseDouble(data[1]);
        double area = Double.parseDouble(data[2]);
        return new Property(city,price,area);
    }
}
