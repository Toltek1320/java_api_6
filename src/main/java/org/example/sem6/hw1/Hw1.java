package org.example.sem6.hw1;
// • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// • Создать множество ноутбуков.
// • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Hw1 {
    public static void main(String[] args) {
        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook1", "black", 4, "Windows 11", 60000, "Acer"));
        set.add(new Notebook("Notebook2", "black", 8, "Windows 11", 65000, "Asus"));
        set.add(new Notebook("Notebook3", "black", 16, "Windows 10", 70000, "HP"));
        set.add(new Notebook("Notebook4", "gray", 32, "linux", 75000, "Samsung"));
        set.add(new Notebook("Notebook5", "gray", 16, "linux", 70000, "Lenovo"));
        set.add(new Notebook("Notebook6", "gray", 8, "linux", 65000, "Asus"));

        OperationNote operation = new OperationNote(set);
        operation.start();

    }
}