public class Admin extends Employee implements AdminHelp {

    private GeneralEmployee employee;

    Admin(String name, String dob,Sex sex, String addr, String email, String telNumber,  EType empltype, GeneralEmployee employee){
        super(name,dob,sex,addr,email,telNumber,empltype);
        this.employee=employee;
    }

    public void regStudent(Student std){

    }

    public void assignStudent(Student std){

    }

    public void modStdRec(Student std){

    }
    public void enterStdGrds(Student student){

    }
    public void removeRecords(Student lstOld_StdRecs){

    }
    public void enterAEmployeeInfo(){

    }
    public void getAEmployeeInfo(){

    }
    public void enterGEmployee(GeneralEmployee employee){

    }
    public String getGEmployeeInfo(){
        String st;
        st="Name:\t";
        st+=employee.getName()+"\n";
        st+="Date of Birth:\t";
        st+=employee.getDOB()+"\n";
        st+="Sex:\t";
        st+=employee.getSex()+"\n";
        st+="Address:\t";
        st+=employee.getAddr()+"\n";
        st+="Email:\t";
        st+=employee.getEmail()+"\n";
        st+="Telephone Number: \t";
        st+=employee.getTelNum()+"\n";
        st+="Type:\t";
        st+=employee.getType();
        return st;
    }
}
