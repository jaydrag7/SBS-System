import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class Excel{
    public static void main(String[] args)throws IOException{
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet1 = workbook.createSheet("Students");

        XSSFRow row = sheet1.createRow(0);
        XSSFCell cell = row.createCell(0);
        cell.setCellValue("Student's Name");
        File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\TestExcel.xlsx");
        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.close();
        workbook.close();

        System.out.println("Excel file created successfully....");
    }
}
