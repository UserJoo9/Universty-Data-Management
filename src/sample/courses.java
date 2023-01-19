package sample;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class courses{


    String courseName;
    String numberOfHours;
    String level;
    String score;

    courses(){

    }

    courses(String courseName,String numberOfHours,String level,String score){

        this.courseName=courseName;
        this.numberOfHours=numberOfHours;
        this.level=level;
        this.score=score;

    }

//    void setCode(int code){
//        this.code=code;
//    }
//    int getCode(){
//        return code;
//    }

    void setCourseName(String courseName){
        this.courseName=courseName;
    }
    String getCourseName(){
        return courseName;
    }

    void setNumberOfHours(String numberOfHours){
        this.numberOfHours=numberOfHours;
    }
    String getNumberOfHours(){
        return numberOfHours;
    }

    void setLevel(String level){
        this.level=level;
    }

    String getLevel(){
        return level;
    }

     void setScore(String score){
        this.score=score;
     }
     String getScore(){
        return score;
     }


    public void delete(String recToDel) {
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\courses_in.txt");
            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\courses_out.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNext()) {
                String fileRec = sc.nextLine();
                if (recToDel.equals(fileRec)) {
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
        courses.FileIO();
    }

    public String writeToString() {

//        int code=getCode();
        String courseName=getCourseName();
        String numOfhours=getNumberOfHours();
        String level=getLevel();
        String score=getScore();


        String line = courseName+":"+numOfhours+":"+level+":"+score;

        return line;
    }


    public void insert(String line) {
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\courses_in.txt");
            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\courses_out.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNext()) {
                String fileRec = sc.nextLine();
                pw.println(fileRec);
            }
            pw.println(line);
            pw.close();
            sc.close();
        } catch (Exception c) {
            System.out.println(c);
        }
        courses.FileIO();
    }


    public static void FileIO(){
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\courses_out.txt");
            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\courses_in.txt");
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
            File f1 = new File("D:\\untitled7\\src\\sample\\courses_in.txt");
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
        courses.FileIO();

    }

}
