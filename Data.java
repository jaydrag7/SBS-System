import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
public class Data {
    

    public static void main(String[] args) throws IOException{
        Row row;
        Cell cell;
        //int rows;
        int rowcount;
        int columncount;
        
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet1 = workbook.createSheet("Students");

        Object data[][]={
            {"STUDENT'S NAME","DOB","SEX","Address"}
        };

        rowcount=0;
        for(Object d[]:data){
            row=sheet1.createRow(rowcount++);
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }
        
        Object newdata[][]={
            {"John Brown","DD-MM-YYYY","MALE", "St. Catherine"}
        };
        for(Object d[]:newdata){
            row=sheet1.createRow(rowcount++);
            
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }

        Object newdata2[][]={
            {"Mary Johnson","DD-MM-YYYY","FEMALE","Kingston"}
        };
        for(Object d[]:newdata2){
            row=sheet1.createRow(rowcount++);
            
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }

        Object newdata3[][]={
            {"Jacob Bronsten","DD-MM-YYYY","MALE","Manchester"}
        };
        for(Object d[]:newdata3){
            row=sheet1.createRow(rowcount++);
            
            columncount=0;
            for(Object st:d){
                cell=row.createCell(columncount++);
                if(st instanceof String)
                    cell.setCellValue((String) st);

            }
        }

        int lastrow= sheet1.getLastRowNum();
        //System.out.println(lastrow);
        int i;
        for(i=0;i<=lastrow;i++){
            row=sheet1.getRow(i);
            if( row== null){
                Row Rrow=sheet1.getRow(i+1);
                if(Rrow==null)
                    break;
                sheet1.shiftRows(i+1, i+1, -1);
                
            }
            cell=row.getCell(0);
            if(cell.getStringCellValue().equals("John Brown")){
                sheet1.removeRow(row);
                sheet1.shiftRows(i+1, i+1, -1);
                System.out.println("John Brown has been removed!");
            
            }
            
        }
        

        /*rows = data.length;
        int columns = data[0].length;
        for(int r=0;r<rows;r++){
            row = sheet1.createRow(r);

            for(int c=0;c<columns;c++){
                cell = row.createCell(c);
                Object value = data[r][c];
                if(value instanceof String)
                cell.setCellValue((String)value);

            }
        }



    */

        File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\OneDrive\\Desktop\\Software Engineering\\Data.xlsx");
        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.close();
        workbook.close();

        System.out.println("Excel file created successfully....");
        
    }
}
