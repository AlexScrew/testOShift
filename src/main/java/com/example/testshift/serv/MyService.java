package com.example.testshift.serv;

import com.example.testshift.control.PhoneDTO;

import java.util.List;

public interface MyService {
    void add(PhoneDTO phone);

    List<PhoneDTO> list();
}
