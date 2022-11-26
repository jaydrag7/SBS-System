public interface AdminHelp {
    public void regStudent(Student std);
    public void assignStudent(Student std);
    public void modStdRec(Student std);
    public void enterStdGrds(Student student);
    public void removeRecords(Student lstOld_StdRecs);
    public void enterAEmployeeInfo();
    public void getAEmployeeInfo();
    public void enterGEmployee(GeneralEmployee employee);
    public String getGEmployeeInfo();
}
