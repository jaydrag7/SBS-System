import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestAdmin {
    public static void main(String[] args) throws IOException {
        ArrayList<String> dislike =new ArrayList<String>();
        HashMap<String, Integer> grades= new HashMap<>();
        String subject1="Math";
        String subject2="Science";
        String subject3="English";
        String subject4="Arts & Craft";

        int grd1=90;
        int grd2=80;
        int grd3=70;
        int grd4=60;
        grades.put(subject1,grd1);
        grades.put(subject2,grd2);
        grades.put(subject3,grd3);
        grades.put(subject4,grd4);
        Grade grds= new Grade(grades);
        
        String name="John Brown";
        String DOB="01/11/2020";
        Sex sex=Sex.MALE;
        String address= "Kingston 5";
        String dName="Dr. Young";
        String dEmail="jonmarcyoung@gmail.com";
        String dTel= "876 773 5614";
        String dislike1="Porridge";
        String dislike2="Chicken Liver";
        dislike.add(dislike1);
        dislike.add(dislike2);

        String pname="Jonothan Brown";
        String pdob="26/08/1976";
        Sex psex=Sex.MALE;
        String paddr="Kingston 5";
        String pemail="jonothan.brown@outlook.com";
        String ptelNum="876 999 7234";
        String pemg="876 238 8927";
        String poccupation="Plumber";

        String p2name="Jane Brown";
        String p2dob="17/11/1973";
        Sex p2sex=Sex.FEMALE;
        String p2addr="Kingston 5";
        String p2email="jane.brown@yahoo.com";
        String p2telNum="876 928 1822";
        String p2emg="876 873 9873";
        String p2occupation="Teacher";

        ArrayList<String> std2dislike =new ArrayList<String>();
        HashMap<String, Integer> std2grades= new HashMap<>();
        String std2subject1="Math";
        String std2subject2="Science";
        String std2subject3="English";
        String std2subject4="Arts & Craft";

        int std2grd1=90;
        int std2grd2=80;
        int std2grd3=70;
        int std2grd4=88;
        std2grades.put(std2subject1,std2grd1);
        std2grades.put(std2subject2,std2grd2);
        std2grades.put(std2subject3,std2grd3);
        std2grades.put(std2subject4,std2grd4);
        Grade std2grds= new Grade(std2grades);
        
        String std2name="Mary Smith";
        String std2DOB="01/09/2020";
        Sex std2sex=Sex.FEMALE;
        String std2address= "Kingston 9";
        String std2dName="Dr. Green";
        String std2dEmail="green@yahoo.com";
        String std2dTel= "876 773 8735";
        String std2dislike1="Green Peas";
        String std2dislike2="Orange Juice";
        std2dislike.add(std2dislike1);
        std2dislike.add(std2dislike2);

        String std2pname="Charles Smith";
        String std2pdob="26/08/1976";
        Sex std2psex=Sex.MALE;
        String std2paddr="Kingston 9";
        String std2pemail="";
        String std2ptelNum="876 836 7234";
        String std2pemg="876 238 6771";
        String std2poccupation="Electrician";

        String std2p2name="Jane Smith";
        String std2p2dob="17/11/1973";
        Sex std2p2sex=Sex.FEMALE;
        String std2p2addr="Kingston 9";
        String std2p2email="";
        String std2p2telNum="876 999 1822";
        String std2p2emg="876 261 9873";
        String std2p2occupation="Teacher";

        


        /*System.out.println(admin.regStudent(new Student(name, DOB, sex, 
        address,dName , dEmail, dTel, dislike, 
        grds, pname, pdob, psex, paddr,
        pemail, ptelNum, pemg, poccupation, 
        p2name, p2dob, p2sex, p2addr, p2email, 
        p2telNum, p2emg, p2occupation)));

        System.out.println(admin.regStudent(new Student(std2name, std2DOB, std2sex, 
        std2address,std2dName , std2dEmail, std2dTel, std2dislike, 
        std2grds, std2pname, std2pdob, std2psex, std2paddr,
        std2pemail, std2ptelNum, std2pemg, std2poccupation, 
        std2p2name, std2p2dob, std2p2sex, std2p2addr, std2p2email, 
        std2p2telNum, std2p2emg, std2p2occupation)));*/

        Admin admin = new Admin("Jonmarc Young", "DD-MM-YYY", Sex.MALE, "Kingston 15", "jonmarcyoungjy7@gmail.com",
        "876-582-9568", EType.ADMIN);

        GeneralEmployee employee1 = new GeneralEmployee("Craig Nelson", 
        "dd-mm-yyy", Sex.MALE, "Ocho Rios Street", "craig.nelson@outlook.com",
        "876 266 7862",EType.GENERAL);
       
        String excelFilePath = "C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx";
        if(new File(excelFilePath).exists()){
            //System.out.println(admin.enterGEmployee(employee1));
            //System.out.println(admin.enterAEmployee(admin));

            /*System.out.println(admin.assignStudent1(new Student(std2name, std2DOB, std2sex, 
            std2address,std2dName , std2dEmail, std2dTel, std2dislike, 
            std2grds, std2pname, std2pdob, std2psex, std2paddr,
            std2pemail, std2ptelNum, std2pemg, std2poccupation, 
            std2p2name, std2p2dob, std2p2sex, std2p2addr, std2p2email, 
            std2p2telNum, std2p2emg, std2p2occupation)));*/

            /*System.out.println(admin.assignStudent2(new Student(name, DOB, sex, 
            address,dName , dEmail, dTel, dislike, 
            grds, pname, pdob, psex, paddr,
            pemail, ptelNum, pemg, poccupation, 
            p2name, p2dob, p2sex, p2addr, p2email, 
            p2telNum, p2emg, p2occupation)));*/

            /*System.out.println(admin.regStudent(new Student(std2name, std2DOB, std2sex, 
            std2address,std2dName , std2dEmail, std2dTel, std2dislike, 
            std2grds, std2pname, std2pdob, std2psex, std2paddr,
            std2pemail, std2ptelNum, std2pemg, std2poccupation, 
            std2p2name, std2p2dob, std2p2sex, std2p2addr, std2p2email, 
            std2p2telNum, std2p2emg, std2p2occupation)));*/

           /* System.out.println(admin.regStudent(new Student(name, DOB, sex, 
        address,dName , dEmail, dTel, dislike, 
        grds, pname, pdob, psex, paddr,
        pemail, ptelNum, pemg, poccupation, 
        p2name, p2dob, p2sex, p2addr, p2email, 
        p2telNum, p2emg, p2occupation)));*/

        System.out.println(admin.enterStdGrds("John Brown", std2grd4, std2grd1, std2grd2, std2grd3));
        System.out.println(admin.enterStdGrds("Mary Smith", 99, 78, 89, 100));

        //System.out.println(admin.removeRecords());

        }
        else{
            admin.createExcel();
        }   
    }
}
