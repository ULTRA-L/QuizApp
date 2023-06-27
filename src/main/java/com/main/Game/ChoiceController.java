package com.main.Game;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.sql.SQLException;

public class ChoiceController {

    @FXML
    private Label question_label;
    @FXML
    private Label question_number;
    @FXML
    private RadioButton btn_A;
    @FXML
    private RadioButton btn_B;
    @FXML
    private RadioButton btn_C;
    @FXML
    private Button next_btn;
    @FXML
    private ProgressBar prog;
    @FXML
    private Label time_label;
    private int q_num = 1;
    private String[][] questions;
    private int num_of_questions = 10;
    private ToggleGroup toggleGroup;
    private int score = 0;
    private double prog_per;

    @FXML
    protected void initialize() throws SQLException, ClassNotFoundException {
        SQLConnect sql = new SQLConnect("jdbc:mysql://localhost:3306/general_quiz","easy");

        toggleGroup = new ToggleGroup();
        btn_A.setToggleGroup(toggleGroup);
        btn_B.setToggleGroup(toggleGroup);
        btn_C.setToggleGroup(toggleGroup);

        prog_per = (double) q_num/num_of_questions;
        prog.setProgress(prog_per);

        questions = sql.generateQuestion(num_of_questions);
        System.out.println("Question ID: "+questions[0][0]);

        question_number.setText("Question Number " + q_num);
        question_label.setText(questions[0][1]);
        btn_A.setText(questions[0][2]);
        btn_B.setText(questions[0][3]);
        btn_C.setText(questions[0][4]);
        //question_number.setText("test Question number");
        //question_label.setText("Test question label");
        //btn_A.setText("Choice A");
        //btn_B.setText("Choice B");
        //btn_C.setText("Choice C");
    }
    @FXML
    protected void onNextButtonClick(){
        if(toggleGroup.getSelectedToggle() == null){
            System.out.println("Unselect");
            return;
        }
        System.out.println(((RadioButton)toggleGroup.getSelectedToggle()).getText() + " | "+questions[q_num-1][5]);
        if((((RadioButton)toggleGroup.getSelectedToggle()).getText()).equals(questions[q_num-1][5])){
            score++;
            System.out.println("Score++");
        }

        if(q_num >= num_of_questions){
            System.out.println("END. Score: "+score);
            Stage stage = (Stage) next_btn.getScene().getWindow();
            stage.close();
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
        question_number.setText("Question Number " + q_num);
        if(q_num == num_of_questions){
            next_btn.setText("END");
        }

    }




}
