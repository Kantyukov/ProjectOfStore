package ru.artem.kantyukov;

import ru.artem.kantyukov.services.StoreService;
import ru.artem.kantyukov.services.StoreServiceImpl;

public class MyApplication {
    public static void main(String[] args) {
        StoreService storeService = new StoreServiceImpl();


        storeService.start();
    }
}
