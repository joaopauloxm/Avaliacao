package com.example.aluno.avaliacao.model;


import android.widget.EditText;

public class User {
    private int id;
    private String name;
    private String userName;
    private String email;
    private String phone;
    private String website;

    private Address address;
    private Company company;
    private Geo geo;

    public User(int id, String name,
                String userName,
                String email, String phone,
                String website, Address address,
                Company company, Geo geo) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.website = website;
        this.address = address;
        this.company = company;
        this.geo = geo;
    }

    public User(String nome, String userName, String email, String street, String suite, String city, String zipcode, String lat, String lgt, String phone, String website, String nomecompany, String catchphrase, String bs) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }
}
