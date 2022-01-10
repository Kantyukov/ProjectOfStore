package ru.artem.kantyukov.domain;


import lombok.RequiredArgsConstructor;


import java.util.List;

@RequiredArgsConstructor
public class Client {
    private final String name;
    private final List<MobilePhone> phones;


}
