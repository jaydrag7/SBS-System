public class Parent extends Person {
    private String occupation;
    private String emgContact;

    public Parent(String name, String dob, Sex sex, String addr, String email, String telNum,String emgContact,String occupation){
        super(name,dob,sex,addr,email,telNum);
        this.emgContact=emgContact;
        this.occupation=occupation;
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

    public void setTelNum(String new_Telnum){
        this.telNum=new_Telnum;
    }

    public String getOccupation(){
        return occupation;
    }

    public void setOccupation(String new_Occupation){
        this.occupation=new_Occupation;
    }

    public String getEmgcon(){
        return emgContact;
    }

    public void setEmgcon(String new_Emgcon){
        this.emgContact=new_Emgcon;
    }
}
