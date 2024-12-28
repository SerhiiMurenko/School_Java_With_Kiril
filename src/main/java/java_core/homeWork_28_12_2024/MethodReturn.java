package java_core.homeWork_28_12_2024;

public class MethodReturn {
    public static void main(String[] args) {
        average(5,5,1);

    }

    public static int average(int x, int y, int z) {
        int average = ((x + y + z) / 3);
        System.out.println(average);
        return (int) Math.floor(average);
    }
}
