package com.main.Game;

import java.sql.*;
import java.util.Random;

public class SQLConnect{
    private String url;
    private String username;
    private String password;
    private  String difficulty;
    private Connection connection;
    private Statement statement;
    //private int score;
    //private int time;
    //private ResultSet resultSet;
    /*
    public SQLConnect(String sql){
        this.sql = sql;
        this.url = "jdbc:mysql://localhost:3306/english_quiz";
        this.username = "root";
        this.password = "root";
    }
    */
    public SQLConnect(String url, String difficulty) throws ClassNotFoundException, SQLException {
        this.url = url;
        this.difficulty = difficulty;
        this.username = "root";
        this.password = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        //Class.forName("com.mysql.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+this.url,username,password);
        this.statement = connection.createStatement();
        //this.resultSet = statement.executeQuery("select * from " + sql); //english_quiz.easy (EX)
    }
    //public SQLConnect(String url, String sql, int score, int time) throws SQLException, ClassNotFoundException {
    //    this.url = url;
    //    this.sql = sql;
    //    this.score = score;
    //    this.time = time;
    //    this.username = "root";
    //    this.password = "root";

    //    Class.forName("com.mysql.cj.jdbc.Driver");
    //    this.connection = DriverManager.getConnection(url,username,password);
    //    this.statement = connection.createStatement();
    //};
    public void saveScore(String name, int mark, int time, int score) throws SQLException {
        //String execute = "INSERT INTO `math_quiz`.`score` (`Name`, `Score`, `Time`) VALUES ('Loyd', '10', '120');" EXAMPLE
        String execute = "INSERT INTO `"+ url +"`.`score_"+ difficulty +"` (`Name`, `Mark`, `Time`, `Score`) VALUES ('"+ name + "', '"+ mark +"', '"+ time +"', '"+ score +"')";
        System.out.println(execute);
        statement.executeUpdate(execute);
    }
    public String[] getLatestScore() throws SQLException {
        //String execute = "SELECT * FROM math_quiz.score_easy ORDER BY ID DESC LIMIT 1";
        String execute = "SELECT * FROM " + url + ".score_" + difficulty + " ORDER BY ID DESC LIMIT 1";
        System.out.println(execute);
        ResultSet data = statement.executeQuery(execute);
        String[] result = new String[5];
        data.next();
        for(int i = 0; i < 5; i++){
            result[i] = data.getString(i+1);
        }
        return result;
    }
    public String[][] getTop5() throws SQLException {
        String execute = "SELECT * FROM " + url + ".score_" + difficulty + " ORDER BY SCORE DESC, MARK DESC, TIME ASC, NAME ASC, ID DESC LIMIT 5";
        System.out.println(execute);
        ResultSet data = statement.executeQuery(execute);
        String[][] result = new String[5][5];
        int i = 0;
        while(data.next()){
            for (int j = 0; j < 5; j++) {
                result[i][j] = data.getString(j+1);
            }
            i++;
        }
        return result;
    }

    public int getCount(int num_questions) throws SQLException {
        ResultSet count = statement.executeQuery("select count(*) from "+ difficulty);
        count.next();
        int total_questions = count.getInt(1);
        count.close();
        return total_questions;
    }

    public String[][] generateQuestion(int num_questions) throws SQLException {
        int total_questions = getCount(num_questions);

        ResultSet resultSet = statement.executeQuery("select * from "+ difficulty);
        String[][] res = new String[total_questions][6];
        String[][] toDisplay = new String[num_questions][6];


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
            String[] temp = res[randomIndexToSwap];
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
