/**
 * Created by Петр on 18.03.2017.
 */
public class Task_15 {
    public static void main(String[] args) {
        int c=0;
        for (int i=0;i<24;i++)
            // (j%10)*10+(j/10) - свап единиц и десятков
            // у минут для сравнения с часами
            for (int j=0;j<60;j++) if (((j%10)*10+(j/10))==i) c++;

        System.out.println("Ответ = "+c);
    }
}
