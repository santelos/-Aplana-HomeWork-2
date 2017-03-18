import java.util.Scanner;

/**
 * Created by Петр on 18.03.2017.
 */
public class Task_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String inN;
        int n=0;

        //ввод с клавиатуры
        System.out.print("N= ");
        do{
            inN = scan.next();
            if (isNDigit(inN)) n = Integer.parseInt(inN);
            else System.out.println("ERROR");
        }while (!isNDigit(inN));

        //поиск и вывод делителей
        for (int i=1;i<n;i++) if (n%i==0) System.out.println(i);

    }
    //метод проверки введенного значения (не буквенная строка, натуральное число)
    public static boolean isNDigit(String s){
        try{
            if(Integer.parseInt(s)>0) return true;
            else return false;
        }catch (NumberFormatException exc){
            return false;
        }
    }
}
