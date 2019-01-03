import java.io.File;
import java.util.Scanner;



public class FreqencyCalculation {

    public static void main(String[] args) throws Exception
    {
        File file = new File("../mounika-pe2/PE2/FileDemo.txt");
        Scanner sc = new Scanner(file);
        String str="";
        int count=0;
        int wordCount=0;

        while (sc.hasNextLine()){
            //System.out.println(sc.nextLine());
            str=str+sc.nextLine();
        }

        String[] arrOfStr = str.split("\\s");
        for (String a : arrOfStr)
            count=count+1;
        int length=count;
        for (String a: arrOfStr){
            for (int i=0;i<length;i++){
                if (a.equals(arrOfStr[i])){
                    wordCount=wordCount+1;
                }
            }
            System.out.println(a+":"+wordCount);
            wordCount=0;
        }
    }

}
