package exercise1;

public class Calculation {
    static int[] numbers1 = {5, 10, 15};
    static int[] numbers2 = {10, 20, 30};

    public static void main(String[] args) {

        int result = numbers1[0] + numbers1[1] + numbers1[2] + numbers2[0] + numbers2[1] + numbers2[2];
        System.out.println(result);
        System.out.println(sum());

    }

    private static int sum(){
        return numbers1[0] + numbers1[1] + numbers1[2] + numbers2[0] + numbers2[1] + numbers2[2];
    }
}
