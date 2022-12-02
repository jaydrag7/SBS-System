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
import org.apache.poi.ss.util.CellRangeAddress;
public class Admin extends Employee implements AdminHelp {

    private Row row;
    private Cell cell;
    private int rowcount;
    private int rowcount2;
    private int rowcount3;
    private int rowcount5;
    private int columncount;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet1;
    private XSSFSheet sheet2;
    private XSSFSheet sheet3;
    private XSSFSheet sheet4;
    private XSSFSheet sheet5;
    private XSSFSheet sheet6;
    private XSSFSheet sheet7;
    private XSSFSheet sheet8;
    private XSSFSheet sheet9;
    private File filepath;
    private FileOutputStream stream;
    private Date date=new Date();

    Admin(String name, String dob,Sex sex, String addr, String email, String telNumber,  EType empltype){
        super(name,dob,sex,addr,email,telNumber,empltype);
    }


    public void createExcel() throws IOException{
        workbook=new XSSFWorkbook();
        sheet1 = workbook.createSheet("Students");
        sheet2 = workbook.createSheet("Nursery 1");
        sheet3 = workbook.createSheet("Nursery 2");
        sheet4 = workbook.createSheet("Nursery 3");
        sheet5 = workbook.createSheet("Nursery 4");
        sheet6 = workbook.createSheet("Nursery 5");
        sheet7 = workbook.createSheet("Student Grades");
        sheet8 = workbook.createSheet("General Employee");
        sheet9 = workbook.createSheet("Admin");

        Object data[][]={
            {"#","DATE REGISTERED","STUDENT'S NAME","DOB","SEX","ADDRESS","DOCTOR'S NAME","DOCTOR'S EMAIL",
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
            {"#","DATE ADDED","EMPLOYEE NAME","EMPLOYEE DOB","EMPLOYEE SEX","EMPLOYEE ADDRESS",
            "EMPLOYEE EMAIL","EMPLOYEE TEL","EMPLOYEE TYPE"}
        };

        rowcount2=0;
        for(Object d[]:data2){
            row=sheet8.createRow(rowcount2++);
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }

        Object[][] data3={
            {"NURSERY 1"},
            {"STUDENT NAME"},
        };

        rowcount3=0;
        sheet2.addMergedRegion(new CellRangeAddress(0, 0,0, 3));
        sheet2.addMergedRegion(new CellRangeAddress(1, 1,0, 2));
        for(Object d[]:data3){
            row=sheet2.createRow(rowcount3++);
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }

        Object[][] data4={
            {"NURSERY 2"},
            {"STUDENT NAME"},
        };

        rowcount3=0;
        sheet3.addMergedRegion(new CellRangeAddress(0, 0,0, 3));
        sheet3.addMergedRegion(new CellRangeAddress(1, 1,0, 2));
        for(Object d[]:data4){
            row=sheet3.createRow(rowcount3++);
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }

        Object[][] data5={
            {"NURSERY 3"},
            {"STUDENT NAME"},
        };

        rowcount3=0;
        sheet4.addMergedRegion(new CellRangeAddress(0, 0,0, 3));
        sheet4.addMergedRegion(new CellRangeAddress(1, 1,0, 2));
        for(Object d[]:data5){
            row=sheet4.createRow(rowcount3++);
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }

        Object[][] data6={
            {"NURSERY 4"},
            {"STUDENT NAME"},
        };

        rowcount3=0;
        sheet5.addMergedRegion(new CellRangeAddress(0, 0,0, 3));
        sheet5.addMergedRegion(new CellRangeAddress(1, 1,0, 2));
        for(Object d[]:data6){
            row=sheet5.createRow(rowcount3++);
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }

        Object[][] data7={
            {"NURSERY 5"},
            {"STUDENT NAME"},
        };

        rowcount3=0;
        sheet6.addMergedRegion(new CellRangeAddress(0, 0,0, 3));
        sheet6.addMergedRegion(new CellRangeAddress(1, 1,0, 2));
        for(Object d[]:data7){
            row=sheet6.createRow(rowcount3++);
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }

        Object[][] data9={
            {"STUDENT NAME","SUBJECT GRADES"},
            {"","Arts & Craft","English","Math","Science"}
        };

        rowcount3=0;
        sheet7.addMergedRegion(new CellRangeAddress(0, 0,1, 4));
        for(Object d[]:data9){
            row=sheet7.createRow(rowcount3++);
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }



        Object[][] data8={
            {"#","DATE ADDED","EMPLOYEE NAME","EMPLOYEE DOB","EMPLOYEE SEX","EMPLOYEE ADDRESS",
            "EMPLOYEE EMAIL","EMPLOYEE TEL","EMPLOYEE TYPE"}
        };
        rowcount5=0;
        for(Object d[]:data8){
            row=sheet9.createRow(rowcount5++);
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
            {date.getTime(),student.getName(),student.getDOB(),student.getSex(), student.getAddr(), 
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

    public String enterGEmployee(GeneralEmployee employee) throws EncryptedDocumentException, IOException{
        String excelFilePath = "C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(7);

        Object newdata[][]={
            {date.getTime(),employee.getName(),employee.getDOB(),employee.getSex(),employee.getAddr(),
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
        return "Staff data has been entered";



    }

    public String assignStudent1(Student student) throws EncryptedDocumentException, IOException{
        String excelFilePath = "C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(1);

        Object newdata[][]={
            {student.getName()}
        };

        int rowCount = sheet.getLastRowNum();
        for (Object[] array : newdata) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;
             
            Cell cell = row.createCell(columnCount);
            cell.setCellValue(rowCount-1);
             
            for (Object field : array) {
                cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                }
            }
        }
        inputStream.close();
 
        FileOutputStream outputStream = new FileOutputStream( excelFilePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close(); 
        return "Student has been assigned to Nursery 1";


    }

    public String assignStudent2(Student student) throws EncryptedDocumentException, IOException{
        String excelFilePath = "C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(2);

        Object newdata[][]={
            {student.getName()}
        };

        int rowCount = sheet.getLastRowNum();
        for (Object[] array : newdata) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;
             
            Cell cell = row.createCell(columnCount);
            cell.setCellValue(rowCount-1);
             
            for (Object field : array) {
                cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                }
            }
        }
        inputStream.close();
 
        FileOutputStream outputStream = new FileOutputStream( excelFilePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close(); 
        return "Student has been assigned to Nursery 2";


    }

    public String assignStudent3(Student student) throws EncryptedDocumentException, IOException{
        String excelFilePath = "C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(3);

        Object newdata[][]={
            {student.getName()}
        };

        int rowCount = sheet.getLastRowNum();
        for (Object[] array : newdata) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;
             
            Cell cell = row.createCell(columnCount);
            cell.setCellValue(rowCount-1);
             
            for (Object field : array) {
                cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                }
            }
        }
        inputStream.close();
 
        FileOutputStream outputStream = new FileOutputStream( excelFilePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close(); 
        return "Student has been assigned to Nursery 3";

    }

    public String assignStudent4(Student student) throws EncryptedDocumentException, IOException{
        String excelFilePath = "C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(4);

        Object newdata[][]={
            {student.getName()}
        };

        int rowCount = sheet.getLastRowNum();
        for (Object[] array : newdata) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;
             
            Cell cell = row.createCell(columnCount);
            cell.setCellValue(rowCount-1);
             
            for (Object field : array) {
                cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                }
            }
        }
        inputStream.close();
 
        FileOutputStream outputStream = new FileOutputStream( excelFilePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close(); 
        return "Student has been assigned to Nursery 4";


    }

    public String assignStudent5(Student student) throws EncryptedDocumentException, IOException{
        String excelFilePath = "C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(5);

        Object newdata[][]={
            {student.getName()}
        };

        int rowCount = sheet.getLastRowNum();
        for (Object[] array : newdata) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;
             
            Cell cell = row.createCell(columnCount);
            cell.setCellValue(rowCount-1);
             
            for (Object field : array) {
                cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                }
            }
        }
        inputStream.close();
 
        FileOutputStream outputStream = new FileOutputStream( excelFilePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close(); 
        return "Student has been assigned to Nursery 5";


    }


    public String enterStdGrds(String stdname,int grd1,
    int grd2, int grd3,int grd4) throws EncryptedDocumentException, IOException{
        String excelFilePath = "C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(6);

        Object newdata[][]={
            {stdname,grd1,grd2,grd3,grd4}
        };

        int rowCount = sheet.getLastRowNum();
        for (Object[] array : newdata) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;
             
            Cell cell = row.createCell(columnCount);
             
            for (Object field : array) {
                cell = row.createCell(columnCount++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                }
                if (field instanceof Integer) {
                    cell.setCellValue((String) field.toString());
                }
            }
        }
        inputStream.close();
 
        FileOutputStream outputStream = new FileOutputStream( excelFilePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        return "Student's grades have been entered";

    }

    public String removeRecords() throws EncryptedDocumentException, IOException{
        String excelFilePath = "C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        int lastrow= sheet.getLastRowNum();
        int i;
        for(i=1;i<=lastrow;i++){
            Row row=sheet.getRow(i);
            Cell cell=row.getCell(1);
            String[] fdate= cell.getStringCellValue().split("/|\\-|\\:");
            int firstDate=Integer.parseInt(fdate[4]);
            Date ndate =new Date();
            String[] ndate_lst=ndate.getTime().split("/|\\-|\\:");
            int newDate=Integer.parseInt(ndate_lst[4]);
            if(Math.abs(newDate-firstDate)==1){
                sheet.removeRow(row);
            }
        }
        inputStream.close();
 
        FileOutputStream outputStream = new FileOutputStream( excelFilePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        return "Student(s) has been removed";
    }
    public String enterAEmployee(Admin admin) throws EncryptedDocumentException, IOException{
        String excelFilePath = "C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(8);

        Object newdata[][]={
            {date.getTime(),admin.getName(),admin.getDOB(),admin.getSex(),admin.getAddr(),
            admin.getEmail(),admin.getTelNum(),admin.getType()}
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
        return "Admin data has been entered";


    }
    

}
