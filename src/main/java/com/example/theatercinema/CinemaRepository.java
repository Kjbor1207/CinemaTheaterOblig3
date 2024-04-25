package com.example.theatercinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CinemaRepository {

    @Autowired
    private JdbcTemplate db;


    public void saveAll(Cinema customer){
        String sql = "INSERT INTO Cinema(firstname, lastname, email, number, movie, amount) VALUES(?, ?, ?, ?, ?, ?)";
        db.update(sql, customer.getFirstname(), customer.getLastname(), customer.getEmail(), customer.getNumber(), customer.getMovie(),customer.getAmount());
    }
    public  List<Cinema> getAll() {
        String sql = "SELECT * FROM Cinema";
        List<Cinema> getAllCustomers = db.query(sql, new BeanPropertyRowMapper<>(Cinema.class));
        return getAllCustomers;
    }
    public void deleteAllCustomer() {
            String sql = "DELETE FROM Cinema";
            db.update(sql);
        }
    public void deleteACustomer(long id){
        String sql = "DELETE FROM Cinema WHERE id = ?";
        db.update(sql, id);


    }
    public void editCustomer(Cinema customer){
        String sql = "UPDATE * FROM CINEMA(SET firstname = ?, lastname = ?, email = ?, number = ?, movie = ?, amount = ?) VALUES(?,?,?,?,?,?)";
        db.update(sql, customer.getFirstname(), customer.getLastname(), customer.getEmail(), customer.getNumber(), customer.getMovie(), customer.getAmount());
    }
    }

