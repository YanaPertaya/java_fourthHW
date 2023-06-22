package hometask;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;

import static java.lang.Math.random;

// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

public class hometask {

     public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1 = InputMismatchException(5);

        System.out.println("Удаление чётных чисел: ");
        System.out.println("До -> + list1");
        

        for (int i = 0; i < list1.size(); i ++) {
            if ((Integer) list1.get(i) % 2 == 0) {
                list1.remove(list1.get(i));

            }
        }

        System.out.println("После ->" + list1);
            
        }

    private static ArrayList InputMismatchException(int i) {
        return null;
    }

        public static ArrayList Inp(int n) {
            ArrayList list = new ArrayList();
            for (int i = 0; i < n; i++) {
                list.add(new Random().nextInt(100));
            }
            return list;
        }


        
    }
    
