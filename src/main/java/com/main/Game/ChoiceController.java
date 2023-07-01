package com.main.Game;
import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.sql.SQLException;

public class ChoiceController{

    @FXML
    private Label question_label;
    @FXML
    private Label question_number;
    @FXML
    private ToggleButton btn_A;
    @FXML
    private ToggleButton btn_B;
    @FXML
    private ToggleButton btn_C;
    @FXML
    private Button next_btn;
    @FXML
    private ProgressBar prog;
    @FXML
    private Label time_label;
    @FXML
    private Label score_count;
    @FXML
    private AnchorPane topicQuizAnchor;
    private SQLConnect sql;
    private int q_num = 1;
    private String[][] questions;
    private final int num_of_questions = 10;
    private ToggleGroup toggleGroup;
    private int mark;
    private int timeTemp;
    private int score;
    private double prog_per;
    //private TimeThread timeClass = new TimeThread(time_label);
    //private boolean isRunning;
    private TimeThread timeThread;
    private Thread timeThreading;


    protected void startTimer(){
        timeThread = new TimeThread();
        ChangeListener<String> listener = (observableValue, s, t1) -> time_label.setText(s);
        timeThread.valueProperty().addListener(listener);
        timeThreading = new Thread(timeThread);
        timeThreading.start();
        time_label.textProperty().bind(timeThread.messageProperty());
    }
    protected void stopTimer() throws InterruptedException, SQLException {
        SceneSwitch data = new SceneSwitch();
        sql.saveScore(data.getName(), mark, timeThread.getTime(),score);
        timeThread.setIsRunning(false);
        time_label.textProperty().unbind();
        timeThreading.join();
        timeThread.cancel();
    }


    @FXML
    protected void initialize() throws SQLException, ClassNotFoundException {

        SceneSwitch sceneInfo = new SceneSwitch();
        System.out.println(sceneInfo.getTopic()+" | "+sceneInfo.getDifficulty());
        sql = new SQLConnect(sceneInfo.getTopic(),sceneInfo.getDifficulty());
        //SQLConnect sql = new SQLConnect("jdbc:mysql://localhost:3306/general_quiz","easy");

        //Thread timeThread = new Thread(timeClass);
        toggleGroup = new ToggleGroup();
        btn_A.setToggleGroup(toggleGroup);
        btn_B.setToggleGroup(toggleGroup);
        btn_C.setToggleGroup(toggleGroup);

        mark = 0;
        timeTemp = 0;
        score = 0;

        //HBox hBox = new HBox();
        //hBox.getChildren().addAll(btn_A,btn_B,btn_C);
//
        //Group root = new Group();
        //root.getChildren().add(hBox);

        prog_per = (double) q_num/num_of_questions;
        prog.setProgress(prog_per);

        questions = sql.generateQuestion(num_of_questions);
        System.out.println("Question ID: "+questions[0][0]);

        question_number.setText(String.valueOf(q_num));
        question_label.setText(questions[0][1]);
        btn_A.setText(questions[0][2]);
        btn_B.setText(questions[0][3]);
        btn_C.setText(questions[0][4]);

        startTimer();


        //Thread timeThread = new Thread(()->{
        //    long start,end,tim,sec,min;
        //    isRunning = true;
        //    start=System.currentTimeMillis();
        //    while(isRunning) {
        //        end = System.currentTimeMillis();
        //        tim = (end - start) / 1000;
        //        sec = tim % 60;
        //        min = (tim / 60);
        //        time_label.setText((int) min + ":" + (int) sec);
        //    }
        //});
//
        //timeThread.start();
        //timeThread.join();

        //question_number.setText("test Question number");
        //question_label.setText("Test question label");
        //btn_A.setText("Choice A");
        //btn_B.setText("Choice B");
        //btn_C.setText("Choice C");
    }
    @FXML
    protected void onNextButtonClick() throws InterruptedException, SQLException, IOException {
        if(toggleGroup.getSelectedToggle() == null){
            System.out.println("Unselect");
            return;
        }
        System.out.println(((ToggleButton)toggleGroup.getSelectedToggle()).getText() + " | "+questions[q_num-1][5]);
        if((((ToggleButton)toggleGroup.getSelectedToggle()).getText()).equals(questions[q_num-1][5])){
            mark++;
            int timeGap = timeThread.getTime() - timeTemp;
            if(timeGap <= 10){
                score+= (mark * 100)*3;
            }else if (timeGap <= 30){
                score+= (mark * 100)*2;
            }else{
                score+= (mark * 100);
            }
            score_count.setText(String.valueOf(mark));
            if(mark > 0 && mark < 6){
                score_count.setTextFill(Color.rgb(255,127,0));
            } else if (mark >=6) {
                score_count.setTextFill(Color.rgb(50,205,5));
            }

            System.out.println("Score++");
        }

        if(q_num >= num_of_questions){
            stopTimer();
            System.out.println("END. Score: "+ mark);
            question_label.setText("FINISH! Your score: " + mark);

            new SceneSwitch(topicQuizAnchor, "ResultsView.fxml");
            //time_label.setText(timeThread.getResult());
            //Stage stage = (Stage) next_btn.getScene().getWindow();
            //stage.close();
            return;
        }



        toggleGroup.getSelectedToggle().setSelected(false);
        System.out.println("Question ID: "+questions[q_num][0]);
        question_label.setText(questions[q_num][1]);
        btn_A.setText(questions[q_num][2]);
        btn_B.setText(questions[q_num][3]);
        btn_C.setText(questions[q_num][4]);
        q_num++;
        prog_per = (double) q_num/num_of_questions;
        //System.out.println(q_num+ " / " + num_of_questions + " = "+ prog_per);
        prog.setProgress(prog_per);
        question_number.setText(String.valueOf(q_num));
        if(q_num == num_of_questions){
            next_btn.setText("END");
        }
    }
}
