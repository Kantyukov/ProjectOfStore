package ru.artem.kantyukov.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.artem.kantyukov.domain.MobilePhones;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class Client {
    private final String name;
    private final List<MobilePhones> phones;


}
