package com.example.boring.service;

import com.example.boring.pojo.CalDate;
import com.example.boring.pojo.FullDate;

import java.util.List;
import java.util.Map;

public interface CalDateService {
    Map<Long, Integer> queryCalDateList();
    List<FullDate> queryFirstFive();
    void insertRecordText(FullDate fullDate);
}
