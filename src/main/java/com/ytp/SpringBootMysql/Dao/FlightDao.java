package com.ytp.SpringBootMysql.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ytp.SpringBootMysql.model.Flight;

public interface FlightDao extends CrudRepository<Flight,Integer>{

  void save(List<Flight> flights);

  
}
