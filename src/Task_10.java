import java.util.Scanner;

/**
 * Created by Петр on 18.03.2017.
 */
public class Task_10 {
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


        //если найден делитель, то завершаем выполнение программы
        for (int i=2;i<Math.sqrt(n);i++) if (n%i==0){ System.out.println("Число - не простое"); return;}
        //иначе делитель не найден, значит число - простое
        System.out.println("Число - простое");

    }

    //метод проверки введенного значения (не буквенная строка, не отрицательное число)
    public static boolean isNDigit(String s){
        try{
            if(Integer.parseInt(s)>0) return true;
            else return false;
        }catch (NumberFormatException exc){
            return false;
        }
    }
}
