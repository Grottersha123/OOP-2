import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*3. Написать регулярное выражение, определяющее является ли заданная строка
правиль-ным MAC-адресом. – пример правильных выражений: aE:dC:cA:56:76:54.
– пример неправильных выражений: 01:23:45:67:89:Az. */
public class Main {

    public static void main(String[] args) {

        Pattern p1 = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}"); /*ругулярное выражение , которокое */
        Matcher m1 = p1.matcher( "aE:dC:cA:56:76:54" ); // возвращает true, если шаблон соответствует всей строке, иначе false.
        /*re+ Одно или более совпадений предыдущего выражения.
          re{n} Соответствует ровно N Количество вхождений предшествующего выражения.
          (?: re) Группы регулярных выражений, не помнящая найденный текст.
          [...] Соответствует любой одиночный символ в скобках
        * */
        boolean b = m1.matches();
        String m =  b ? "Введен  правильный MAC  адрес" : "Введен не правильный MAC  адрес";
        System.out.println(m);
    }
}