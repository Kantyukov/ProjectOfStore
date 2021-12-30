package ru.artem.kantyukov.services;

import ru.artem.kantyukov.domain.MobilePhones;

import java.util.List;

public class MobilePhoneServiceImpl implements MobilePhoneService {
    private final List<MobilePhones> listOfPhoneInStore;

    public MobilePhoneServiceImpl(List<MobilePhones> listOfPhoneInStore) {
        this.listOfPhoneInStore = listOfPhoneInStore;
    }


    @Override
    public MobilePhones takePhoneByName(String name) {
        MobilePhones resPhone = null;

        for (MobilePhones phones : listOfPhoneInStore)
            if (phones.getModel().equals(name)) {
                resPhone = phones;
            }
        if (resPhone != null) {
            listOfPhoneInStore.remove(resPhone);
            return resPhone;
        }
        return null;
    }

    @Override
    public void putPhone(MobilePhones phones) {
        listOfPhoneInStore.add(phones);


    }

    @Override
    public boolean hasPhone(String name) {
        for (MobilePhones phones : listOfPhoneInStore) {
            if (phones.getModel().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printPhone() {
        for (MobilePhones mobilePhones : listOfPhoneInStore) {
            System.out.println("Телефон: " + mobilePhones.getModel()+ " " +mobilePhones.getCompany()+ " " +mobilePhones.getPrice()+ "рублей");
        }
    }
}
