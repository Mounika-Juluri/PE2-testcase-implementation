import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ListFolderFiles {

    public static void main(String[] args){

        File file = new File("../mounika-pe2/PE2/src/main/java/");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());

            try{


                if (f.isFile() && f.getName().endsWith(".txt")) {
                    Scanner sc = new Scanner(f);

                    while (sc.hasNextLine())
                        System.out.println(sc.nextLine());
                }
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();

            }
        }
    }
}