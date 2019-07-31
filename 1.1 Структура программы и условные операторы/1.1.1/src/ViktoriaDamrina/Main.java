package ViktoriaDamrina;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*--------------------------------------------------------------------------*/
        Calendar now = Calendar.getInstance(); // создаём экземнпляр класса Calendar
        int todayYear = now.get(Calendar.YEAR); // создаём переменную и передаём в неё значения года в данный момент
        /* todayYear для проверки вводимого года на то, что он больше текущего*/
        int inputYear = 0;

        do {  // Старт цикла
            Scanner scanYear = new Scanner(System.in);
            System.out.println("Введите год в формате \"yyyy\"");
            if (scanYear.hasNextInt()){ // проверяем введенные данные на тип, если строка, запускаем цикл заново, если нет
                    inputYear = scanYear.nextInt();// присваеваем значение введёных даных переменной inputYear
                if (inputYear < todayYear){ // Проверяем введный год на условие меньше ли он текущего,
                System.out.println("Год должен быть не меньше текущего"); // если да, запускаем цикл заново
            } else { // если год больше текущего, то начинаем проверку на Високосный год
                    if (inputYear % 400 == 0){
                        System.out.println("Количество дней 366 ");
                    } else if (inputYear % 100 == 0){
                        System.out.println("Количество дней 365 ");
                    } else if (inputYear % 4 == 0 ){
                        System.out.println("Количество дней 366 ");
                    } else
                        System.out.println("Количество дней 365 ");
                }
            }
        } while(inputYear < todayYear); // условие выхода из цикла


    }
}
