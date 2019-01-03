public class MemberVariable {
    Member mem=new Member();
    public String memberName(String str){
        mem.Name=str;
        return mem.Name;
    }
    public int memberAge(int ag){
        mem.Age=ag;
        return mem.Age;
    }
    public String memberSalary(String sal){
        mem.Salary=sal;
        return mem.Salary;
    }
}
