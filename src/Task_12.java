import java.util.Scanner;

/**
 * Created by Петр on 18.03.2017.
 */
public class Task_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inN;
        int n=0;

        //ввод с клавиатуры
        System.out.print("N = ");
        do
        {
            inN = scan.next();
            if (isNDigit(inN)) n = Integer.parseInt(inN);
            else System.out.println("ERROR");
        }while (!isNDigit(inN));

        //подсчет суммы цифр
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        System.out.println("Сумма цифр = "+sum);

    }

    //метод проверки введенного значения (не буквенная строка, натуральное число)
    public static boolean isNDigit(String s)
    {
        try
        {
            if(Integer.parseInt(s)>0) return true;
            else return false;
        }catch (NumberFormatException exc)
        {
            return false;
        }
    }
}
