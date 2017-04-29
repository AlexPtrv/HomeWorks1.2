import java.util.Arrays;
import java.util.Scanner;

public class ConsoleHelper extends ArrayHolder {


    public ConsoleHelper(int[] mas, int lengthmas) {
        super(mas, lengthmas);
    }

    public void getnumtomas {

        System.out.println("1.Для сортировки чисел введите цифру 1 \n" +
                "2.Для поиска числа по значению введите цифру 2\n" + "3.Если хотите выйти нажмите любую кнопку.");
        Scanner num1=new Scanner(System.in);
        int selection = num1.nextInt();

        if (selection == 1) {
            Scanner numSort = new Scanner(System.in);
            Arrays.sort(getmas());
            System.out.println(Arrays.toString(getmas()));


            System.out.println("Хотите найти число по значению введите цифру 2\n" +
                    "Если нет, нажмите любую цыфру кроме 2. ");
            int selection1 = numSort.nextInt();

            if (selection1 == 2) {
                Scanner numFind = new Scanner(System.in);
                System.out.println("Введите число, которое нужно найти: ");
                int number = numFind.nextInt();
                for (int f1 = 0; f1 < getmas().length; f1++) {
                    if (number == getmas()[f1]) {
                        System.out.println("Число " + number + " является " + (f1 + 1) + " по счету в массиве " +
                                "и содержиться в ячейке № " + f1);
                    } else if (number != getmas()[f1]) {
                        System.out.println("Введите другое число.");

                        if (selection1 != 2) {
                            System.out.println("Выход...");

                        }}}}}
                     if (selection == 2) {
                        Scanner numFind = new Scanner(System.in);
                        System.out.println("Введите число, которое нужно найти: ");
                        int number = numFind.nextInt();
                        for (int f2 = 0; f2 < getmas().length; f2++) {
                            if (number == getmas()[f2]) {
                                System.out.println("Число " + number + " является " + (f2 + 1) + " по счету в массиве " +
                                        "и содержиться в ячейке № " + f2);}
                            else if (number!=getmas()[f2]){
                                System.out.println("Введите другое число.");

                        System.out.println("Хотите сделать сортировку чисел?Если да, введите цифру 1 \n" +
                                "Если нет, нажмите любую цыфру кроме 1. ");
                        Scanner num2Sort = new Scanner(System.in);
                        int selection2 = num2Sort.nextInt();
                        if (selection2 == 1) {
                            Scanner numSort = new Scanner(System.in);
                            Arrays.sort(getmas());
                            System.out.println(Arrays.toString(getmas()));
                        } else if (selection2 != 1) {
                            System.out.println("Выход...");


                        }
                    } else {
                        System.out.println("Выход...");

                    }
                }
            }}}


