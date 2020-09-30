package practice5.task8;

import java.lang.String;

public class Main {

    public static void isPalindrom(String str, int left, int right){

        //Если зеркальные буквы не равны друг другу и мы не достигли конца строки с обоих сторон
          if((str.charAt(left) != str.charAt(right)) && (left == 0 || right == str.length()))
              System.out.print("NO");
          // Если достигли конца строки и всё хорошо
          else if(left == 0 || right == str.length())
              System.out.print("YES");
          else {
              //Сдвигаем индексы по буквам
              if(left >0)
                left -=1;
              if(right < str.length()-1)
                  right += 1;
              isPalindrom(str, left, right);
          }
    }

    public static void main(String[] args) {
        String str = new String();
        str = "Колесо. Жалко поклаж. Оселок.";
        //очищаем от ненужных знаков припинания
        str =  str.replace(" ", "");
        str = str.replace(".","");
        str = str.replace(",","");
        str = str.replace("!","");
        str = str.replace("-","");
        str = str.replace("_","");
        str = str.replace("@","");
        str = str.replace("\"","");
        str = str.replace("#","");
        str = str.replace(";","");
        str = str.replace(":","");
        str = str.replace("\'","");
        str = str.replace("^","");
        str = str.replace("*","");
        str = str.replace("(","");
        str = str.replace("+","");
        str = str.replace("=","");
        str = str.replace(")","");
        str = str.replace("<","");
        str = str.replace(">","");
        str = str.toLowerCase();
        int mid = str.length()/2;

        int right;
        int left;
        if(str.length()%2 != 0)
        {
            right = mid + 1;
            left = mid -1;
        }
        else
        {
            left = mid - 1;
            right = mid + 2;
        }
        isPalindrom(str, left,right);
    }
}
