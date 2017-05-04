import java.util.Arrays;
import java.util.Scanner;

public class ConsoleHelper {
    private Scanner scn=new Scanner(System.in);
    private int selection;
    ArrayHolder arrayHolder=new ArrayHolder();
public void start() {

    System.out.println("Привет!!");
    System.out.println("Запуск програмы");
    System.out.println("Загрузка.....");
    System.out.println("Введите размер массива: ");
    arrayHolder.getNumToMas();
    arrayHolder.valuesOfArraays();
    menu();

    for (int f=0;f<20000000;f++){
        if (scn.hasNextInt()) {
            choiceInMenu();
        } else
            System.out.println("Пожалуйста введите только от 1 до 3!");
    }}

    private void choiceInMenu() {
        do {
            selection=scn.nextInt();

        switch (selection){
            case 1 :
                arrayHolder.Sort();
                System.out.println("Хотите найти число по значению введите цифру 2\n" +
                        "Если нет, нажмите любую кнопку кроме 2. ");
                findAfterSort();
                break;
            case 2:
                System.out.println("В масиве есть такие числа:"+Arrays.toString(arrayHolder.getmas()));
                System.out.println("Введите число, которое нужно найти: ");
                arrayHolder.findANum();
                System.out.println("Хотите сделать сортировку чисел?Если да, введите цифру 1 \n" +
                        "Если нет, нажмите любую цыфру кроме 1. ");
            sortAfterFind();
                break;
            case 3:
                goodbye();
                break;
            default:

                error();
                break;
        }

        }while (selection!=2);
    }


    private void menu() {
        System.out.println("1.Для сортировки чисел введите цифру 1 \n" +
                "2.Для поиска числа по значению введите цифру 2\n" + "3.Если хотите выйти нажмите любую кнопку.");

    }

    private void goodbye() {
        System.out.println("Досвидание");
        System.out.println("Выход.....");
    }
    private void error(){
        System.out.println("Введите число от 1 до 3!");

        }

private void sortAfterFind() {

    int selection2 = scn.nextInt();
    switch (selection2) {
        case 1:
            arrayHolder.Sort();
            break;
        default:
            System.out.println("Выход...");
            break;
    }
}
private void findAfterSort(){


        scn.hasNext();
    if (scn.hasNextInt(2)){
            arrayHolder.findANum();}
        else
            System.out.println("Выход...");

}
}