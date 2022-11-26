import java.util.*;
public class TestGrade {
    public static void main(String[] args){
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
        Grade g= new Grade(grades);
        System.out.println(g.getGrades());
        System.out.println(g.getGrade(subject2));
        g.setGrade(subject1, 100);
        System.out.println(g.getGrades());
        


    }
}
