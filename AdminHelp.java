import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public interface AdminHelp {
    public String regStudent(Student student)throws IOException;
    public String assignStudent1(Student student) throws EncryptedDocumentException, IOException;
    public String assignStudent2(Student student) throws EncryptedDocumentException, IOException;
    public String assignStudent3(Student student) throws EncryptedDocumentException, IOException;
    public String assignStudent4(Student student) throws EncryptedDocumentException, IOException;
    public String assignStudent5(Student student) throws EncryptedDocumentException, IOException;
    public String enterStdGrds(String stdname,
    int grd1,int grd2, int grd3,int grd4) throws EncryptedDocumentException, IOException;
    public String removeRecords() throws EncryptedDocumentException, IOException;
    public String enterAEmployee(Admin admin) throws EncryptedDocumentException, IOException;
    public String enterGEmployee(GeneralEmployee employee) throws EncryptedDocumentException, IOException;
} 