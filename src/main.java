import java.util.Scanner;
public class main {
    public static boolean onlyLetters(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {


        String name;
        String name2 = "";
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

        System.out.println("Do you have second name? [y/n]");
        y_n = myObj.nextLine();

        anger = 0;

        while((y_n.length()) != 1 && (!y_n.equals("y")) && (!y_n.equals("n")))
        {
            if(anger == 0)
            {
                System.out.println("Please enter an 'y' or 'n' ");
                y_n = myObj.nextLine();
            }
            else if(anger == 1)
            {
                System.out.println("I am asking you to enter an 'y' or 'n' ");
                y_n = myObj.nextLine();
            }
            else if(anger == 2)
            {
                System.out.println("Im not joking, enter an 'y' or 'n' ");
                y_n = myObj.nextLine();
            }
            else if(anger == 3)
            {
                System.out.println("For the last time Im asking you to enter an 'y' or 'n' ");
                y_n = myObj.nextLine();
            }
            else if(anger == 4)
            {
                System.out.println("Charlie has left the chat...");
                System.exit(0);
            }

            anger++;
        }

        anger = 0;
        if(y_n.equals("y"))
        {
            System.out.println("What is your second name?");
            name2 = myObj.nextLine();

            while(!onlyLetters(name2))
            {
                if(anger == 0)
                {
                    System.out.println("Please enter a proper second name ");
                    name2 = myObj.nextLine();
                }
                else if(anger == 1)
                {
                    System.out.println("I am asking you to enter a second proper name ");
                    name2 = myObj.nextLine();
                }
                else if(anger == 2)
                {
                    System.out.println("Im not joking, enter a proper second name ");
                    name2 = myObj.nextLine();
                }
                else if(anger == 3)
                {
                    System.out.println("For the last time Im asking you to enter a proper second name ");
                    name2 = myObj.nextLine();
                }
                else if(anger == 4)
                {
                    System.out.println("Charlie has left the chat...");
                    System.exit(0);
                }
                anger++;
            }


        }
        name = name + " " + name2;

        System.out.println("And what is your surname?");
        surname = myObj.nextLine();
        anger = 0;
        while(!onlyLetters(surname))
        {
            if(anger == 0)
            {
                System.out.println("Please enter a proper surname");
                surname = myObj.nextLine();
            }
            else if(anger == 1)
            {
                System.out.println("I am asking you to enter a proper surname ");
                surname = myObj.nextLine();
            }
            else if(anger == 2)
            {
                System.out.println("Im not joking, enter a proper ssurname");
                surname = myObj.nextLine();
            }
            else if(anger == 3)
            {
                System.out.println("For the last time Im asking you to enter a proper surname");
                surname = myObj.nextLine();
            }
            else if(anger == 4)
            {
                System.out.println("Charlie has left the chat...");
                System.exit(0);
            }
            anger++;
        }
        System.out.println(name + surname);
    }
}
