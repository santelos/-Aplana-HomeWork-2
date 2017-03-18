/**
 * Created by Петр on 18.03.2017.
 */
public class Task_13 {
    public static void main(String[] args) {
        int c=0;

        for (int i=1001; i<1000000;i++) {
            int n1,n2,sum1=0,sum2=0;
            //разбивка на 2 элемента - первые 3 цифры и последние 3
            n1=i/1000; n2=i%1000;

            //сумма цифр каждого элемента
            while(n1!=0) {
                sum1+=n1%10;
                n1/=10;
            }
            while(n2!=0) {
                sum2+=n2%10;
                n2/=10;
            }

            //сравнивается, и если равно, то это счастливый билет
            if (sum1==sum2) c++;
        }
        System.out.println("Кол-во счастливых билетов = "+c);

    }
}
