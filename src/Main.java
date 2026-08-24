//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задача № 1
        short manAge = 42;
        boolean checkAge = manAge >= 18;

        if (checkAge) {
            System.out.println("Ваш возраст " + manAge + " старше 18 лет, вы совершеннолетний");
        } else {
            System.out.println("Ваш возраст " + manAge + " младше 18 лет, нужно немного подождать");
        }

        // Задача № 2
        int outTemp = -5;

        if (outTemp < 5) {
            System.out.println("На улице " + outTemp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + outTemp + " градусов, можно идти без шапки");
        }

        // Задача № 3
        int carSpeed = 99;

        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + ", то можно ездить спокойно");
        }

        // Задача № 4
        short getManAge = 1;

        if (getManAge >= 2 && getManAge <= 6) {
            System.out.println("Если возраст человека равен " + getManAge + ", то ему нужно ходить в детский сад");
        } else if (getManAge >= 7 && getManAge <= 17) {
            System.out.println("Если возраст человека равен " + getManAge + ", то ему нужно ходить в школу");
        } else if (getManAge >= 18 && getManAge <= 24) {
            System.out.println("Если возраст человека равен " + getManAge + ", то ему нужно ходить в университет");
        } else if (getManAge > 24) {
            System.out.println("Если возраст человека равен " + getManAge + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + getManAge + ", то ему нужно рано выходить из дома");
        }

        // Задача № 5
        byte childAge = 5;

        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождении взрослого");
        }

        // Задача № 6
        short allPlace = 102;
        short seatPlace = 60;
        int stayPlace = allPlace - seatPlace;
        int passengers = 300;

        if (passengers <= 102 && passengers != 0) {
            System.out.println("В поезде есть " + seatPlace + " сидячих мест и " + stayPlace + " стоячих мест");
        } else {
            System.out.println("В вагоне нет свободных мест");
        }

        // Задача № 7
        int one = -999;
        int two = 66;
        int three = 66;

        if (one == two && two == three) {
            System.out.println("Все числа одинаковы");
        } else if (one > two && one > three) {
            System.out.println("Самое большое число one = " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число two = " + two);
        } else if (three > one && three > two) {
            System.out.println("Самое большое число three = " + three);
        } else if ((one == two && one > three) || (two == three && two > one) || three == one && three > two) {
            System.out.println("Есть несколько максимальных чисел и они равны");
        } else {
            System.out.println("Не удалось сравнить числа");
        }
    }
}