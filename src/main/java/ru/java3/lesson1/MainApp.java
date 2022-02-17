package ru.java3.lesson1;

import ru.java3.lesson1.task3.Apple;
import ru.java3.lesson1.task3.Box;
import ru.java3.lesson1.task3.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        String[] seasons  = {"Winter", "Spring", "Summer", "Autumn"};
        ArrayList arrayList = new ArrayList();
        System.out.println(Arrays.toString(seasons));
        Change(seasons, 1,2);
        System.out.println(Arrays.toString(seasons));
        ArrayToArrayList(seasons,arrayList);
        System.out.println(arrayList.toString());

        Box<Orange> orangeBox = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
    }


    public static void Change(Object array[], int a, int b) {
        Object element1 = array[a];
        Object element2 = array[b];
        array[a] = element2;
        array[b] = element1;
    }

    public static void ArrayToArrayList(Object array[], ArrayList arrayList){
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }


    }
}
