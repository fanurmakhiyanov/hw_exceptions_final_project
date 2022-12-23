package ru.gb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in, "Cp1251");

//        String lastName;
//        System.out.print("Введите фамилию: ");
//        lastName = user_input.next();
//
//        String firstName;
//        System.out.print("Введите имя: ");
//        firstName = user_input.next();
//
//        String patronomyc;
//        System.out.print("Введите отчество: ");
//        patronomyc = user_input.next();

//        System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
//            try {
//                String dateOfBirth = user_input.next("[0-9]{2}.[0-9]{2}.[0-9]{4}");
//                Date date = new SimpleDateFormat("dd.MM.yyyy").parse(dateOfBirth);
//            } catch (InputMismatchException e) {
//                System.out.println("Неправильный формат даты рождения");
//            } catch (ParseException e) {
//                throw new RuntimeException(e);
//            }

        System.out.print('Введите номер телефона в формате 79991112233: ");
            int phone = 0;
            try {
                String phoneNumber = user_input.next("[7-8][0-9]{10}");
                phone = Integer.parseInt(phoneNumber);
            } catch (InputMismatchException e) {
                System.out.println("Неправильный формат телефона");
            }

        String sex = "";
    }
}