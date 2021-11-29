package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> students = new ArrayList<>();

    public static void main(String[] args) {
        int studentsToAdd = Integer.parseInt(getInput("How many students do you want to add?"));
        for (int i = 0; i < studentsToAdd; i++) {
            students.add(getStudentDetails());
        }
        printStudentEmails();
    }

    public static String getStudentDetails() {
        int studentID = Integer.parseInt(getInput("Enter your student ID"));
        String studentName = getInput("Enter your name");
        String studentEmail = getInput("Enter your Email address");
        return (studentID + "," + studentName + "," + studentEmail);
    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    //Using the split method to split the string into parts
    public static void printStudentEmails() {
        for (int i = 0; i < students.size(); i++) {
            String[] studentDetails = students.get(i).split(",");
            System.out.println(studentDetails[2]);
        }
    }
}
