package com.example.test;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class MathTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Arithmetic Quiz!");
        System.out.println("Choose the difficulty level:");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.print("Enter your choice (1-3): ");
        int difficulty = scanner.nextInt();

        System.out.print("Enter the number of questions you want to answer: ");
        int numQuestions = scanner.nextInt();

        Random random = new Random();
        int correctAnswers = 0;

        for (int i = 0; i < numQuestions; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");

            int number1, number2, number3 = 0;
            char operator1, operator2 = 0;

            switch (difficulty) {
                case 1:
                    number1 = random.nextInt(15);
                    number2 = random.nextInt(15);
                    operator1 = random.nextBoolean() ? '+' : '-';
                    askQuestion(number1, operator1, number2);
                    break;
                case 2:
                    number1 = getRandomNumber();
                    number2 = getRandomNumber();
                    operator1 = random.nextBoolean() ? '+' : '-';
                    askQuestion(number1, operator1, number2);
                    break;
                case 3:
                    number1 = getRandomNumber();
                    number2 = getRandomNumber();
                    number3 = getRandomNumber();
                    operator1 = random.nextBoolean() ? '+' : '-';
                    operator2 = random.nextBoolean() ? '+' : '-';
                    askQuestion(number1, operator1, number2, operator2, number3);
                    break;
                default:
                    System.out.println("Invalid difficulty level!");
                    return;
            }

            System.out.print("Enter your answer: ");
            int userAnswer = scanner.nextInt();

            int correctAnswer;

            switch (difficulty) {
                case 1:
                    correctAnswer = calculateAnswer(number1, operator1, number2);
                    break;
                case 2:
                    correctAnswer = calculateAnswer(number1, operator1, number2);
                    break;
                case 3:
                    correctAnswer = calculateAnswer(number1, operator1, number2, operator2, number3);
                    break;
                default:
                    return;
            }

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer);
            }
        }

        double score = (double) correctAnswers / numQuestions * 100;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String formattedScore = decimalFormat.format(score);
        System.out.println("\nQuiz Summary:");
        System.out.println("Correct answers: " + correctAnswers);
        System.out.println("Incorrect answers: " + (numQuestions - correctAnswers));
        System.out.println("Score: " + formattedScore + "%");
    }


    public static int getRandomNumber() {
        Random random = new Random();
        int number = random.nextInt(31) - 15;
        return number;
    }

    public static void askQuestion(int number1, char operator1, int number2) {
        System.out.println(number1 + " " + operator1 + " " + number2 + " = ?");
    }

    public static void askQuestion(int number1, char operator1, int number2, char operator2, int number3) {
        System.out.println(number1 + " " + operator1 + " " + number2 + " " + operator2 + " " + number3 + " = ?");
    }

    public static int calculateAnswer(int number1, char operator1, int number2) {
        if (operator1 == '+') {
            return number1 + number2;
        } else {
            return number1 - number2;
        }
    }

    public static int calculateAnswer(int number1, char operator1, int number2, char operator2, int number3) {
        int result = 0;

        if (operator1 == '+') {
            result = number1 + number2;
        } else {
            result = number1 - number2;
        }

        if (operator2 == '+') {
            result += number3;
        } else {
            result -= number3;
        }

        return result;
    }
}
