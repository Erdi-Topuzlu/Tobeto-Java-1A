package org.example.lambda;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(7);
        numbers.add(1);
        //Fonksiyon içerisinde başka bir aksiyon çalıştırmak için kullanılır.
        numbers.forEach((number) -> {System.out.println(number);});

        List<String> names = new ArrayList<>();
        names.add("Erdi");
        names.forEach((x)->{System.out.println(x);});

        //Stream API
        //Liste ve Array ile çalışır.
        List<Integer> newList = new ArrayList<>();
        for (Integer number:numbers) {
            newList.add(number*number);
        }
        System.out.println(newList);

        List<Integer> newList2 = new ArrayList<>();
        numbers.forEach((number) -> {
            newList2.add(number);
        });
        System.out.println(newList2);


        // Stream API kullanımı
        List<Integer> newList3 = numbers
                .stream()
                .map((number) -> number*number)
                .toList();
        System.out.println(newList3);


        List<User> users = new ArrayList<>();
        users.add(new User(1,"Erdi","Topuzlu",31));
        users.add(new User(2,"Onur","Özkan",38));
        users.add(new User(3,"Furkan","Yılmaz",25));

        List<User> users1 = users
                .stream()
                .filter((user -> user.getAge()>25))
                .toList();

        users1.forEach((user -> System.out.println(user.getName())));


        User user = users
                .stream()
                .filter((user1 -> user1.getAge() > 25))
                .findFirst()
                .orElseThrow();//Findfirst sonuç bulamazsa hata fırlatır.

        System.out.println("Find First ile bulunan : " + user.getName());

        System.out.println("************ SORTING - String(First Name) ************");

        //String Compare Firstname
        List<User> sortedUsers = users
                .stream()
                .sorted((user1, user2) -> user1.getName().compareTo(user2.getName()))
                .toList();

        sortedUsers.forEach((u) -> System.out.println(u.getName()));

        System.out.println("************ SORTING - Integer ************");

        //Integer Compare Age
        List<User> sortedUsers1 = users
                .stream()
                .sorted((user1, user2) -> Integer.compare(user1.getAge(),user2.getAge()) )
                .toList();

        sortedUsers1.forEach((u) -> System.out.println(u.getName()));

        System.out.println("************ SORTING - String(Surname) ************");

        //String Compare Lastname
        //Collator Türkçe karakter set etmek için kullandık.
        Collator collator = Collator.getInstance(new Locale("tr","TR"));

        List<User> sortedUsers2 = users
                .stream()
                .sorted(Comparator.comparing(User::getSurname, collator))
                .toList();

        sortedUsers2.forEach((u) -> System.out.println(u.getSurname()));

    }
}
