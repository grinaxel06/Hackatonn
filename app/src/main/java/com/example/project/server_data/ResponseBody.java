package com.example.project.server_data;

import java.io.Serializable;

public class ResponseBody implements Serializable {
    private boolean reg;
    private boolean login;
    private String picture;
    private String number;

    private String mode;
    private String text;
    private String patronymic;

    private String surname;

    private String name;
    private String second_password;

    private String password;

    public String getMode() {
        return this.mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getSecond_password() {
        return this.second_password;
    }
    public void setSecond_password(String second_password) {
        this.second_password = second_password;
    }
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setReg(boolean reg) {
        this.reg = reg;
    }
    public boolean getReg() {
        return reg;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getPicture() {
        return picture;
    }
    public void setLogin(boolean login) {
        this.login = login;
    }
    public boolean getLogin() {
        return login;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public String getPatronymic() {
        return this.patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
