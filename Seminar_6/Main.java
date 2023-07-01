package org.example.Seminar1.HomeWork.Seminar_6;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nbook nbook1 = new Nbook("Aser", 8, 500,"Wind", "Black", 40000);
        Nbook nbook2 = new Nbook("HP", 16, 1000,"Mac", "Red", 60000);
        Nbook nbook3 = new Nbook("Asus", 8, 7500,"Lin", "Silver", 50000);
        Nbook nbook4 = new Nbook("Dell", 16, 1000,"Wind", "Blue", 70000);
        Nbook nbook5 = new Nbook("Lenovo", 8, 500,"Mac", "White", 35000);
        Nbook nbook6 = new Nbook("Samsung", 32, 1000,"Lin", "Gold", 100000);
        ArrayList<Nbook> nbookArrayList = new ArrayList<>();
        nbookArrayList.add(nbook1);
        nbookArrayList.add(nbook2);
        nbookArrayList.add(nbook3);
        nbookArrayList.add(nbook4);
        nbookArrayList.add(nbook5);
        nbookArrayList.add(nbook6);
        //System.out.println(nbookArrayList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название ноутбука: ");
        String searchName = scanner.nextLine();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем ОЗУ: ");
        Integer searchOzu = scanner.nextInt();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем жесткого диска: ");
        Integer searchOgd = scanner.nextInt();
        ArrayList<String> name = new ArrayList<>();
        for (int i = 0; i < nbookArrayList.size(); i++) {
            if(nbookArrayList.get(i).getName().equals(searchName) && nbookArrayList.get(i).getOzu().equals(searchOzu) &&
                    nbookArrayList.get(i).getOgd().equals(searchOgd)){
                name.add(nbookArrayList.get(i).getName());
            }

        }
        System.out.println("Вашему выбору соответствует ноутбук = " + name);

    }

}
