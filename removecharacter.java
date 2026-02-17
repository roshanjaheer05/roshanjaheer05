import java.util.*;
public class removecharacter {
    public static String removecharacter(String str,char ch){
        return str.replace(Character.toString(ch),"");
    }
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch=sc.next().charAt(0);
String result=removecharacter(str,ch);
System.out.println("Cleared State: "+result);
}
}
