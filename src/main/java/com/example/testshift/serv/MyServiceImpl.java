package com.example.testshift.serv;

import com.example.testshift.control.PhoneDTO;
import com.example.testshift.repo.Phone;
import com.example.testshift.repo.PhoneRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyServiceImpl implements MyService{
    PhoneRepo repo;
    public MyServiceImpl(PhoneRepo repo) {
        this.repo = repo;
    }

    @Override
    public void add(PhoneDTO phone) {
        Phone newPhone = new Phone();
        newPhone.setPhone(phone.getPhone());
        newPhone.setNotes(phone.getNotes());
        repo.save(newPhone);

    }

    @Override
    public List<PhoneDTO> list() {
        List<Phone> all = repo.findAll();
        return Utils.mapAll(all, PhoneDTO.class);
    }

}
