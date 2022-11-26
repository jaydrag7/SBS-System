public class Employee extends Person {
    private EType type;

    public Employee(String name, String dob, Sex sex, String addr, String email, String telNum,EType type){
        super(name,dob,sex,addr,email,telNum);
        this.type=type;
    }

    public EType getType(){
        return type;
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
}
