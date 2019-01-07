public class MemberVariable {
    Member mem=new Member();
    public String memberName(String str){
        mem.setName(str);
        return mem.getName();
    }
    public int memberAge(int ag){
        mem.setAge(ag);
        return mem.getAge();
    }
    public String memberSalary(String sal){
        mem.setSal(sal);
        return mem.getSal();
    }
}
