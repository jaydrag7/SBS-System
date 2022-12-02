import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
public class Student extends Person {

    private ArrayList<String> dislikes= new ArrayList<String>();
    private Set<String> subjects= new HashSet<String>();
    private Collection<Integer> grades= new HashSet<Integer>();
    private String d_name;
    private String st;
    private Grade gradebook;
    private String[] subject_set;
    private Integer[] grd_set;
    private Parent parent;
    private Parent parent2;

    public Student(String name,String dob, Sex sex,String addr,String d_name,String email,
    String telNumber,ArrayList<String> dislikes, Grade grades,String pname, String pdob, 
    Sex psex, String p_addr, String p_email, String ptelNum,String p_emgContact,
    String p_occupation,String p2name, String p2dob, 
    Sex p2sex, String p2_addr, String p2_email, String p2telNum,String p2_emgContact
    ,String p2_occupation){
        super(name,dob,sex,addr,email,telNumber);
        this.d_name=d_name;
        this.dislikes=dislikes;
        this.gradebook=grades;
        this.parent=new Parent(pname,pdob,psex,p_addr,p_email,ptelNum,p_emgContact,p_occupation);
        this.parent2=new Parent(p2name,p2dob,p2sex,p2_addr,p2_email,p2telNum,p2_emgContact,p2_occupation);
    }

    public String getpName(){
        return parent.getName();
    }

    public String getpDOB(){
        return parent.getDOB();
    }

    public Sex getpSex(){
        return parent.getSex();
    }

    public String getpAddr(){
        return parent.getAddr();
    }

    public void setpAddr(String newaddress){
        parent.setAddr(newaddress);
    }

    public String getpEmail(){
        return parent.getEmail();
    }

    public void setpEmail(String newemail){
        parent.setEmail(newemail);
    }

    public String getpNumber(){
        return parent.getTelNum();
    }

    public void setpNumber(String newtelNum){
        parent.setTelNum(newtelNum);
    }

    public String getpEmgContact(){
        return parent.getEmgcon();
    }

    public void setpEmgContact(String newContact){
        parent.setEmgcon(newContact);
    }

    public String getpOccupation(){
        return parent.getOccupation();
    }

    public void setpOccupation(String addr){
        parent.setOccupation(addr);
    }

    public String getp2Name(){
        return parent2.getName();
    }

    public String getp2DOB(){
        return parent2.getDOB();
    }

    public Sex getp2Sex(){
        return parent2.getSex();
    }

    public String getp2Addr(){
        return parent2.getAddr();
    }

    public void setp2Addr(String newaddress){
        parent2.setAddr(newaddress);
    }

    public String getp2Email(){
        return parent2.getEmail();
    }

    public void setp2Email(String newemail){
        parent2.setEmail(newemail);
    }

    public String getp2Number(){
        return parent2.getTelNum();
    }

    public void setp2Number(String newtelNum){
        parent2.setTelNum(newtelNum);
    }

    public String getp2EmgContact(){
        return parent2.getEmgcon();
    }

    public void setp2EmgContact(String newContact){
        parent2.setEmgcon(newContact);
    }

    public String getp2Occupation(){
        return parent2.getOccupation();
    }

    public void setp2Occupation(String addr){
        parent2.setOccupation(addr);
    }

    public String getDName(){
        return d_name;
    }

    public String getDislikes(){
        st="DISLIKES:\n";
        for(String n: dislikes){
            st+= n+"\n";
        }
        return st;
    }
    public String getAcdRec(){
        String st;
        subjects=gradebook.getGrades().keySet();
        grades=gradebook.getGrades().values();
        subject_set = subjects.toArray(new String[subjects.size()]);
        grd_set = grades.toArray(new Integer[grades.size()]);
        st="ACADEMIC RECORD:"+"\n";
        st+=subject_set[0]+": "+grd_set[0]+"\n";
        st+=subject_set[1]+": "+grd_set[1]+"\n";
        st+=subject_set[2]+": "+grd_set[2]+"\n";
        return st;
    }

    public void setDislike(String dislike){
        this.dislikes.add(dislike);
    }

    public String getName(){
        return name;
    }

    public String getDOB(){
        return dob;
    }

    public Sex getSex(){
        return sex;
    }

    public String getAddr(){
        return address;
    }

    public void setAddr(String newAddr){
        this.address=newAddr;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String new_Email){
        this.email=new_Email;
    }

    public String getTelNum(){
        return telNum;
    }

    public void setTelNum(String Tel_num){
        this.telNum=Tel_num;
    }

    public String getDoctorName(){
        return d_name;
    }
}
