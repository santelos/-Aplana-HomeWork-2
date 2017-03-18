import java.util.Scanner;

/**
 * Created by Петр on 18.03.2017.
 */
public class Task_8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String inN;
        int n=0;
        //в f может быть большое число, значит double
        double f=1;

        //ввод с клавиатуры
        System.out.print("N= ");
        do{
            inN = scan.next();
            if (isNDigit(inN)) n = Integer.parseInt(inN);
            else System.out.println("ERROR");
        }while (!isNDigit(inN));

        //вычисление факториала
        //если 0, то останавливаем выполнение программы на этом моменте
        if (n==0){ System.out.println("N! = 1"); return;}
        //подсчет факториала
        while (n>0) {
            f *= n--;
        }
        System.out.println("N! = "+f);
    }

    //метод проверки введенного значения (не буквенная строка, не отрицательное число)
    public static boolean isNDigit(String s){
        try{
            if(Integer.parseInt(s)>=0) return true;
            else return false;
        }catch (NumberFormatException exc){
            return false;
        }
    }
}
