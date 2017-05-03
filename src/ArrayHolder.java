import java.util.Arrays;
import java.util.Scanner;

public class ArrayHolder {


    private Scanner scn1=new Scanner(System.in);
        private int[] mas;
        private int lengthmas;



    public int[] getmas () {
            return mas;
        }

    public int getlengthmas() {
        return lengthmas;
    }

     void getnumtomas() {
        System.out.println("Введите размер массива: ");
            scn1.hasNext();
         if (scn1.hasNextInt()) {
             lengthmas = scn1.nextInt();
            mas = new int[getlengthmas()];}
             else if (scn1.hasNext()){
             System.out.println("Пожалуйста введите только число!");
         }

         valuesofarraays();
     }

 void valuesofarraays() {
        for (int f = 0; f < getmas().length; f++) {
            System.out.println("Введите значение массива " + f + ":");
            getmas()[f] = scn1.nextInt();
        }
    }

    void Sort() {

         Arrays.sort(getmas());
         System.out.println(Arrays.toString(getmas()));

         }

void findAnum() {


    System.out.println("В масиве есть такие числа:"+Arrays.toString(getmas()));
    System.out.println("Введите число, которое нужно найти: ");
    int number = scn1.nextInt();
    for (int f2 = 0; f2 < getmas().length; f2++) {
        if ( number==getmas()[f2] ){
            System.out.println("Число " + number + " является " + (f2 + 1) + " по счету в массиве " +
                    "и содержиться в ячейке № " + f2);}
       else if (number != getmas()[f2]) {
                System.out.println("Введите другое число.");
                findAnum();

            }     }
    }
    }






