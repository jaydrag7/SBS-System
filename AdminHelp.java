import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public interface AdminHelp {
    public String regStudent(Student student)throws IOException;
    public void assignStudent(Student std);
    public void modStdRec(Student std);
    public void enterStdGrds(Student student);
    public void removeRecords(Student lstOld_StdRecs);
    public void enterAEmployeeInfo(Admin admin);
    public void getAEmployeeInfo();
    public void enterGEmployee(GeneralEmployee employee) throws EncryptedDocumentException, IOException;
    //public String getGEmployeeInfo();
}
