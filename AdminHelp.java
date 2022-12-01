import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public interface AdminHelp {
    public String regStudent(Student student)throws IOException;
    public void assignStudent1(Student student) throws EncryptedDocumentException, IOException;
    public void assignStudent2(Student student) throws EncryptedDocumentException, IOException;
    public void assignStudent3(Student student) throws EncryptedDocumentException, IOException;
    public void assignStudent4(Student student) throws EncryptedDocumentException, IOException;
    public void assignStudent5(Student student) throws EncryptedDocumentException, IOException;
    public void modStdRec(Student std);
    public void enterStdGrds(String stdname,
    int grd1,int grd2, int grd3,int grd4) throws EncryptedDocumentException, IOException;
    public String removeRecords() throws EncryptedDocumentException, IOException;
    public void enterAEmployee(Admin admin) throws EncryptedDocumentException, IOException;
    public void enterGEmployee(GeneralEmployee employee) throws EncryptedDocumentException, IOException;
} 