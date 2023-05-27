package ru.skypro.homework.model;

import java.util.Objects;

public class LoginReqModel {

    @LoginReqProperty(description = "пароль")
    private String password;

    @LoginReqProperty(description = "логин")
    private String username;

    public LoginReqModel(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginReqModel that = (LoginReqModel) o;
        return password.equals(that.password) && username.equals(that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, username);
    }

    @Override
    public String toString() {
        return "LoginReqModel{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }


}
