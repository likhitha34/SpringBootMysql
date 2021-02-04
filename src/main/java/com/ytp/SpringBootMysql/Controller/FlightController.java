package com.ytp.SpringBootMysql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ytp.SpringBootMysql.Dao.FlightDao;
import com.ytp.SpringBootMysql.model.Flight;

@RestController
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    private FlightDao dao;
    
    @PostMapping("/flightInfo")
    public String flightInfo(@RequestBody List<Flight> flights) {
    
        dao.save(flights);
        return "flightInfo";
}
    @GetMapping("/getInfo")
    public List<Flight> getInfo(){
        return (List<Flight>)dao.findAll();
    }
}


