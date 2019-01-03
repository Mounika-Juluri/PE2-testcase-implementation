public class IntegerFactorial {
    public String getFactorial(int num){
        String str="";
        int fact=1;
        for (int i=1;i<=num;i++){

            for(int j=i;j>0;j--){
                fact=fact*j;
            }
            str=str+"The factorial of "+i+" is "+fact;
            fact=1;

        }
        return str;
    }
}
