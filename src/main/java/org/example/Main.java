package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.print("Введите размер списка: ");
        int N = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>(N);
        logger.log("Создаем список из " + N + " элементов");

        System.out.print("Введите верхнюю границу для значений: ");
        int M = Integer.parseInt(scanner.nextLine());
        logger.log("Наполняем список");
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(M));
        }

        logger.log("Список создан");
        System.out.println("Созданный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = Integer.parseInt(scanner.nextLine());

        logger.log("Запускаем фильтрацию");

        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList);
        logger.log("Завершаем программу");

    }
}