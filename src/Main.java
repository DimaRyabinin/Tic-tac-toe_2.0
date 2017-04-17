import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int key_1; // Переменная для обозначения очерёдности хода.
        boolean key_2 = true; // Переменная для возвращения значения методом "player" и "computer".
        boolean key_3 = true; // Третья ключевая переменная.
        int a = 0; // Переменная для значения на оси абцисс для метода "player".
        int y = 0; // Переменная для значения на оси ординат для метода "player".
        String line; // Переменная для ввода с клавиатуры.
        int figure; // Переменная для определение фигуры.
        Player gamer_1 = new Player();
        Computer gamer_2 = new Computer();
        String[] numbers1 = new String[9];
        for (int x = 0; x < 9; x++) {
            numbers1[x] = "-";
        }
        System.out.println("Стандартная игра 'Крестики - нолики'.");
        System.out.println("-|-|-");
        System.out.println("-|-|-");
        System.out.println("-|-|-");
        System.out.println("Чем вы хотите играть?");
        line = reader.readLine();
        if (line.equals("X") || line.equals("x") || line.equals("Крестиками") || line.equals("крестиками")) {
            figure = 1;
        }
        else figure = 0;
        System.out.println("Каким по очерёдности вы хотите ходить?");
        line = reader.readLine(); // Обозначаем каким хотим ходить.
        if (line.equals("Первым") || line.equals("первым") || line.equals("1")) { // Задаём значение первой переменной.
            key_1 = 0;
        }
        else key_1 = 1;

        if (key_1 == 0) { // Если key_1 == 0, то первым ходит человек.
            while (key_2 == true || key_3 == true) {
                key_2 = gamer_1.player(numbers1, key_2, a, y, figure);
                key_3 = gamer_2.computer(numbers1, key_3, a, y, figure);
                if (key_2 == false || key_3 == false) break;
            }
        }

        if (key_1 == 1) { // Если key_1 == 1, то первый ходит компьютер.
            while (key_2 == true || key_3 == true) {
                gamer_2.computer(numbers1, key_3, a, y, figure);
                gamer_1.player(numbers1, key_2, a, y, figure);
                if (key_2 == false || key_3 == false) break;
            }
        }
    }
}

class Player {
    public boolean player(String[] arg_1, boolean arg_2, int axis_of_abscissae, int axis_of_ordinates, int figure_1) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line_2;
        if (figure_1 == 1) {
            line_2 = "X";
        }
        else line_2 = "O";


        System.out.println("Введите координату на оси абцисс.");
        axis_of_abscissae = Integer.valueOf((reader.readLine()));

        System.out.println("Введите координату на оси ординат.");
        axis_of_ordinates = Integer.valueOf((reader.readLine()));
        System.out.println("Поле:");

        if (arg_1[1].equals("-")) {
            if (axis_of_abscissae == 2 && axis_of_ordinates == 3) {
                arg_1[1] = line_2;
                System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
            }
        }
        if (arg_1[6].equals("-")) {
            if (axis_of_abscissae == 1 && axis_of_ordinates == 1) {
                arg_1[6] = line_2;
                System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
            }
        }
        if (arg_1[3].equals("-")) {
            if (axis_of_abscissae == 1 && axis_of_ordinates == 2) {
                arg_1[3] = line_2;
                System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
            }
        }
        if (arg_1[0].equals("-")) {
            if (axis_of_abscissae == 1 && axis_of_ordinates == 3) {
                arg_1[0] = line_2;
                System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
            }
        }
        if (arg_1[7].equals("-")) {
            if (axis_of_abscissae == 2 && axis_of_ordinates == 1) {
                arg_1[7] = line_2;
                System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
            }
        }
        if (arg_1[8].equals("-")) {
            if (axis_of_abscissae == 3 && axis_of_ordinates == 1) {
                arg_1[8] = line_2;
                System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
            }
        }
        if (arg_1[4].equals("-")) {
            if (axis_of_abscissae == 2 && axis_of_ordinates == 2) {
                arg_1[4] = line_2;
                System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
            }
        }
        if (arg_1[5].equals("-")) {
            if (axis_of_abscissae == 3 && axis_of_ordinates == 2) {
                arg_1[5] = line_2;
                System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
            }
        }
        if (arg_1[2].equals("-")) {
            if (axis_of_abscissae == 3 && axis_of_ordinates == 3) {
                arg_1[2] = line_2;
                System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
            }
            if ((arg_1[6].equals("X") && arg_1[3].equals("X") && arg_1[0].equals("X")) ||
                    (arg_1[7].equals("X") && arg_1[4].equals("X") && arg_1[1].equals("X")) ||
                    (arg_1[8].equals("X") && arg_1[5].equals("X") && arg_1[2].equals("X")) ||
                    (arg_1[0].equals("X") && arg_1[1].equals("X") && arg_1[2].equals("X")) ||
                    (arg_1[3].equals("X") && arg_1[4].equals("X") && arg_1[5].equals("X")) ||
                    (arg_1[6].equals("X") && arg_1[7].equals("X") && arg_1[8].equals("X")) ||
                    (arg_1[0].equals("X") && arg_1[4].equals("X") && arg_1[8].equals("X")) ||
                    (arg_1[6].equals("X") && arg_1[4].equals("X") && arg_1[2].equals("X"))) {
                System.out.println("Победил игрок, играющий крестиками.");
                arg_2 = false;
            }

        }
        return arg_2;
    }
}

class Computer {
    public boolean computer(String[] arg_1, boolean arg_2, int axis_of_abscissae, int axis_of_ordinates, int figure_2) throws IOException {
        int obc = 0; // Значение по оси абцисс.
        int ord = 0; // Значение по оси ординат.
        boolean key_4 = true; // Переменная для работы условия.
        boolean key_5 = true;
        boolean perv_hod = true; // Переменная для работы условия.
        String line_4;
        if (figure_2 == 1) {
            line_4 = "O";
        }
        else line_4 = "X";
        while (perv_hod == true) {
            while (key_4 == true) { // Задаём значение переменной "obc".
                obc = (int) ((Math.random() * 10) / 3);
                if (obc != 0) break;
            }
            while (key_4 == true) { // Задаём значение переменной "ord".
                ord = (int) ((Math.random() * 10) / 3);
                if (ord != 0) break;
            }
            System.out.println("Поле:");
            // На основании значений переменный "obc" и "ord" заносим значение в массив.
            if (arg_1[1].equals("-")) { // Если ячейка не занята, то проверяем значения переменных "obc" и "ord". Если они удовлетворяют условию, вносим значение.
                if (obc == 2 && ord == 3) {
                    arg_1[1] = line_4;
                    System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                    System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                    System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
                }
            }
            if (arg_1[6].equals("-")) {
                if (obc == 1 && ord == 1) {
                    arg_1[6] = line_4;
                    System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                    System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                    System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
                }
            }
            if (arg_1[3].equals("-")) {
                if (obc == 1 && ord == 2) {
                    arg_1[3] = line_4;
                    System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                    System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                    System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
                }
            }
            if (arg_1[0].equals("-")) {
                if (obc == 1 && ord == 3) {
                    arg_1[0] = line_4;
                    System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                    System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                    System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
                }
            }
            if (arg_1[7].equals("-")) {
                if (obc == 2 && ord == 1) {
                    arg_1[7] = line_4;
                    System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                    System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                    System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
                }
            }
            if (arg_1[8].equals("-")) {
                if (obc == 3 && ord == 1) {
                    arg_1[8] = line_4;
                    System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                    System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                    System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
                }
            }
            if (arg_1[4].equals("-")) {
                if (obc == 2 && ord == 2) {
                    arg_1[4] = line_4;
                    System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                    System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                    System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
                }
            }
            if (arg_1[5].equals("-")) {
                if (obc == 3 && ord == 2) {
                    arg_1[5] = line_4;
                    System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                    System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                    System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
                }
            }
            if (arg_1[2].equals("-")) {
                if (obc == 3 && ord == 3) {
                    arg_1[2] = line_4;
                    System.out.println(arg_1[0] + "|" + arg_1[1] + "|" + arg_1[2]);
                    System.out.println(arg_1[3] + "|" + arg_1[4] + "|" + arg_1[5]);
                    System.out.println(arg_1[6] + "|" + arg_1[7] + "|" + arg_1[8]);
                }
            }

            break;
        }
        return arg_2;
    }
}