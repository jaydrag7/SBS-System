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
        Student student1=new Student(name,DOB,sex,address,dName,dEmail,dTel,dislike,grds);

        System.out.println(student1.getName()+"\n");
        System.out.println(student1.getDislikes()+"\n");
        System.out.println(student1.getAddr()+"\n");
        System.out.println(student1.getDOB()+"\n");
        System.out.println(student1.getSex()+"\n");
        System.out.println(student1.getAcdRec());

        /**String newAddr="Ocho Rios Street 4";
        String dislike3="Orange Juice";
        student1.setAddr(newAddr);
        student1.setDislike(dislike3);
        System.out.println(student1.getAddr());
        System.out.println(student1.getDislikes());*/
        

    }
}
