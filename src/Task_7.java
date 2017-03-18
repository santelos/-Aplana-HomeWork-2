/**
 * Created by Петр on 18.03.2017.
 */
public class Task_7 {
    public static void main(String[] args) {
        // в n может быть большое число, значит double
        double n=2;
        //последовательность a[n+1]=a[n]*2, a[0]=2
        for (int i=0;i<22;i++)
        {
            System.out.println(n);
            n*=2;
        }
    }
}
