package com.example.theatercinema;

public class Cinema {
    private String firstname;
    private String lastname;
    private String email;
    private int number;
    private String movie;
    private int amount;
    private long id;

    public Cinema(String firstname, String lastname, String email, int number, String movie, int amount){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.number = number;
        this.movie = movie;
        this.amount = amount;
    }
    public Cinema(String firstname, String lastname, String email, int number, String movie, int amount, long id){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.number = number;
        this.movie = movie;
        this.amount = amount;
        this.id = id;
    }
    public Cinema(){}


    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String getMovie(){
        return movie;
    }
    public void setMovie(String movie){
        this.movie = movie;
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}
