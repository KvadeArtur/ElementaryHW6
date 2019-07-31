package com.kvart;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Реализация HashMap
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("1", "qwer");
        myHashMap.put("2", "asdf");
        myHashMap.put("3", "yxcv");
        myHashMap.put("4", "tzui");

        System.out.println(myHashMap);

        //Проверка на наличие
        System.out.println(myHashMap.containsKey("2"));

        //Возврат елемента
        System.out.println(myHashMap.get("3"));

        //Удаление
        myHashMap.remove("3");
        System.out.println(myHashMap);


        /*
        Aльтернативное задание:
        Написать метод который принимает 2 строки - a, b.
        Метод должне вернуть количество символов которые у них различаются.
        Если строки разной длины то вернуть -1.
        Примеры:

        a="asdf", b="qwerty" => -1
        a="abb", b="bba" => 0
        a="abc", b="dca" => 1
        a="aaa", b="fga" => 2
        a="abc", b="dfg" => 3
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        String str1 = scanner.nextLine();

        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();

        System.out.println(containsString (str1, str2));
    }

    private static int containsString(String str1, String str2) {
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();

        int score = 0;
        if (arrStr1.length != arrStr2.length) {
            return -1;
        } else {
            for (int i = 0; i < arrStr1.length; i++) {
                for (int j = 0; j < arrStr2.length; j++) {
                    if (arrStr1[i] == arrStr2[j]) {
                        score++;
                        break;
                    }
                }
            }
            return str1.length() - score;
        }
    }
}
