import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inputed=enterText();
        String[] array=inputed.split("\n");

        String result="";
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].length()<4)result=result+  array[i]+"\n";
        }

        String[] resultArray=result.split("\n");

        System.out.println("Массив результирующий\n "+result);

    }

   static String enterText(){

        String result="";
        String currentString="";

        System.out.println("Введите чтото. Для окончания ввода введите \\q");

        while (true){
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();

            if (s.equals("\\q"))break;

            if (s.length()==0){
                System.out.println("Длина 0, попробуйте еще");
                continue;
            }
            result=result+"\n"+s;
        }



        return result;
    }
}