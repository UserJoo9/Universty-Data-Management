package sample;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class professor {
    String professorName;
    String phonenumber;
    String salary;
    String it;
    String mechatronics;
    String autotronics;
    String renewableEnergy;

    professor(String professorName,String phonenumber,String salary,String it,String mechatronics,String autotronics,String renewableEnergy){

        this.professorName=professorName;
        this.phonenumber=phonenumber;
        this.salary=salary;
        this.it=it;
        this.mechatronics=mechatronics;
        this.autotronics=autotronics;
        this.renewableEnergy=renewableEnergy;


    }

    void setProfessorName(String professorName){
        this.professorName=professorName;
    }
    String getProfessorName(){
        return professorName;
    }

    void setPhonenumber(String phonenumber){
        this.phonenumber=phonenumber;
    }
    String getPhonenumber(){
        return phonenumber;
    }

    void setSalary(String salary){
        this.salary=salary;
    }
    String getSalary(){
        return salary;
    }

    void setIt(String it){
        this.it=it;
    }
    String isIt(){
        return it;
    }

    void setMechatronics(String mechatronics){
        this.mechatronics=mechatronics;
    }
    String isMechatronics(){
        return mechatronics;
    }

    void setAutotronics(String autotronics){
        this.autotronics=autotronics;
    }
    String isAutotronics(){
        return autotronics;
    }

    void setRenewableEnergy(String renewableEnergy){
        this.renewableEnergy=renewableEnergy;
    }
    String isRenewableEnergy(){
        return renewableEnergy;
    }



    public void delete(String recToDel) {
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\professor_in.txt");
            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\professor_out.txt");
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
        professor.FileIO();
    }



    public String writeToString() {

        String Name = getProfessorName();
        String phone =getPhonenumber();
        String salary = getSalary();
        String it = isIt();
        String mecha = isMechatronics();
        String aouto = isAutotronics();
        String energy = isRenewableEnergy();



        String record = Name + ":" + phone + ":" + salary +":" + it +":"+mecha+":"+aouto+":"+energy;

        return record;
    }




    public void insert(String record) {
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\professor_in.txt");
            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\professor_out.txt");
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
        professor.FileIO();
    }



    public static void FileIO(){
        try {
            File f1 = new File("D:\\untitled7\\src\\sample\\professor_out.txt");
            PrintWriter pw = new PrintWriter("D:\\untitled7\\src\\sample\\professor_in.txt");
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
            File f1 = new File("D:\\untitled7\\src\\sample\\professor_in.txt");
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
        professor.FileIO();

    }



}
