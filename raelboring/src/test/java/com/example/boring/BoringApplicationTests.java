package com.example.boring;

import com.example.boring.dao.CalDateDao;
import com.example.boring.pojo.CalDate;
import com.example.boring.pojo.FullDate;
import com.example.boring.service.CalDateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class BoringApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    CalDateDao calDateDao;
    @Test
    void contextLoads() throws SQLException {
        List<FullDate> calDates = calDateDao.queryFirstFive();
        for(int i=0;i<calDates.size();i++){
            System.out.println(calDates.get(i).getBoringTime());
            System.out.println(calDates.get(i).getBoringtext());
        }
//
//        Map<Long , Integer> map = calDateService.queryCalDateList();
//        System.out.println(map);
    }

}
