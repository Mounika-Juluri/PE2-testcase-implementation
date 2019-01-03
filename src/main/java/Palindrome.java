public class Palindrome {
    public String reverse (String str){
        String temp="";
        for (int i=(str.length())-1;i>=0;i--){
            temp=temp+str.charAt(i);

        }

        if (temp.equals(str)){
            return ("Palindrome");
        }else {


            return ("not palindrome");
        }
    }
}
