import java.util.ArrayList;
import java.util.HashMap;
public class TestStudent {
    public static void main(String[] args){
        ArrayList<String> dislike =new ArrayList<String>();
        HashMap<String, Integer> grades= new HashMap<>();
        String subject1="Math";
        String subject2="Spanish";
        String subject3="English";

        int grd1=90;
        int grd2=80;
        int grd3=70;
        grades.put(subject1,grd1);
        grades.put(subject2,grd2);
        grades.put(subject3,grd3);
        Grade grds= new Grade(grades);

        String name="John Brown";
        String DOB="01/11/2020";
        Sex sex=Sex.MALE;
        String address= "Kingston 5";
        String dName="Dr. Young";
        String dEmail="jonmarcyoung@gmail.com";
        String dTel= "876 773 5614";
        String dislike1="Porridge";
        String dislike2="Chicken Liver";
        dislike.add(dislike1);
        dislike.add(dislike2);

        String pname="Jonothan Brown";
        String pdob="26/08/1976";
        Sex psex=Sex.MALE;
        String paddr="Kingston 5";
        String pemail="jonothan.brown@outlook.com";
        String ptelNum="876 999 7234";
        String pemg="876 238 8927";
        String poccupation="Plumber";

        String p2name="Jane Brown";
        String p2dob="17/11/1973";
        Sex p2sex=Sex.FEMALE;
        String p2addr="Kingston 5";
        String p2email="jane.brown@yahoo.com";
        String p2telNum="876 928 1822";
        String p2emg="876 873 9873";
        String p2occupation="Teacher";

        
        Student student1=new Student(name,DOB,sex,address,dName,dEmail,dTel,dislike,grds
        ,pname,pdob,psex,paddr,pemail,ptelNum,pemg,poccupation,
        p2name,p2dob,p2sex,p2addr,p2email,p2telNum,p2emg,p2occupation);

        System.out.println(student1.getName()+"\n");
        System.out.println(student1.getDislikes()+"\n");
        System.out.println(student1.getAddr()+"\n");
        System.out.println(student1.getDOB()+"\n");
        System.out.println(student1.getSex()+"\n");
        System.out.println(student1.getAcdRec());
        System.out.println("PARENT INFO:"+"\n");
        System.out.println(student1.getpName()+"\n");
        System.out.println(student1.getpOccupation()+"\n");
        System.out.println(student1.getp2Name()+"\n");
        System.out.println(student1.getp2Occupation());
        

        /**String newAddr="Ocho Rios Street 4";
        String dislike3="Orange Juice";
        student1.setAddr(newAddr);
        student1.setDislike(dislike3);
        System.out.println(student1.getAddr());
        System.out.println(student1.getDislikes());*/
        

    }
}
