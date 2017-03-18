/**
 * Created by Петр on 18.03.2017.
 */

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        //Генератор случайных чисел [5,155]
        int n=rand.nextInt(150)+5;
        //границы (25,125)
        if (n>25 && n<125) System.out.println("Число "+n+" содержится в интервале (25,100)");
        else System.out.println("Число "+n+" не содержится в интервале (25,100)");
    }
}
