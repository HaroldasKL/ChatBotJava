import java.util.Scanner;
public class main {
    public static boolean onlyLetters(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {


        String name;
        String name2;
        String surname;

        String y_n;
        int op = -1;

        System.out.println("Hello my name is Charlie\nWhat is your name?");
        Scanner myObj = new Scanner(System.in);
        name = myObj.nextLine();

        int anger = 0;


        while (!onlyLetters(name))
        {
            if(anger == 0)
            {
                System.out.println("Please enter a proper name ");
                name = myObj.nextLine();
            }
            else if(anger == 1)
            {
                System.out.println("I am asking you to enter a proper name");
                name = myObj.nextLine();
            }
            else if(anger == 2)
            {
                System.out.println("Im not joking, enter a proper name ");
                name = myObj.nextLine();
            }
            else if(anger == 3)
            {
                System.out.println("For the last time Im asking you to enter a proper name");
                name = myObj.nextLine();
            }
            else if(anger == 4)
            {
                System.out.println("Charlie has left the chat...");
                System.exit(0);
            }

            anger++;
        }

    }
}
