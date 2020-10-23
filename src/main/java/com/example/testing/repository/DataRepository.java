package com.example.testing.repository;

import com.example.testing.dao.Data;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends CrudRepository<Data,String> {
Data getById(Long id);
}
