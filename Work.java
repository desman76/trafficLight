package ru.lessons.Pavel.trafficLight;

import java.util.ArrayList;
import java.util.Scanner;

class Work {
    private Color red;
    private Color yellow;
    private Color green;

    void init() {
        red = new Red("Красный");
        yellow = new Yellow("Желтый");
        green = new Green("Зеленый");

        ArrayList<Color> colors = new ArrayList<>();
        colors.add(red);
        colors.add(yellow);
        colors.add(green);

        Scanner scanner = new Scanner(System.in);

        for (Color currentColor : colors) {
            System.out.println("Введите количество секунд для цвета: " + currentColor.getName());
            while (currentColor.getSeconds() == 0) {
                if (scanner.hasNextInt()) {
                    int seconds = scanner.nextInt();
                    currentColor.setSeconds(seconds);
                } else {
                    System.out.println("Введите числовое значение: ");
                    scanner.next();
                }
            }
        }
    }

    void start() {
        red.toBurn();
        yellow.toBurn();
        green.toBurn();
    }
}
