package com.example.boring.service.impl;

import com.example.boring.dao.CalDateDao;
import com.example.boring.pojo.CalDate;
import com.example.boring.pojo.FullDate;
import com.example.boring.service.CalDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CalDateServiceimpl implements CalDateService {
    @Autowired
    private CalDateDao calDateDao;
    @Override
    public Map<Long, Integer> queryCalDateList() {
        List<CalDate> calDates = calDateDao.queryCalDateList();
        Map<Long,Integer> map=new HashMap<>();
        for(int i=0;i<calDates.size();i++){
            map.put(calDates.get(i).getTime().getTime()/1000,calDates.get(i).getNum());
        }
        return map;
    }

    @Override
    public List<FullDate> queryFirstFive() {
        List<FullDate> fullDates = calDateDao.queryFirstFive();
        return fullDates;
    }

    @Override
    public void insertRecordText(FullDate fullDate) {
        calDateDao.insertRecordText(fullDate);
    }
}
