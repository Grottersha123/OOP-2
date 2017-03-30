import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*Первая лабораторная */
/*Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше сред-ней, также их длины.*/

class Str { // класс в котором создается пустая строка
    private final String st;
    // Класс Меин
    Str()
    {
        st = "";
    }
    Str(String st)
    {
        this.st = st;
    }
    String get(String st)
    {
        return st;
    }
    public static int average(List<String> st) // Функция для определение самой большой и самой маленькой строки и нахождение среднего
    {
        int minimun = st.get(0).length();
        int maximum = st.get(0).length();
        int av = 0;// среднее значение

        for (String s : st) // прохождение списка через цикл
        {

            if (s.length() < minimun && s.length() <= 15 && !s.equalsIgnoreCase("empty")) {
                minimun = s.length();// длина элемента списка

            }
            if (s.length() > maximum && s.length() <= 15 ) {
                maximum = s.length();

            }

        }

        av = (minimun + maximum) / 2;// нахождение среднего
        return av;
    }
}

public class Main { // Класс Меин


    public static void main(String[] args) throws IOException {

        int av = 0;
        boolean f = false;

        System.out.print("Введите количество строк ");
        try {
            Scanner n = new Scanner(System.in);// создаём объект класса Scanner
            int number = n.nextInt(); //считывает целое число с потока ввода и сохраняем в переменную
            if (number > 15) {
                System.out.print("Введено больше n чем может быть");
                System.exit(0);
            }
            if (number < 1) {
                System.out.println("Введено число 0 или меньше 0");
            }
            Scanner in = new Scanner(System.in);// создаём объект класса Scanner
            List<String> strings = new ArrayList<String>(); //создает пустой список из строк
            Str stt = new Str();
            String[] a;
            String str1;
            System.out.println("Вводите по одной строке через enter");
            System.out.println("Если вводить все одной строкой, то по пробелу будут отделены строки");
            // System.out.println("Ытобы ввести пустую строку введите ");
            for (int i = 1; i <= number; i++) {
                System.out.println("Введите строку " + i);
                a = in.nextLine().split(" ");
                str1 = a[0];

                if (str1.equalsIgnoreCase("empty")) {
                    System.out.println("Данная строка является пустой и обрабатываться не будет");
                    continue;
                }
                if (a.length > 1) {
                    System.out.println("Введнная строка после пробела обрабатываться не будет");
                }
                if (str1.length() > 15) {
                    System.out.println("Данная ,больше 15 и обрабатываться не будет");
                    continue;
                }
                strings.add(stt.get(str1));// добавление в список строк

            }
            av = stt.average(strings);// функция по нхождению среднеего числа строк

            System.out.println("Вывод слов длина, которых меньше средней, средняя длина " + av);

            for (String s : strings) {
                if (s.length() < av) {
                    f = true;
                    System.out.println("Строка " + s + " Длина " + s.length()); // Вывод
                }


            }
            System.out.println();
            if (f == false) {
                System.out.println("Таких строк нет");
            }
        }
        catch (Exception e){
            System.out.println("Вы ввели недопустимый символ");
        }

    }
}
