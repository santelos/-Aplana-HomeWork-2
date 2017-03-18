import java.util.Random;

/**
 * Created by Петр on 18.03.2017.
 */
public class Task_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        //генератор случайных чисел
        int t=rand.nextInt(28800);
        System.out.println(t+"\n");
        t/=3600;

        //условия для разного написания (час, часа, часов, меньше часа)
        if (t>1 && t<5) System.out.println("Осталось "+t+" часа");
        else{
            if (t>4) System.out.println("Осталось "+t+" часов");
            else{
                if (t==1) System.out.println("Остался "+t+" час");
                else{
                    if (t==0) System.out.println("Осталось меньше часа");
                    else{
                        System.out.println("ERROR");
                    }
                }
            }
        }

    }
}
