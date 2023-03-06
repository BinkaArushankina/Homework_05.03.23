import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        File filename = new File("textFile.txt");
        System.out.println(returnString(filename));  // aaa bbbb cc

        System.out.println(countAverage("notEmptyTextFile.txt"));  // 3

    }
    //Homework Задача 1
    //Написать метод, читающий текстовый файл и возвращающий строку,
    //состояшую из всех прочитанных строчек.
    //Пример: В файле имеется
    // aaa
    // bbbb
    // cc
    //Метод вернет aaa bbbb cc
    public static String returnString(File fileText) {
        String s ="";
        try(BufferedReader br = new BufferedReader(new FileReader(fileText))) {
            String line;
            while ((line= br.readLine())!=null){
                s=s+" "+line;
            }
        }catch (IOException e){
            e.getMessage();
        }
        return s;
    }
    //Задача 2
    //Есть не пустой текстовый файл такого вида:
    //1
    //2
    //3
    //4
    //5
    //Написать метод, возвращаюший среднее арифметическое всех этих чисел.
    public static int countAverage(String textFile)throws IOException{

        int sum=0;
        int count=0;
        String nextInt;
        try (BufferedReader br= new BufferedReader(new FileReader(textFile))){
            while ((nextInt= br.readLine())!=null){
                sum=sum+Integer.parseInt(nextInt);//poschitali summu
                count++;                          //poschitali kolwo strok
            }
        }catch(IOException e){
            e.getMessage();
        }

        return sum/count;
    }
}