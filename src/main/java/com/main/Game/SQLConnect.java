package com.main.Game;

import java.sql.*;
import java.util.List;
import java.util.Random;

public class SQLConnect{
    private String url;
    private String username;
    private String password;
    private  String sql;
    private Connection connection;
    private Statement statement;
    //private ResultSet resultSet;
    /*
    public SQLConnect(String sql){
        this.sql = sql;
        this.url = "jdbc:mysql://localhost:3306/english_quiz";
        this.username = "root";
        this.password = "root";
    }
    */
    public SQLConnect(String url, String sql) throws ClassNotFoundException, SQLException {
        this.url = url;
        this.sql = sql;
        this.username = "root";
        this.password = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection(url,username,password);
        this.statement = connection.createStatement();
        //this.resultSet = statement.executeQuery("select * from " + sql); //english_quiz.easy (EX)
    }

    public String[][] generateQuestion(int num_questions) throws SQLException {
        ResultSet count = statement.executeQuery("select count(*) from "+sql);
        count.next();
        int total_questions = count.getInt(1);
        count.close();

        ResultSet resultSet = statement.executeQuery("select * from "+sql);
        String res[][] = new String[total_questions][6];
        String toDisplay[][] = new String[num_questions][6];


        int i = 0;
        while(resultSet.next()){
            for (int j = 0; j < 6; j++) {
                res[i][j] = resultSet.getString(j+1);
            }
            i++;

        }
        Random rand = new Random();
        for (int j = 0; j < res.length; j++) {
            int randomIndexToSwap = rand.nextInt(res.length);
            String temp[] = res[randomIndexToSwap];
            res[randomIndexToSwap] = res[j];
            res[j] = temp;
        }
        for (int j = 0; j < toDisplay.length; j++) {
            for (int k = 2; k < 5; k++) {
                int randomIndexToSwap = rand.nextInt(2,5);
                String temp = res[j][randomIndexToSwap];
                res[j][randomIndexToSwap] = res[j][k];
                res[j][k] = temp;
            }
            toDisplay[j] = res[j];
        }
        return toDisplay;
    }
}
