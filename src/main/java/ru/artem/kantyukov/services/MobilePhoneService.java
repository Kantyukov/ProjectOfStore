package ru.artem.kantyukov.services;

import ru.artem.kantyukov.domain.MobilePhones;

public interface MobilePhoneService {
    MobilePhones takePhoneByName(String name);

    void putPhone (MobilePhones phones);

    boolean hasPhone (String name);

    void printPhone();

}
