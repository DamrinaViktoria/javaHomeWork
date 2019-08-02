package ViktoriaDamrina;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int leftBorderFirstTask = 25;
        int rightBorderFirstTask = 25;
        int leftBorderSecondTask = 25;
        int rightBorderSecondTask = 25;
        int chekIntersect = 0;

        System.out.println("   ПРИ РАБОТЕ С ДАННОЙ ПРОГРАММОЙ ВАМ НЕОБХОДИМО:  \n" +
                           "1) ВВОДИТЬ ГРАНИЦЫ ВРЕМЕННЫХ ИНТЕРВАЛОВ ЗАДАЧ В ФОРМАТЕ HH \n" +
                           "2) ЛЕВАЯ ГРАНИЦА НЕ ДОЛЖНА БЫТЬ БОЛЬШЕ ПРАВОЙ ГРАНИЦЫ \n" +
                           "3) ЗНАЧЕНИЕ МОЖЕТ СОСТОЯТЬ ИЗ ЦИФР ОТ 0 ДО 24");


        // Начало блока ввода часовых интервалов
do {
    do {
        Scanner lineScan = new Scanner(System.in);
        System.out.println("Введите левую границу интервала первой задачи и нажмите Enter");
        if (lineScan.hasNextInt()) {
            System.out.println("Введите правую границу интервала первой задачи и нажмите Enter");
            leftBorderFirstTask = lineScan.nextInt();
            if (lineScan.hasNextInt()) {
                rightBorderFirstTask = lineScan.nextInt();
                System.out.printf("====================================================\n \n");
                System.out.println("Введите левую границу интервала второй задачи и нажмите Enter");
                if (lineScan.hasNextInt()) {
                    System.out.println("Введите правую границу интервала второй задачи и нажмите Enter");
                    leftBorderSecondTask = lineScan.nextInt();
                    if (lineScan.hasNextInt()) {
                        rightBorderSecondTask = lineScan.nextInt();
                        System.out.printf("====================================================\n \n");
                    }
                }
            }
        }
    } while (leftBorderFirstTask > 24 || rightBorderFirstTask > 24 || rightBorderSecondTask >24 || leftBorderSecondTask > 24);
    if(leftBorderFirstTask>rightBorderFirstTask || leftBorderSecondTask>rightBorderSecondTask){
        System.out.println(" Левая граница задачи не может быть больше правой. \n ");
        System.out.printf("====================================================\n \n \n");
    }
} while (leftBorderFirstTask>rightBorderFirstTask || leftBorderSecondTask>rightBorderSecondTask);
// Окончание блока введения интервалов.



//===========================================================================================
// Новая блок проверки пересечения задач
        System.out.printf("====================================================\n");
        System.out.println("Новая реализация проверки пересечения задач!");
        System.out.printf("====================================================\n");

for (int i = leftBorderFirstTask; i <=rightBorderFirstTask; i++){
    for (int j = leftBorderSecondTask; j<=rightBorderSecondTask; j++){
        if (i==j)
         chekIntersect = 1;
    }
    }

if (chekIntersect!=0){
    System.out.println("Задачи пересекаются во времени!\n");
} else
    {
    System.out.println("Задачи не пересекаются во времени!\n");
}


//===========================================================================================
// Старая блок проверки пересечения задач
        System.out.printf("====================================================\n");
        System.out.println("Старая реализация проверки пересечения задач!");
        System.out.printf("====================================================\n");
            if (leftBorderFirstTask>leftBorderSecondTask  &&
                leftBorderFirstTask>rightBorderSecondTask &&
                rightBorderFirstTask>leftBorderSecondTask &&
                rightBorderFirstTask>rightBorderSecondTask)  { System.out.println("Задачи не пересекаются во времени!");
        } else
                if (leftBorderFirstTask<leftBorderSecondTask  &&
                    leftBorderFirstTask<rightBorderSecondTask &&
                    rightBorderFirstTask<leftBorderSecondTask &&
                    rightBorderFirstTask<rightBorderSecondTask) { System.out.println("Задачи не пересекаются во времени!");
        } else
            if     (leftBorderFirstTask>leftBorderSecondTask  &&
                    leftBorderFirstTask<rightBorderSecondTask) { System.out.println("Задачи пересекаются во времени!");
        } else
            if     (rightBorderFirstTask>leftBorderSecondTask &&
                    rightBorderFirstTask<rightBorderSecondTask) { System.out.println("Задачи пересекаются во времени!");
        } else
                 if(leftBorderFirstTask == leftBorderSecondTask   ||
                    leftBorderFirstTask == rightBorderSecondTask  ||
                    rightBorderFirstTask == rightBorderSecondTask ||
                    rightBorderFirstTask == leftBorderSecondTask){
            System.out.println("Задачи пересекаются во времени!");
        }
    }
}