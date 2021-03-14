package com.ivanov.unlimint.test_task.parsers;

import com.ivanov.unlimint.test_task.entity.Order;

import java.io.File;
import java.util.List;

public interface FileExtension {
    List<Order> parse(File file);
}
