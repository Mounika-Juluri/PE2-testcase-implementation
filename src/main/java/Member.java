public class Member {
    private String memName;
    private int memAge;
    private String memSalary;
    public void setName(String name){
        memName=name;
    }
    public void setAge(int age){
        memAge=age;
    }
    public void setSal(String salary){
        memSalary=salary;
    }
    public String getName(){
        return memName;
    }
    public int getAge(){
        return memAge;
    }
    public String getSal(){

        return memSalary;
    }

}
