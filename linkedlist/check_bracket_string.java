import java.util.Stack;
//time complexity o(n);66666666666
import  java.util.Scanner;
public class check_bracket_string {
    public static boolean is_valid(String str){
        Stack <Character> s=new Stack<>();
for (int i=0;i<str.length();i++){
char ch=str.charAt(i);
if(ch=='('||ch=='{'||ch=='['){
    s.push(ch);
}
else{
    if(s.isEmpty()){
        return false;
    }
   

if((s.peek()=='('&&ch==')')||(s.peek()=='{'&&ch=='}')||(s.peek()=='['&&ch==']')){
    s.pop();
}
else{
    return false;
}
}
}
    if(s.isEmpty()){
        return true;
    }
    else{
        return false;
    }}
    public static void main(String[] args) {
        String str="({}[]";
        System.out.println(is_valid(str));
    }
    
}
