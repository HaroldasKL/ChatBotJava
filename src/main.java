import java.util.Scanner;
import java.time.*;
import java.util.Random;

public class main {
    public static boolean onlyLetters(String name)
    {
        return name.matches("[a-zA-Z]+");
    }

    public static void guessingGame()
    {
        int guess = -1;
        int computerGuess = -1;

        boolean didIGuess = false;

        int startNumber = 0;
        int endNumber = 100;

        Random rand = new Random();
        int random = rand.nextInt(101);

        Scanner myObj = new Scanner(System.in);
        //System.out.println("Answer: " + random); //If you want to find out the answer
        while(guess != random || computerGuess != random)
        {
            if(!didIGuess)
            {
                System.out.println("Your guess from the interval [" + startNumber + "," + endNumber + "]?");
                guess = myObj.nextInt();

                if(guess >= startNumber && guess <= endNumber)
                {
                    didIGuess = true;
                    if(guess > random)
                    {
                        System.out.println("Number is lower");
                        System.out.println("-----------------");
                        endNumber = guess - 1;
                    }
                    else if(guess < random)
                    {
                        System.out.println("Number is higher");
                        System.out.println("-----------------");
                        startNumber = guess + 1;
                    }
                    else
                    {
                        System.out.println("You won! But this game is based on luck... \n");
                        break;
                    }
                }
                else
                {
                    System.out.println("Enter a number within the interval");
                }
            }
            else
            {
                didIGuess = false;
                computerGuess = startNumber + rand.nextInt((endNumber - startNumber + 1));
                System.out.println("Charlie's guess :(from the interval)[" + startNumber + "," + endNumber + "]: " + computerGuess);
                if(computerGuess > random)
                {
                    System.out.println("Number is lower");
                    System.out.println("-----------------");
                    endNumber = computerGuess - 1;
                }
                else if(computerGuess < random)
                {
                    System.out.println("Number is higher");
                    System.out.println("-----------------");
                    startNumber = computerGuess + 1;
                }
                else
                {
                    System.out.println("I won! You'r a loser \n");
                    break;
                }
            }
        }
    }

    public static void primeNumbersSequence() //maybe include fibonacci?
    {
        int answer = 1;
        Scanner myObj = new Scanner(System.in);


        System.out.println("7  8 11 18  31  50 ? \n" +
                "What number should be next in the sequence? (Write 0 if you want to give up)");
        String input = myObj.nextLine();

        while(answer != 79)
        {
            try
            {
                answer = Integer.parseInt(input);

                if(answer != 79 && answer != 0)
                {
                    System.out.println("Wrong answer");
                }
                else if(answer == 79)
                {
                    System.out.println("Congratulations, you managed to understand that the sequence is based on prime numbers!");
                    return;
                }
                else if(answer == 0)
                {
                    return;
                }

            }
            catch (Exception e)
            {
                System.out.println("Wrong answer");
            }
            input = myObj.nextLine();
        }

    }

    public static void firstSequence()
    {
        int answer = 1;
        Scanner myObj = new Scanner(System.in);


        System.out.println("9 11  7 15  -1  31  ? \n" +
                "What number should be next in the sequence? (Write 0 if you want to give up)");
        String input = myObj.nextLine();

        while(answer != -33)
        {
            try
            {
                answer = Integer.parseInt(input);

                if(answer != -33 && answer != 0)
                {
                    System.out.println("Wrong answer");
                }
                else if(answer == -33)
                {
                    System.out.println("Congratulations!");
                    return;
                }
                else if(answer == 0)
                {
                    return;
                }

            }
            catch (Exception e)
            {
                System.out.println("Wrong answer");
            }
            input = myObj.nextLine();
        }
    }

    public static void thirdSequence()
    {
        int answer = 1;
        Scanner myObj = new Scanner(System.in);


        System.out.println("37 44 36 42 38 46 37 ? \n" +
                "What number should be next in the sequence? (Write 0 if you want to give up)");
        String input = myObj.nextLine();

        while(answer != 38)
        {
            try
            {
                answer = Integer.parseInt(input);

                if(answer != 38 && answer != 0)
                {
                    System.out.println("Wrong answer");
                }
                else if(answer == 38)
                {
                    System.out.println("Congratulations!");
                    return;
                }
                else if(answer == 0)
                {
                    return;
                }

            }
            catch (Exception e)
            {
                System.out.println("Wrong answer");
            }
            input = myObj.nextLine();
        }
    }

    public static void fourthSequence()
    {
        int answer = 1;
        Scanner myObj = new Scanner(System.in);


        System.out.println("1 2 5 11 21 36 57 85 ? \n" +
                "What number should be next in the sequence? (Write 0 if you want to give up)");
        String input = myObj.nextLine();

        while(answer != 121)
        {
            try
            {
                answer = Integer.parseInt(input);

                if(answer != 121 && answer != 0)
                {
                    System.out.println("Wrong answer");
                }
                else if(answer == 121)
                {
                    System.out.println("Congratulations!");
                    return;
                }
                else if(answer == 0)
                {
                    return;
                }

            }
            catch (Exception e)
            {
                System.out.println("Wrong answer");
            }
            input = myObj.nextLine();
        }
    }

    public static void fifthSequence()
    {
        int answer = 1;
        Scanner myObj = new Scanner(System.in);


        System.out.println("9 14  25  42  65 ? \n" +
                "What number should be next in the sequence? (Write 0 if you want to give up)");
        String input = myObj.nextLine();

        while(answer != 94)
        {
            try
            {
                answer = Integer.parseInt(input);

                if(answer != 94 && answer != 0)
                {
                    System.out.println("Wrong answer");
                }
                else if(answer == 94)
                {
                    System.out.println("Congratulations!");
                    return;
                }
                else if(answer == 0)
                {
                    return;
                }

            }
            catch (Exception e)
            {
                System.out.println("Wrong answer");
            }
            input = myObj.nextLine();
        }
    }

    public static void randomSequence() {
        Random rand = new Random();
        int random = 1 + rand.nextInt(5);

        switch(random)
        {
            case 1:
                firstSequence();
                break;
            case 2:
                primeNumbersSequence();
                break;
            case 3:
                thirdSequence();
                break;
            case 4:
                fourthSequence();
                break;
            case 5:
                fifthSequence();
                break;
        }
    }

    public static void main(String[] args) {


       // System.exit(0);
        LocalTime time = LocalTime.now();
        int localHour;
        localHour = time.getHour();
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
            name2 = name2 + " ";


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


        if(localHour >= 6 && localHour <= 10)
        {
            System.out.println("Good morning " + name + surname);
        }
        else if (localHour > 10 && localHour < 18)
        {
            System.out.println("Good afternoon " + name + surname);
        }
        else
        {
            System.out.println("Good evening " + name + surname);
        }

        while(op != 0)
        {
            System.out.println("What would you like to do? \n" +
                            "1 - Play a number guessing game against me \n" +
                            "2 - Find the next number in a sequence \n" +
                            "0 - Exit \n");
            op = myObj.nextInt();

            if(op == 1)
            {
                guessingGame();
            }
            else if(op == 2)
            {
                randomSequence();
            }
            else if(op == 0)
            {
                myObj.close();
                System.out.println("Goodbye!");
            }
        }
    }
}
