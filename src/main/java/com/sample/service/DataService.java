package com.sample.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.model.Data;
import com.sample.repository.DataRepository;

@Service
@Transactional
public class DataService {

    @Autowired
    DataRepository dataRepository;

    public List<Data> findAllData() {
        return dataRepository.findAll();
    }
}
