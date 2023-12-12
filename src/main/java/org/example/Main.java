package org.example;

import com.mongodb.Block;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Main {
    public static void main(String[] args) {
        try (var mongoClients = MongoClients.create()) {
            mongoClients.listDatabaseNames()
                    .forEach((Consumer < String) > System.out::println);
            mongoClients.listDatabaseNames()
                    .forEach((Consumer<String> System.out::println));
        }

//        List<String> list = List.of("Москва", "Питер", "Нижний");
////        System.out.println(list);
//        list.forEach((Consumer<String>) System.out::println );
    }
}