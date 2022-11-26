public class Grade{

    // variables
    private int grade;
    private String subject;



    public Grade(String subject,int grade){
        this.subject=subject;
        this.grade=grade;
    }


    
    public String getSubject(){
        return this.subject;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int mark){
        grade=mark;
    }

}