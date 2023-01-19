package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;

public class Controller {


    @FXML
    private Button btnCourses;

    @FXML
    private Label AddCourseActionState;

    @FXML
    private TextField AddCourseCode;

    @FXML
    private TextField AddCourseCode2;

    @FXML
    private TextField AddCourseLevel;

    @FXML
    private TextField AddCourseLevel2;

    @FXML
    private TextField AddCourseName;

    @FXML
    private TextField AddCourseName2;

    @FXML
    private TextField AddCourseOfficialHours;

    @FXML
    private TextField AddCourseOfficialHours2;

    @FXML
    private TextField AddCourseScore;

    @FXML
    private TextField AddCourseScore2;

    @FXML
    private Label ErrorCourseActionState;


    //----------------------------------------

    @FXML
    private Button btnHome;

    @FXML
    private Label AddDepartmentActionState;

    @FXML
    private TextField AddDepartmentCategory;

    @FXML
    private TextField AddDepartmentCategory2;

    @FXML
    private Label ErrorDepartmentActionState;


    //----------------------------------------

    @FXML
    private Button btnProfessors;

    @FXML
    private TextField AddProfessorName;

    @FXML
    private TextField AddProfessorName2;

    @FXML
    private TextField AddProfessorPhone;

    @FXML
    private TextField AddProfessorPhone2;

    @FXML
    private TextField AddProfessorSalary;

    @FXML
    private TextField AddProfessorSalary2;

    @FXML
    private TextField AddProvideAuto;

    @FXML
    private TextField AddProvideAuto2;

    @FXML
    private TextField AddProvideIT;

    @FXML
    private TextField AddProvideIT2;

    @FXML
    private TextField AddProvideMecha;

    @FXML
    private TextField AddProvideMecha2;

    @FXML
    private TextField AddProvideREnergy;

    @FXML
    private TextField AddProvideREnergy2;

    @FXML
    private Label ErrorProfessorActionState;

    @FXML
    private Label AddProfessorActionState;


    //--------------------------------------------------

    @FXML
    private Button btnStudents;

    @FXML
    private TextField AddFullStudentName;

    @FXML
    private TextField AddStudentDepartName;

    @FXML
    private TextField AddStudentLevel;

    @FXML
    private TextField AddStudentPhone;

    @FXML
    private TextField AddFullStudentName2;

    @FXML
    private TextField AddStudentDepartName2;

    @FXML
    private TextField AddStudentLevel2;

    @FXML
    private TextField AddStudentPhone2;

    @FXML
    private Label AddStudentActionState;

    @FXML
    private Label ErrorStudentActionState;

    @FXML
    private TextArea StudentDataDisplayArea;





    @FXML
    private void handleButtonClick(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == btnHome)
        {
            LoadStages("/sample/AddDepartment.fxml");

        }

        else if (mouseEvent.getSource() == btnStudents)
        {
            LoadStages("/sample/AddStudend.fxml");


        }
        else if (mouseEvent.getSource() == btnCourses)
        {
            LoadStages("/sample/AddCourse.fxml");



        }
        else if (mouseEvent.getSource() == btnProfessors)
        {
            LoadStages("/sample/AddProfessor.fxml");


        }

    }



    @FXML
    private void StudentAddData() throws IOException {
        if(AddFullStudentName.getText().isEmpty() && AddStudentDepartName.getText().isEmpty() && AddStudentLevel.getText().isEmpty() && AddStudentPhone.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter a valid data!!");
            AddStudentActionState.setText("");
        }else if(AddFullStudentName.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter name");
            AddStudentActionState.setText("");
        }else if(AddStudentDepartName.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter department");
            AddStudentActionState.setText("");
        }else if(AddStudentPhone.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter phone number");
            AddStudentActionState.setText("");
        }else if(AddStudentLevel.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter student level");
            AddStudentActionState.setText("");
        }
        else {
                student s= new student(AddFullStudentName.getText(), AddStudentDepartName.getText(), AddStudentLevel.getText(), AddStudentPhone.getText());
                s.insert(s.writeToString());
                AddStudentActionState.setText("Success Data Added");
                ErrorStudentActionState.setText("");

        }
    }

    @FXML
    private void StudentEditData() throws IOException {
        if(AddFullStudentName.getText().isEmpty() && AddStudentDepartName.getText().isEmpty() && AddStudentLevel.getText().isEmpty() && AddStudentPhone.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter a valid data!!");
            AddStudentActionState.setText("");
        }else if(AddFullStudentName.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter name");
            AddStudentActionState.setText("");
        }else if(AddStudentDepartName.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter department");
            AddStudentActionState.setText("");
        }else if(AddStudentPhone.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter phone number");
            AddStudentActionState.setText("");
        }else if(AddStudentLevel.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter student level");
            AddStudentActionState.setText("");
        }else if(AddFullStudentName2.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter new student name");
            AddStudentActionState.setText("");
        }else if(AddStudentDepartName2.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter new department name");
            AddStudentActionState.setText("");
        }else if(AddStudentLevel2.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter new level");
            AddStudentActionState.setText("");
        }else if(AddStudentPhone2.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter new phone , if not have enter 0");
            AddStudentActionState.setText("");
        } else {
            student s= new student(AddFullStudentName.getText(), AddStudentDepartName.getText(), AddStudentLevel.getText(), AddStudentPhone.getText());
            student s1= new student(AddFullStudentName2.getText(), AddStudentDepartName2.getText(), AddStudentLevel2.getText(), AddStudentPhone2.getText());
            s1.update(s.writeToString(),s1.writeToString());
            AddStudentActionState.setText("Success Data edited");
            ErrorStudentActionState.setText("");

        }
    }

    @FXML
    private void StudentSearchData() throws IOException {
        if(AddFullStudentName.getText().isEmpty() && AddStudentDepartName.getText().isEmpty() && AddStudentLevel.getText().isEmpty() && AddStudentPhone.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter a valid data!!");
            AddStudentActionState.setText("");
        }else if(AddFullStudentName.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter name");
            AddStudentActionState.setText("");
        }else if(AddStudentDepartName.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter department");
            AddStudentActionState.setText("");
        }else if(AddStudentPhone.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter phone number");
            AddStudentActionState.setText("");
        }else if(AddStudentLevel.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter student level");
            AddStudentActionState.setText("");
        } else {
            student s= new student(AddFullStudentName.getText(), AddStudentDepartName.getText(), AddStudentLevel.getText(),AddStudentPhone.getText());
            StudentDataDisplayArea.setText(s.search(s.writeToString()));
            ErrorStudentActionState.setText("");

        }
    }

    @FXML
    private void StudentDeleteData() throws IOException {
        if(AddFullStudentName.getText().isEmpty() && AddStudentDepartName.getText().isEmpty() && AddStudentLevel.getText().isEmpty() && AddStudentPhone.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter a valid data!!");
            AddStudentActionState.setText("");
        }else if(AddFullStudentName.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter name");
            AddStudentActionState.setText("");
        }else if(AddStudentDepartName.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter department");
            AddStudentActionState.setText("");
        }else if(AddStudentPhone.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter phone number");
            AddStudentActionState.setText("");
        }else if(AddStudentLevel.getText().isEmpty()) {
            ErrorStudentActionState.setText("Please enter student level");
            AddStudentActionState.setText("");
        } else {
            student s= new student(AddFullStudentName.getText(), AddStudentDepartName.getText(), AddStudentLevel.getText(), AddStudentPhone.getText());
            s.delete(s.writeToString());
            AddStudentActionState.setText("Data probably deleted");
            ErrorStudentActionState.setText("");

        }
    }

    //-------------------------------------------------------------------------------

    @FXML
    void ProfessorAddData(ActionEvent event) {

        if(AddProfessorName.getText().isEmpty() && AddProfessorPhone.getText().isEmpty() && AddProfessorSalary.getText().isEmpty() && AddProvideIT.getText().isEmpty() && AddProvideMecha.getText().isEmpty() && AddProvideAuto.getText().isEmpty() && AddProvideREnergy.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter a valid data!!");
            AddProfessorActionState.setText("");
        }else if(AddProfessorName.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter name");
            AddProfessorActionState.setText("");
        }else if(AddProfessorPhone.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter phone");
            AddProfessorActionState.setText("");
        }else if(AddProfessorPhone.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter phone number");
            AddProfessorActionState.setText("");
        }else if(AddProfessorSalary.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter valid salary");
            AddProfessorActionState.setText("");
        }
        else {
            professor pf1= new professor(AddProfessorName.getText(), AddProfessorPhone.getText(), AddProfessorSalary.getText(), AddProvideIT.getText(),AddProvideMecha.getText(),AddProvideAuto.getText(),AddProvideREnergy.getText());
            pf1.insert(pf1.writeToString());
            AddProfessorActionState.setText("Success Data Added");
            ErrorProfessorActionState.setText("");

        }


    }

    @FXML
    void ProfessorDeleteData(ActionEvent event) {

        if(AddProfessorName.getText().isEmpty() && AddProfessorPhone.getText().isEmpty() && AddProfessorSalary.getText().isEmpty() && AddProvideIT.getText().isEmpty() && AddProvideMecha.getText().isEmpty() && AddProvideAuto.getText().isEmpty() && AddProvideREnergy.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter a valid data!!");
            AddProfessorActionState.setText("");
        }else if(AddProfessorName.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter name");
            AddProfessorActionState.setText("");
        }else if(AddProfessorPhone.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter phone");
            AddProfessorActionState.setText("");
        }else if(AddProfessorPhone.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter phone number");
            AddProfessorActionState.setText("");
        }else if(AddProfessorSalary.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter valid salary");
            AddProfessorActionState.setText("");
        }
        else {
            professor pf1= new professor(AddProfessorName.getText(), AddProfessorPhone.getText(), AddProfessorSalary.getText(), AddProvideIT.getText(),AddProvideMecha.getText(),AddProvideAuto.getText(),AddProvideREnergy.getText());
            pf1.delete(pf1.writeToString());
            AddProfessorActionState.setText("Data probably deleted");
            ErrorProfessorActionState.setText("");

        }

    }

    @FXML
    void ProfessorEditData(ActionEvent event) {

        if(AddProfessorName.getText().isEmpty() && AddProfessorPhone.getText().isEmpty() && AddProfessorSalary.getText().isEmpty() && AddProvideIT.getText().isEmpty() && AddProvideMecha.getText().isEmpty() && AddProvideAuto.getText().isEmpty() && AddProvideREnergy.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter a valid data!!");
            AddProfessorActionState.setText("");
        }else if(AddProfessorName.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter name");
            AddProfessorActionState.setText("");
        }else if(AddProfessorPhone.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter phone");
            AddProfessorActionState.setText("");
        }else if(AddProfessorPhone.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter phone number");
            AddProfessorActionState.setText("");
        }else if(AddProfessorSalary.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter valid salary");
            AddProfessorActionState.setText("");
        }
        else {
            professor pf1= new professor(AddProfessorName.getText(), AddProfessorPhone.getText(), AddProfessorSalary.getText(), AddProvideIT.getText(),AddProvideMecha.getText(),AddProvideAuto.getText(),AddProvideREnergy.getText());
            professor pf2= new professor(AddProfessorName2.getText(), AddProfessorPhone2.getText(), AddProfessorSalary2.getText(), AddProvideIT2.getText(),AddProvideMecha2.getText(),AddProvideAuto2.getText(),AddProvideREnergy2.getText());
            pf1.update(pf1.writeToString(),pf2.writeToString());
            AddProfessorActionState.setText("Success Data Added");
            ErrorProfessorActionState.setText("");

        }

    }

    @FXML
    void ProfessorSearchData(ActionEvent event) {

        if(AddProfessorName.getText().isEmpty() && AddProfessorPhone.getText().isEmpty() && AddProfessorSalary.getText().isEmpty() && AddProvideIT.getText().isEmpty() && AddProvideMecha.getText().isEmpty() && AddProvideAuto.getText().isEmpty() && AddProvideREnergy.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter a valid data!!");
            AddProfessorActionState.setText("");
        }else if(AddProfessorName.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter name");
            AddProfessorActionState.setText("");
        }else if(AddProfessorPhone.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter phone");
            AddProfessorActionState.setText("");
        }else if(AddProfessorPhone.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter phone number");
            AddProfessorActionState.setText("");
        }else if(AddProfessorSalary.getText().isEmpty()) {
            ErrorProfessorActionState.setText("Please enter valid salary");
            AddProfessorActionState.setText("");
        }
        else {
            professor pf1= new professor(AddProfessorName.getText(), AddProfessorPhone.getText(), AddProfessorSalary.getText(), AddProvideIT.getText(),AddProvideMecha.getText(),AddProvideAuto.getText(),AddProvideREnergy.getText());

            AddProfessorActionState.setText(pf1.search(pf1.writeToString()));
            ErrorProfessorActionState.setText("");

        }

    }



    //-----------------------------------------------------------------------


    @FXML
    void DepartmentAddData(ActionEvent event) {

        if(AddDepartmentCategory.getText().isEmpty()) {
            ErrorDepartmentActionState.setText("Please enter a valid category!!");
            AddDepartmentCategory.setText("");
        }
        else {
            departments d1= new departments(AddDepartmentCategory.getText());
            d1.insert(d1.writeToString());
            AddDepartmentActionState.setText("Department Data Added");
            ErrorDepartmentActionState.setText("");

        }

    }

    @FXML
    void DepartmentDeleteData(ActionEvent event) {
        if(AddDepartmentCategory.getText().isEmpty()) {
            ErrorDepartmentActionState.setText("Please enter a valid category!!");
            AddDepartmentCategory.setText("");
        }
        else {
            departments d1= new departments(AddDepartmentCategory.getText());
            d1.delete(d1.writeToString());
            AddDepartmentActionState.setText("Department Data probably deleted");
            ErrorDepartmentActionState.setText("");

        }
    }

    @FXML
    void DepartmentEditData(ActionEvent event) {

        if(AddDepartmentCategory.getText().isEmpty()) {
            ErrorDepartmentActionState.setText("Please enter a valid category!!");
            AddDepartmentCategory.setText("");
        }
        else {
            departments d1= new departments(AddDepartmentCategory.getText());
            departments d2=new departments(AddDepartmentCategory2.getText());
            d1.update(d1.writeToString(), d2.writeToString());
            AddDepartmentActionState.setText("Department Data edited successfully");
            ErrorDepartmentActionState.setText("");

        }

    }

    @FXML
    void DepartmentSearchData(ActionEvent event) {

        if(AddDepartmentCategory.getText().isEmpty()) {
            ErrorDepartmentActionState.setText("Please enter a valid category!!");
            AddDepartmentCategory.setText("");
        }
        else {
            departments d1= new departments(AddDepartmentCategory.getText());

            AddDepartmentActionState.setText(d1.search(d1.writeToString()));
            ErrorDepartmentActionState.setText("");

        }

    }



    //------------------------------------------------------------------------


    @FXML
    void AddCourseData(ActionEvent event) {
        if(AddCourseName.getText().isEmpty() && AddCourseOfficialHours.getText().isEmpty() && AddCourseLevel.getText().isEmpty() && AddCourseScore.getText().isEmpty()) {
            ErrorCourseActionState.setText("Please enter a valid data!!");
            AddCourseActionState.setText("");
        }else if(AddCourseName.getText().isEmpty()) {
            ErrorCourseActionState.setText("Please enter a valid name");
            AddCourseActionState.setText("");
        }else if(AddCourseOfficialHours.getText().isEmpty()) {
            ErrorCourseActionState.setText("Please enter a valid hours number");
            AddCourseActionState.setText("");
        }else if(AddCourseLevel.getText().isEmpty()) {
            ErrorCourseActionState.setText("Please enter a valid level number");
            AddCourseActionState.setText("");
        }else if(AddCourseScore.getText().isEmpty()) {
            ErrorCourseActionState.setText("Please enter a valid score");
            AddCourseActionState.setText("");
        }
        else {
            courses c1= new courses(AddCourseName.getText(),AddCourseOfficialHours.getText(),AddCourseLevel.getText(),AddCourseScore.getText());
            c1.insert(c1.writeToString());
            AddCourseActionState.setText("Course Data Added");
            ErrorCourseActionState.setText("");

        }
    }

    @FXML
    void DeleteCourseData(ActionEvent event) {

        if(AddCourseName.getText().isEmpty() && AddCourseOfficialHours.getText().isEmpty() && AddCourseLevel.getText().isEmpty() && AddCourseScore.getText().isEmpty()) {
            ErrorCourseActionState.setText("Please enter a valid data!!");
            AddCourseActionState.setText("");
        }
        else {
            courses c1= new courses(AddCourseName.getText(),AddCourseOfficialHours.getText(),AddCourseLevel.getText(),AddCourseScore.getText());
            c1.delete(c1.writeToString());
            AddCourseActionState.setText("Course Data probably deleted");
            ErrorCourseActionState.setText("");

        }

    }

    @FXML
    void EditCourseData(ActionEvent event) {

        if(AddCourseName.getText().isEmpty() && AddCourseOfficialHours.getText().isEmpty() && AddCourseLevel.getText().isEmpty() && AddCourseScore.getText().isEmpty()) {
            ErrorCourseActionState.setText("Please enter a valid data!!");
            AddCourseActionState.setText("");
        }
        else {
            courses c1= new courses(AddCourseName.getText(),AddCourseOfficialHours.getText(),AddCourseLevel.getText(),AddCourseScore.getText());
            courses c2= new courses(AddCourseName2.getText(),AddCourseOfficialHours2.getText(),AddCourseLevel2.getText(),AddCourseScore2.getText());
            c1.update(c1.writeToString(),c2.writeToString());
            AddCourseActionState.setText("Course Data updated");
            ErrorCourseActionState.setText("");

        }

    }

    @FXML
    void SearchCourseData(ActionEvent event) {

        if(AddCourseName.getText().isEmpty() && AddCourseOfficialHours.getText().isEmpty() && AddCourseLevel.getText().isEmpty() && AddCourseScore.getText().isEmpty()) {
            ErrorCourseActionState.setText("Please enter a valid data!!");
            AddCourseActionState.setText("");
        }
        else {
            courses c1= new courses(AddCourseName.getText(),AddCourseOfficialHours.getText(),AddCourseLevel.getText(),AddCourseScore.getText());

            AddCourseActionState.setText(c1.search(c1.writeToString()));
            ErrorCourseActionState.setText("");

        }

    }



    //------------------------------------------------------------------------


    public void userLogOut(ActionEvent event) throws IOException {
        Main m4=new Main();
        m4.changeScene("/sample/sample.fxml");


    }



    private void LoadStages(String fxml){
        try {
            Parent root= FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}

