package ru.artem.kantyukov.services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final ClientService clientService;
    private final Scanner scanner;


    @Override
    public void menu() {

        while (true) {
            System.out.println("ВВедите номер меню");
            int menuNum = scanner.nextInt();
            if (menuNum == 1) {
                System.out.println("Вы выбрали купить телефон");
                clientService.buyPhone();
            } else if (menuNum == 2) {
                System.out.println("Вы добавили телефон");
                clientService.putPhone();
            } else if (menuNum == 3) {
                System.out.println("Вывести весь список");
                clientService.printPhone();

            } else {
                System.out.println("До встрчеи");
            }
        }
    }

    @Override
    public void printMenu() {
        System.out.println("1 - купить телефон");
        System.out.println("2 - добавить телефон");
        System.out.println("3 - вывести весь список");
        System.out.println("4 - все остальное, выход");

    }
}
