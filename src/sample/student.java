package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class student extends Controller {


    private String studentName;
    //private int code;
    private static int counter=1000;
    private String department;
    //double hours;
    private String phonenumber;
    private String level;
    private double score;


    student() {
//        code=counter;
//        counter++;
    }

    student(String addFullStudentName, String addStudentDepartName, String addStudentPhone, String addStudentLevel) {
        this.studentName = addFullStudentName;
        this.department = addStudentDepartName;
        //this.hours = hours;
        this.phonenumber = addStudentPhone;
        this.level = addStudentLevel;
//        code=counter;
//        counter++;

    }

//    student(String addFullStudentName, String addStudentDepartName, String addStudentPhone, String addStudentLevel) {
//        this.studentName = addFullStudentName;
//        this.department = addStudentDepartName;
//        //this.hours = hours;
//        this.phonenumber = addStudentPhone;
//        this.level = addStudentLevel;
//        this.code=code-1;
//
//    }
//    student(String addFullStudentName, String addStudentDepartName, String addStudentPhone, String addStudentLevel,String  n,String y) {
//        this.studentName = addFullStudentName;
//        this.department = addStudentDepartName;
//        //this.hours = hours;
//        this.phonenumber = addStudentPhone;
//        this.level = addStudentLevel;
//
//
//    }

    void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    String getStudentName() {
        return studentName;
    }

//    void setCode(int code) {
//        this.code = code;
//    }
//
//    int getCode() {
//        return code;
//    }

    void setDepartment(String department) {
        this.department = department;
    }

    String getDepartment() {
        return department;
    }

//    void setHours(double hours) {
//        this.hours = hours;
//    }
//
//    double getHours() {
//        return hours;
//    }

    void setLevel(String level) {
        this.level = level;
    }

    String getLevel() {
        return level;
    }

    void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    String getPhonenumber() {
        return phonenumber;
    }

    void setScore(double score) {
        this.score = score;
    }

    double getScore() {
        return score;
    }





    public String writeToString() {
        //int code = getCode();
        String studentName = getStudentName();
        String level = getLevel();
        String department = getDepartment();
        //double hours = getHours();
        String phone = getPhonenumber();
        double score = getScore();


        String record = "Name "+ studentName + " : " +" Dept "+ department + " : " +" Lev "+ level  + " : " +" Ph "+ phone;

        return record;



    }


    public void insert(String record) {
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\student_in.txt");
            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\student_out.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNext()) {
                String fileRec = sc.nextLine();
                pw.println(fileRec);
            }
            pw.println(record);
            pw.close();
            sc.close();
        } catch (Exception c) {
            System.out.println(c);
        }
        student.FileIO();
       // student.clear();
    }


    public static String delete(String recToDel) {
        String action="not found to delete";
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\student_in.txt");
            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\student_out.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNext()) {
                String fileRec = sc.nextLine();
                if (recToDel.equals(fileRec)) {
                    action="deleted success";
                } else {
                    pw.println(fileRec);
                    System.out.println(fileRec);
                }

            }
            pw.close();
            sc.close();
        } catch (Exception c) {
            System.out.println(c);
        }
        student.FileIO();
        //student.clear();
        return action;
    }


    public static void FileIO() {
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\student_out.txt");
            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\student_in.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNext()) {
                String fileRec = sc.nextLine();

                pw.println(fileRec);
                System.out.println(fileRec);
            }
            pw.close();
            sc.close();
        } catch (Exception c) {
            System.out.println(c);
        }
    }


    public String search(String Opject) {
        String getted = "not found";
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\student_in.txt");
            Scanner sc = new Scanner(f1);
            while (sc.useDelimiter(":").hasNext()) {
                String p = sc.nextLine();
                if (Opject.equals(p)) {
                    return p;
                }
            }
            sc.close();
        } catch (Exception A) {
            System.out.println(A);
        }

        return getted;
    }


    public void update(String oline, String nline) {

        this.delete(oline);
        this.insert(nline);
        student.FileIO();
        //student.clear();

    }


//    public static void clear(){
//        try {
//            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\student_out.txt");
//            pw.println("");
//            pw.close();
//        } catch (Exception c) {
//            System.out.println(c);
//        }
//    }


}