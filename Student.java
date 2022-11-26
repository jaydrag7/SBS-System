import java.util.ArrayList;
public class Student extends Person {

    private ArrayList<String> dislikes= new ArrayList<String>();
    private String d_name;
    private String st;

    public Student(String name,String dob, Sex sex,String addr,String d_name,String email,String telNumber,ArrayList<String> dislikes){
        super(name,dob,sex,addr,email,telNumber);
        this.d_name=d_name;
        this.dislikes=dislikes;
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
