import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        int i = 0;
        int number = randomNumber();
        System.out.println("Введи число");
        while (i <= 2)
        {
            int guessNumber = readConsole();
            int diff = number - guessNumber;
            if (i == 2)
            {
                System.out.println("Проиграл :(");
                break;
            }
            if (diff == 0)
            {
                System.out.println("Молодец, угадал!");
                break;
            }
            if (diff < 0)
            {
                System.out.println("Слишком много!");
            }
            else if (diff > 0)
            {
                System.out.println("Бери больше!");
            }
            i++;
        }
        System.out.println("Повторить игру еще раз? (1 – повторить, 0 – нет)");

    }
    static int randomNumber()
    {
        Random rand = new Random();
        int number1 = rand.nextInt(10);
        return number1;
    }
    static int readConsole()
    {
        Scanner sc = new Scanner(System.in);
            do
            {
                if (sc.hasNextInt())
                {
                    return sc.nextInt();
                }
                sc.nextLine();
            }
            while (true);
    }



    }

