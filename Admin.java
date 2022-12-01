import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Admin extends Employee implements AdminHelp {

    private Row row;
    private Cell cell;
    private int rowcount;
    private int rowcount2;
    private int columncount;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet1;
    private XSSFSheet sheet2;
    private File filepath;
    private FileOutputStream stream;

    Admin(String name, String dob,Sex sex, String addr, String email, String telNumber,  EType empltype){
        super(name,dob,sex,addr,email,telNumber,empltype);
    }


    public void createExcel() throws IOException{
        workbook=new XSSFWorkbook();
        sheet1 = workbook.createSheet("Students");
        sheet2 = workbook.createSheet("General Employee");

        Object data[][]={
            {"#","STUDENT'S NAME","DOB","SEX","ADDRESS","DOCTOR'S NAME","DOCTOR'S EMAIL",
            "DOCTOR'S TEL","PARENT'S NAME","PARENT'S DOB","PARENT'S SEX","PARENT'S ADDRESS","PARENT EMAIL",
            "Parent TEL","PARENT'S EMG","PARENT'S OCCUPATION","PARENT'S NAME","PARENT'S DOB","PARENT'S SEX",
            "PARENT'S ADDRESS","PARENT EMAIL",
            "Parent TEL","PARENT'S EMG","PARENT'S OCCUPATION"}
            
            
        };

        rowcount2=0;
        for(Object d[]:data){
            row=sheet1.createRow(rowcount++);
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }
        Object[][] data2={
            {"#","EMPLOYEE NAME","EMPLOYEE DOB","EMPLOYEE SEX","EMPLOYEE ADDRESS",
            "EMPLOYEE EMAIL","EMPLOYEE TEL","EMPLOYEE TYPE"}
        };

        rowcount2=0;
        for(Object d[]:data2){
            row=sheet2.createRow(rowcount2++);
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }

        filepath = new File("C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx");
        stream = new FileOutputStream(filepath);
        workbook.write(stream);
        stream.close();
        workbook.close();
    }

    public String regStudent(Student student) throws IOException{
        String excelFilePath = "C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        Object newdata[][]={
            {student.getName(),student.getDOB(),student.getSex(), student.getAddr(), 
            student.getDName(),student.getEmail(),student.getTelNum(),student.getpName(),
            student.getpDOB(),student.getpSex(),student.getpAddr(),student.getpEmail(),
            student.getpNumber(),student.getpEmgContact(),student.getpOccupation(),
            student.getp2Name(),student.getp2DOB(),student.getp2Sex(),student.getp2Addr(),
            student.getp2Email(),student.getp2Number(),student.getp2EmgContact(),
            student.getp2Occupation()}
        };

        int rowCount = sheet.getLastRowNum();
        for (Object[] array : newdata) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;
             
            Cell cell = row.createCell(columnCount);
            cell.setCellValue(rowCount);
             
            for (Object field : array) {
                cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Sex) {
                    cell.setCellValue((String) field.toString());
                }
            }

        }
        
        inputStream.close();
 
        FileOutputStream outputStream = new FileOutputStream( excelFilePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
      
        return "Student has been registered";

    }

    public void enterGEmployee(GeneralEmployee employee) throws EncryptedDocumentException, IOException{
        String excelFilePath = "C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(1);

        Object newdata[][]={
            {employee.getName(),employee.getDOB(),employee.getSex(),employee.getAddr(),
            employee.getEmail(),employee.getTelNum(),employee.getType()}
        };

        int rowCount = sheet.getLastRowNum();
        for (Object[] array : newdata) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;
             
            Cell cell = row.createCell(columnCount);
            cell.setCellValue(rowCount);
             
            for (Object field : array) {
                cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Sex) {
                    cell.setCellValue((String) field.toString());
                }else if(field instanceof EType){
                    cell.setCellValue((String) field.toString());

                }
            }

        }
        
        inputStream.close();
 
        FileOutputStream outputStream = new FileOutputStream( excelFilePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();



    }

    public void assignStudent(Student std){

    }

    public void modStdRec(Student std){

    }
    public void enterStdGrds(Student student){

    }
    public void removeRecords(Student lstOld_StdRecs){

    }
    public void enterAEmployeeInfo(Admin admin){

    }
    public void getAEmployeeInfo(){

    }
    
    /*public String getGEmployeeInfo(){
        String st;
        st="Name:\\t";
        st+=employee.getName()+"\\n";
        st+="Date of Birth:\\t";
        st+=employee.getDOB()+"\\n";
        st+="Sex:\\t";
        st+=employee.getSex()+"\\n";
        st+="Address:\\t";
        st+=employee.getAddr()+"\\n";
        st+="Email:\\t";
        st+=employee.getEmail()+"\\n";
        st+="Telephone Number: \\t";
        st+=employee.getTelNum()+"\\n";
        st+="Type:\\t";
        st+=employee.getType();
        return st;
    }*/
}
