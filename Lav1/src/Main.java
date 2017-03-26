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

            if (s.length() < minimun) {
                minimun = s.length();// длина элемента списка

            }
            if (s.length() > maximum) {
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
        Scanner n = new Scanner(System.in);// создаём объект класса Scanner
        int number = n.nextInt(); //считывает целое число с потока ввода и сохраняем в переменную
        Scanner in = new Scanner(System.in);// создаём объект класса Scanner
        List<String> strings = new ArrayList<String>(); //создает пустой список из строк
        Str stt = new Str();

        for(int i=1;i <= number; i++){
            System.out.println("Строка номер "+(i));

            strings.add(stt.get(in.next()));// добавление в список строк

        }
        av = stt.average(strings);// функция по нхождению среднеего числа строк

        System.out.println("Вывод слов длина, которых меньше средней, средняя длина " + av);

        for (String s: strings) {
            if (s.length() < av)
            {
                f = true;
                System.out.println("Строка "+s+" Длина "+ s.length()); // Вывод
            }


        }
        System.out.println();
        if (f == false){
            System.out.println("Таких строк нет");
        }


    }

}
