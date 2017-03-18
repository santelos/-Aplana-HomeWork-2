/**
 * Created by Петр on 18.03.2017.
 */
public class Task_16 {
    public static void main(String[] args) {
        int c=0;
        for (int i=1; i<100000;i++) {

            int n=i;
            //поиск 4 в числе
            do {
                if (n%10==4) c++;
                n/=10;
            }while(n!=0);

            //поиск 13 в числе
            n=i;
            do {
                if (n%100==13) c++;
                n/=10;
            }while(n!=0);

        }
        System.out.println(c);
    }
}
