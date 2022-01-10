package ru.artem.kantyukov.services;

import ru.artem.kantyukov.domain.MobilePhone;

public interface MobilePhoneService {
    MobilePhone takePhoneByName(String name);

    void putPhone(MobilePhone phones);

    boolean hasPhone(String name);

    void printPhone();

}
