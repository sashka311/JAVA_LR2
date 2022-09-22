import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This task done by Ihor Garashchenko SE-19-1/9");
        Random rand = new Random();
        int n = rand.nextInt(50);
        System.out.println("Random number [1-50] = "+ n);
    }
}