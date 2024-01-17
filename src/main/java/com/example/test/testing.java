package com.example.test;

import com.main.Game.SQLConnect;

import java.sql.SQLException;

public class testing {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SQLConnect sql = new SQLConnect("jdbc:mysql://localhost:3306/english_quiz","hard");
        String[][] temp = sql.generateQuestion(10);
        for (String[] strings : temp) {
            for (int j = 0; j < temp[j].length; j++) {
                System.out.print(strings[j] + "\t|\t");
            }
            System.out.println();
        }
    }
}
