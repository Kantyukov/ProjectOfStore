package ru.artem.kantyukov.services;

import ru.artem.kantyukov.domain.Client;
import ru.artem.kantyukov.domain.MobilePhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше ФИО");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List<MobilePhone> phonesList = new ArrayList<>();
        phonesList.add(new MobilePhone("iPhone_13_Pro_Max", "Apple", 140_000));
        phonesList.add(new MobilePhone("iPhone_13_Pro", "Apple", 100_000));

        MobilePhoneService mobilePhoneService = new MobilePhoneServiceImpl(phonesList);
        ClientService clientService = new ClientServiceImpl(client, scanner, mobilePhoneService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);
        menuService.printMenu();
        menuService.menu();


    }
}
