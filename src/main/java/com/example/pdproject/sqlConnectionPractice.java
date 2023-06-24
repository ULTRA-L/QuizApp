package com.example.pdproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlConnectionPractice {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/english_quiz";
        String username = "root";
        String password = "root";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from english_quiz.easy where id = 6");
            while(resultSet.next()){
                System.out.println(resultSet.getString(2));
            }
            connection.close();
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
