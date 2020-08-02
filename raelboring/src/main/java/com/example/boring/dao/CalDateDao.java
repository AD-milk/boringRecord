package com.example.boring.dao;

import com.example.boring.pojo.CalDate;
import com.example.boring.pojo.FullDate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface CalDateDao {
    List<CalDate> queryCalDateList();
    List<FullDate> queryFirstFive();
    void insertRecordText(FullDate fullDate);
}
