package com.example.testing.controller;

import com.example.testing.dao.Data;
import com.example.testing.dao.User;
import com.example.testing.servises.DataService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    DataService dataService;

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }



    @GetMapping("dbservice/data/")
    public List<Data> getTable(){
        return dataService.getTable();
    }

    @GetMapping("/dbservice/data/{id}")
    public Data getById(@PathVariable Long id){
        return dataService.getById(id);
    }

}
