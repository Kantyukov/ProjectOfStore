package ru.artem.kantyukov.services;

import lombok.RequiredArgsConstructor;
import ru.artem.kantyukov.domain.Client;
import ru.artem.kantyukov.domain.MobilePhones;

import java.util.Scanner;


@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final MobilePhoneService mobilePhoneService;




    @Override
    public void buyPhone() {
        System.out.println("Выберете модель телефона");
        String model = scanner.next();
        if (mobilePhoneService.hasPhone(model)){
            System.out.println("Продолжите покупку телефона");
            mobilePhoneService.takePhoneByName(model);
            System.out.println("Купили телефон = " + model);
            System.out.println("Поздравляем, вы купили нввый телефон");
        }else {
            System.out.println("Очень жаль. Но требуемые телефоны закончились. Вы можете выбрать другой");
        }

    }

    @Override
    public void putPhone() {
        System.out.println("Выберете модель телефона");
        String model = scanner.next();

        System.out.println("Выберете название производителя");
        String company = scanner.next();


        System.out.println("Выберете название цену");
        int price = scanner.nextInt();

        MobilePhones mobilePhones = new MobilePhones(model, company, price);
        mobilePhoneService.putPhone(mobilePhones);

    }

    @Override
    public void printPhone() {
        System.out.println("В магазине доступны следующие телефоны: ");
        mobilePhoneService.printPhone();

    }
}
