//package sbs_app;
public abstract class Person{
    protected String name;
    protected String dob;
    protected Sex sex;
    protected String address;
    protected String email;
    protected String telNum;

    public Person(String name, String dob, Sex sex, String addr, String email, String telNum){
        this.name=name;
        this.dob=dob;
        this.sex=sex;
        this.address=addr;
        this.email=email;
        this.telNum=telNum;
    }

    public abstract String getName();

    public abstract String getDOB();

    public abstract Sex getSex();

    public abstract String getAddr();

    public abstract void setAddr(String newAddr);

    public abstract String getEmail();

    public abstract void setEmail(String new_Email);

    public abstract String getTelNum();

    public abstract void setTelNum(String Tel_num);
}
