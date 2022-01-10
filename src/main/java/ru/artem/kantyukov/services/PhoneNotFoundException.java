package ru.artem.kantyukov.services;

public class PhoneNotFoundException extends RuntimeException{
     public PhoneNotFoundException(String message){
          super(message);
     }
}
