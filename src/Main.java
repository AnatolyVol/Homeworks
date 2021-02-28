public class Main {
    public static void main(String[] args)
    {
        Employee[] person = new Employee[5];
        person[0] = new Employee("Ivanov Ivan", "HR", "111@mail.ru", "89271111111", 50000, 35);
        person[1] = new Employee("Anatoly Vol", "QA engineer", "222@mail.ru", "89272222222", 80000, 24);
        person[2] = new Employee("Anton Gorodetski", "Programmer", "333@mail.ru", "89273333333", 150000, 45);
        person[3] = new Employee("Vin Diesel", "Programmer", "444@email.ru", "89274444444", 999999, 50);
        person[4] = new Employee("Margot Robbie", "HR", "555@mail.ru", "89275555555", 80000, 30);

        for ( int i = 0; i < person.length; i++)
        {
            if (person[i].IntAge() > 40 )
            {
                person[i].PersonInfo();
            }
        }
    }
}