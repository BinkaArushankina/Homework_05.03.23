import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        System.out.println(returnString("textFile.txt"));  // aaa bbbb cc

        System.out.println(arithmeticMean("notEmptyTextFile.txt"));  // 3

    }
    //Homework Задача 1
    //Написать метод, читающий текстовый файл и возвращающий строку,
    //состояшую из всех прочитанных строчек.
    //Пример: В файле имеется
    // aaa
    // bbbb
    // cc
    //Метод вернет aaa bbbb cc
    public static String returnString(String fileText)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileText));
        String line1= br.readLine();
        String line2= br.readLine();
        String line3= br.readLine();

        return line1+" "+line2+" "+line3;
    }
    //Задача 2
    //Есть не пустой текстовый файл такого вида:
    //1
    //2
    //3
    //4
    //5
    //Написать метод, возвращаюший среднее арифметическое всех этих чисел.
    public static int arithmeticMean(String textFile)throws IOException{
        BufferedReader br= new BufferedReader(new FileReader(textFile));
        int one = Integer.parseInt(br.readLine());
        int two = Integer.parseInt(br.readLine());
        int three = Integer.parseInt(br.readLine());
        int four = Integer.parseInt(br.readLine());
        int five = Integer.parseInt(br.readLine());
        int sum = one+two+three+four+five;

        return sum/5;
    }
}