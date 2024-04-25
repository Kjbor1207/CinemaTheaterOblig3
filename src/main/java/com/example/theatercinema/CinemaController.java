package com.example.theatercinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CinemaController {

    @Autowired
    private CinemaRepository rep;

    @PostMapping("/saveAll")
    public void saveAll(Cinema Customer) {
        rep.saveAll(Customer);
    }

    @GetMapping("/getAll")
    public List<Cinema> getAll(){
        return rep.getAll();
    }

    @PostMapping("/deleteAllCustomer")
    public void deleteAll() {
        rep.deleteAllCustomer();
    }
    @DeleteMapping("/deleteACustomer")
    public void deleteOneCustomer(long id){
        rep.deleteACustomer(id);
    }

    //@PostMapping("/editCustomer")
    //public void editCustomer(long id, String firstname, String lastname, String email, int number, String movie, int amount) {
    //
    //    rep.editCustomer();
    //}


}

