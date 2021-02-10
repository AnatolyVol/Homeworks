public class Main {
//Задание 1
    public static void main(String[] args) {
//Задание 2
        byte aaaa = -127;
        short bbbb = 32654;
        int cccc = -7876553;
        long dddd = 654659849;

        float eeee = 4.55f;
        double ffff = -234.12;

        char gggg = '#';

        boolean hhhh = true;
        boolean iiii = false;
//Задание 3
        float a = 1.1f;
        float b = 2.2f;
        float c = 3.3f;
        float d = 4.4f;
        System.out.println(a * (b + (c / d)));

//Задание 4
        int aa = 7;
        int bb = 20;
        int cc = aa + bb;
        if (10 <= cc && cc <= 20) {
            System.out.println(true);
        } else if (cc < 10 || cc > 20) {
            System.out.println(false);
        }
//Задание 5
        int dd = 15;
        if (dd >= 0) {
            System.out.println("Положительное");
        } else if (dd < 0) {
            System.out.println("Отрицательное");
        }
//Задание 6
        int ff = -3;
        if (ff > 0) {
            System.out.println(false);
        } else if (ff < 0) {
            System.out.println(true);
        }
//Задание 7
        String mm = "AnatolyVol";
        System.out.println("Привет, " + mm + "!");
//Задание 8
        int year = 2504;
        double x = year % 4;
        double y = year % 100;
        double z = year % 400;
        if (z <= 0 && y <= 0 || x <= 0 && z <= 0 )
        {
            System.out.println("Високосный");
        }
        else if (y <= 0 )
        {
            System.out.println("Невисокосный");
        }
        else if ( x > 0)
        {
            System.out.println("Невисокосный");
        }
        else if ( x <= 0)
        {
            System.out.println("Високосный");
        }
    }
}