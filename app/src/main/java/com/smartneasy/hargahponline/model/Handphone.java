package com.smartneasy.hargahponline.model;

/**
 * Created by smartneasy on 01/06/17.
 */

public class Handphone {
    private Integer id;
    private String nama;
    private String harga;
    private String email;
    private String address;
    private String gender;
    private String mobile;
    private String home;
    private String office;
    public Handphone() {
        super();
    }
    public Handphone(Integer id, String nama, String harga, String email, String address, String gender, String mobile, String home, String offie
    ) {
        super();
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.mobile = mobile;
        this.home = home;
        this.office = offie;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }
}