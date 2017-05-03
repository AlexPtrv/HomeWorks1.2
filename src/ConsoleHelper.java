import java.util.Arrays;
import java.util.Scanner;

public class ConsoleHelper {
    private Scanner scn=new Scanner(System.in);
    private int selection;
    ArrayHolder arrayHolder=new ArrayHolder();
public void start() {

    hello();
    arrayHolder.getnumtomas();
    arrayHolder.valuesofarraays();
    menu();

    for (int f=0;f<20000000;f++){
        if (scn.hasNextInt()) {
            choiceinmenu();
        } else
            System.out.println("Пожалуйста введите только от 1 до 3!");
    }}

    private void choiceinmenu() {
        do {
            selection=scn.nextInt();

        switch (selection){
            case 1 :
                arrayHolder.Sort();
                findAfterSort();
                break;
            case 2:
                arrayHolder.findAnum();
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
    String s="";
        System.out.println("Введите число от 1 до 3!");

        }

private void hello(){
    System.out.println("Привет!!");
    System.out.println("Запуск програмы");
    System.out.println("Загрузка.....");
}
private void sortAfterFind() {

    System.out.println("Хотите сделать сортировку чисел?Если да, введите цифру 1 \n" +
            "Если нет, нажмите любую цыфру кроме 1. ");
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

    System.out.println("Хотите найти число по значению введите цифру 2\n" +
            "Если нет, нажмите любую кнопку кроме 2. ");
    for(int f2=0;f2<2;){
       scn.hasNext();
        if (scn.hasNextInt()){
            arrayHolder.findAnum();}
        else
            System.out.println("Выход...");

}

}}