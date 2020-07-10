package com.example.testshift.control;

import com.example.testshift.serv.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainControl {

    final
    MyService service;

    public MainControl(MyService service) {
        this.service = service;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public void locationSet(@RequestBody PhoneDTO phone){
        service.add(phone);
    }

    @ResponseBody
    @GetMapping("/list")
    public ResponseEntity<List<PhoneDTO>> list() {
        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }
}
