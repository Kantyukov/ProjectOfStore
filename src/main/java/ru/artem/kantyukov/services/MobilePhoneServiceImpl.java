package ru.artem.kantyukov.services;

import lombok.RequiredArgsConstructor;
import ru.artem.kantyukov.domain.MobilePhone;

import java.util.List;



public class MobilePhoneServiceImpl implements MobilePhoneService {
    private final List<MobilePhone> listOfPhoneInStore;

    public MobilePhoneServiceImpl(List<MobilePhone> listOfPhoneInStore) {
        this.listOfPhoneInStore = listOfPhoneInStore;
    }


    @Override
    public MobilePhone takePhoneByName(String name) {
        MobilePhone resPhone = null;

        for (MobilePhone phones : listOfPhoneInStore) {
            if (phones.getModel().equals(name)) {
                resPhone = phones;
            }
            if (resPhone != null) {
                listOfPhoneInStore.remove(resPhone);
                return resPhone;
            }
        }
        throw new PhoneNotFoundException("Не нашли телефон с именем: " +name);
    }

    @Override
    public void putPhone(MobilePhone phones) {
        listOfPhoneInStore.add(phones);


    }

    @Override
    public boolean hasPhone(String name) {
        for (MobilePhone phones : listOfPhoneInStore) {
            if (phones.getModel().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printPhone() {
        for (MobilePhone mobilePhones : listOfPhoneInStore) {
            System.out.println("Телефон: " + mobilePhones.getModel() + " " + mobilePhones.getCompany() + " " + mobilePhones.getPrice() + "рублей");
        }
    }
}
