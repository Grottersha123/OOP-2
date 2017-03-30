import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*3. Написать регулярное выражение, определяющее является ли заданная строка
правиль-ным MAC-адресом. – пример правильных выражений: aE:dC:cA:56:76:54.
– пример неправильных выражений: 01:23:45:67:89:Az. */

class Pat {
    Pattern p1;
    Pat()
    {
        p1 = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}"); /*регулярное выражение*/
    }

        boolean check_mac(String str)
        {
            Matcher m = this.p1.matcher(str);
            return m.matches();
        }
        }


public class Main {

    public static void main(String[] args) {
// Ввод, мас адрес не введен

        Pat p = new Pat();
        System.out.println("Чтобы ввести пусту строку, введите empty");
        System.out.print("Введите Мас адрес ");
        Scanner n = new Scanner(System.in);// создаём объект класса Scanner
        String str = n.next(); //считывает целое число с потока ввода и сохраняем в переменную
        if (str.length() > 15)
        {
            System.out.println("Введена слишком большая строка");
            System.exit(0);
        }
        if (str.equalsIgnoreCase("empty"))
        {
            System.out.println("Введена пустая строка");
        }
        else
        {
            boolean b = p.check_mac(str);
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
