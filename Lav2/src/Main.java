import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*3. Написать регулярное выражение, определяющее является ли заданная строка
правиль-ным MAC-адресом. – пример правильных выражений: aE:dC:cA:56:76:54.
– пример неправильных выражений: 01:23:45:67:89:Az. */
public class Main {

    public static void main(String[] args) {
// Ввод, мас адрес не введен

        Pattern p1 = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}"); /*регулярное выражение*/
        System.out.print("Введите Мас адрес ");
        Scanner n = new Scanner(System.in);// создаём объект класса Scanner
        String str = n.next(); //считывает целое число с потока ввода и сохраняем в переменную
        str = "";
        Matcher m1 = p1.matcher(str); // возвращает true, если шаблон соответствует всей строке, иначе false.
        if (str.length() == 0)
        {
            System.out.println("Введена пустая строка");
        }
        else
        {
            boolean b = m1.matches();
            String m =  b ? "Введен  правильный MAC  адрес: " + str : "Введен не правильный MAC  адрес: " + str;
            System.out.println(m);
        }
        /*re+ Одно или более совпадений предыдущего выражения.
          re{n} Соответствует ровно N Количество вхождений предшествующего выражения.
          (?: re) Группы регулярных выражений, не помнящая найденный текст.
          [...] Соответствует любой одиночный символ в скобках
        * */

    }
}
