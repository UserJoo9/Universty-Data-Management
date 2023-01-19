package sample;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class departments extends courses {
    String department;
//    double totalHours;
//    int totalOfStudent;

    departments(String department){
       this.department=department;
//       this.totalHours=totalHours;
//       this.totalOfStudent=totalOfStudent;
    }

    void setDepartment(String departments){
        this.department=department;
    }
    String getDepartment(){
        return department;
    }

//    void setTotalHours(double totalHours){
//        this.totalHours=totalHours;
//    }
//    double getTotalHours(){
//        return totalHours;
//    }

//    void setTotalOfStudent(int totalOfStudent){
//        this.totalOfStudent=totalOfStudent;
//    }
//    int getTotalOfStudent(){
//        return  totalOfStudent;
//    }


    public void delete(String recToDel) {
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\departments_in.txt");
            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\departments_out.txt");
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
        departments.FileIO();
    }

    public String writeToString() {
        String department= getDepartment();
//        double totalhours=getTotalHours();
//        int totalstudents=getTotalOfStudent();


        String record = department ;

        return record;
    }



    public void insert(String record) {
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\departments_in.txt");
            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\departments_out.txt");
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
        departments.FileIO();
    }


    public static void FileIO(){
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\departments_out.txt");
            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\departments_in.txt");
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
            File f1 = new File("D:\\untitled7\\src\\sample\\department_in.txt");
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
        departments.FileIO();


    }




}
