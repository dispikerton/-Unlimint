package com.ivanov.unlimint.test_task.parsers;

import com.ivanov.unlimint.test_task.entity.Order;

import java.io.File;
import java.util.List;

public class Parser {
    private FileExtension fileExtension;

    public void parse(String[] files) {
        for (String fileName : files){
            Thread thread = new Thread(() -> {
                if (fileName.endsWith(".csv"))
                    fileExtension = new CSV();
                else if (fileName.endsWith(".json"))
                    fileExtension = new JSON();

                List<Order> orders = fileExtension.parse(new File(fileName));
                for (Order order : orders)
                    System.out.println(order);
            });
            thread.start();
        }
    }
}

