import java.util.ArrayList;
public class TestStudent {
    public static void main(String[] args){
        ArrayList<String> dislike =new ArrayList<String>();;
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
        Student student1=new Student(name,DOB,sex,address,dName,dEmail,dTel,dislike);

        System.out.println(student1.getName());
        System.out.println(student1.getDislikes());
        System.out.println(student1.getAddr());
        System.out.println(student1.getDOB());
        System.out.println(student1.getSex()+"\n");
        String newAddr="Ocho Rios Street 4";
        String dislike3="Orange Juice";
        student1.setAddr(newAddr);
        student1.setDislike(dislike3);
        System.out.println(student1.getAddr());
        System.out.println(student1.getDislikes());
        

    }
}
