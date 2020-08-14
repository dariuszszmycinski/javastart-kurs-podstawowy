package exercise1;

public class ArrayCalculation {
    public static void main(String[] args) {
        double[][] table = new double[3][3];
        table[0][0] = 1.0;
        table[0][1] = 1.5;
        table[0][2] = 2;
        table[1][0] = 1.5;
        table[1][1] = 2;
        table[1][2] = 2.5;
        table[2][0] = 2;
        table[2][1] = 2.5;
        table[2][2] = 3;

        double diagonalSum = (table[0][0]*table[1][1]*table[2][2])+(table[1][1]*table[0][2]*table[2][0]);
        double middleRowsMultiply = (table[0][1]+table[1][1]+table[2][1])*(table[1][0]+table[1][1]+table[1][2]);
        double aroundSum = table[0][0]+table[0][1]+table[0][2]+table[1][0]+table[1][2]+table[2][0]+table[2][1]+table[2][2];

        System.out.println("Suma iloczynów przekątnych: "+diagonalSum);
        System.out.println("Iloraz środkowych rzędów: "+middleRowsMultiply);
        System.out.println("Suma obwodu: "+aroundSum);
    }
}
