package com.example.logging;

public class Main {

    public static void main(String[] args) {

        UserService user = new UserService();

        user.login("");

        user.login("Raj");

        user.login("Ramesh");

    }

}