import java.util.Scanner;

public class ArrayHolder {

  private  int[] mas;
    private int lengthmas;

    public ArrayHolder(int[] mas, int lengthmas) {
    }

    public int[] getmas() { return mas; }
    public int getlengthmas() { return lengthmas; }

    public ArrayHolder(int[] mas, int lengthmas,int num){

        this.mas=mas;
        this.lengthmas=lengthmas;

    }
    public void getnumtomas(){

        System.out.println("Loanding....");

        System.out.println("Введите размер массива: ");
        Scanner num=new Scanner(System.in);
        lengthmas=num.nextInt();
        mas=new int[getlengthmas()];
        for (int f = 0; f < getmas().length; f++) {
            System.out.println("Введите значение массива " + f + ":");
            getmas()[f] = num.nextInt();
    }
}}

