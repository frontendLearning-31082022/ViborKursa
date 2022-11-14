import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inputed=enterText();
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