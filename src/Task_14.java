/**
 * Created by Петр on 18.03.2017.
 */
public class Task_14 {
    public static void main(String[] args) {
        int c=0;
        for (int i=1; i<=50000 ;i++) {
            int n=i;
            //поиск цифры 2 и выход из do-while если найдена хотя бы одна двойка
            do {
                if (n%10==2){c++; break;}
                n/=10;
            }while(n!=0);
        }
        System.out.println(c);
    }
}
