package com.example.testing.servises;

import com.example.testing.dao.Data;
import com.example.testing.dao.User;
import com.example.testing.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataService {
    DataRepository dataRepository;

    @Autowired
    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public Data getById(Long id){
        return dataRepository.getById(id);
    }

    public List<Data> getTable() {
        List<Data> rowsList = new ArrayList<>();
        Iterable<Data> data = dataRepository.findAll();
        Map<Long, String> table = new HashMap<>();
        for (Data row : data) {
            rowsList.add(row);
//            String line = "id: " + row.getId()
//                    + ", name:" + row.getName()
//                    + ", color" + row.getColor()
//                    +", age" + row.getAge();
//            rowsList.add(line);
        }
        return rowsList;
    }
}
