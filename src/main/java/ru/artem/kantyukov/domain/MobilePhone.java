package ru.artem.kantyukov.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MobilePhone {
    private final String model;
    private final String company;
    private final int price;


}
