package hometask;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Random;

import static java.lang.Math.random;


public class hometask2 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1 = Inp(5);

        System.out.println("Минимальное значение: ");
        System.out.println("Массив -> + list1");
        System.out.println("max = " + Collections.max(list1));
        System.out.println("min = " + Collections.min(list1));
        System.out.println("Среднее = " + middle(list1));
    }

    public static ArrayList Inp(int n) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(new Random().nextInt(100));

        }
        return list; 
    }

    public static double middle(ArrayList<Integer> list) {
        long sum = 0;
        for (int i: list) {
            sum += i;

        }
        return list.size()>0 ? (double) sum/list.size():0;
    }
}
