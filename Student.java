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

    public Student(String name,String dob, Sex sex,String addr,String d_name,String email,String telNumber,ArrayList<String> dislikes, Grade grades){
        super(name,dob,sex,addr,email,telNumber);
        this.d_name=d_name;
        this.dislikes=dislikes;
        this.gradebook=grades;
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
