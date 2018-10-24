package com.ua.tanya;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        byte byteValue;
        byte byteValue1;
        byte byteValue2;
        short shortValue;
        short shortValue1;
        short shortValue2;
        long longValue;
        char charValue;
        int intValue;

        Scanner scanner = new Scanner(System.in);

        Hobby first = new Hobby(1245.12f, 1456.03, true);
        Hobby second = new Hobby('a', 145, 1457893, true);
        Hobby third = new Hobby('h', 45, 45789, 45.01f, 45.01, false);

        System.out.println("First hobby");
        System.out.println("Enter byte: ");
        byteValue = scanner.nextByte();
        first.setByteValue(byteValue);

        System.out.println("Enter short: ");
        shortValue = scanner.nextShort();
        first.setShortValue(shortValue);

        System.out.println("Enter char: ");
        charValue = scanner.next().charAt(0);
        first. setCharValue(charValue);

        System.out.println("Enter int: ");
        intValue = scanner.nextInt();
        first.setIntValue(intValue);

        System.out.println("Enter long: ");
        longValue = scanner.nextLong();
        first.setLongValue(longValue);

        System.out.println("Second hobby");
        System.out.println("Enter byte: ");
        byteValue1 = scanner.nextByte();
        second.setByteValue(byteValue1);

        System.out.println("Enter short: ");
        shortValue1 = scanner.nextShort();
        second.setShortValue(shortValue1);

        second.setDoubleValue(1452.22);
        second.setFloatValue(896.325f);

        System.out.println("Third hobby");
        System.out.println("Enter byte: ");
        byteValue2 = scanner.nextByte();
        third.setByteValue(byteValue2);

        System.out.println("Enter short: ");
        shortValue2 = scanner.nextShort();
        third.setShortValue(shortValue2);

        System.out.println(first.tellAboutHobby());
        System.out.println(second.tellAboutHobby());
        System.out.println(third.tellAboutHobby());
    }
}