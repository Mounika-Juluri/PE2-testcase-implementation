public class PowerOfFour {
    public String reverse(int num){

        while (num/4 >0){
            if (num%4!=0){
                return "Not Power of 4";
            }
            num=num/4;

        }
        return "Power of 4";
    }
}
