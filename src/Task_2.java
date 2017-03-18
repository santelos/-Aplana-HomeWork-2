/**
 * Created by Петр on 18.03.2017.
 */

import java.util.Random;

    public class Task_2 {
        public static void main(String[] args) {
            Random rand = new Random();
            //генератор случайных чисел
            int n=rand.nextInt(899)+100,max=0,nM=n;

            //поиск макс. цифры
            while (n>0)
            {
                if (n%10>max) max = n%10;
                n/=10;
            }

            System.out.println("В числе "+nM+" наибольшая цифра "+max);
        }
}
