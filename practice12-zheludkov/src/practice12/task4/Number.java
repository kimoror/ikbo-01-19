package practice12.task4;

public class Number {

    public static void translator(StringBuilder line){
        if(line.charAt(0) == '+'){
            line.insert(5,"-");
            line.insert(9,"-");
        }
        else if(line.charAt(0) == '8'){
            line.insert(4,"-");
            line.insert(8,"-");
        }
    }
}