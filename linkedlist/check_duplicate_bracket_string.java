import java.util.Stack;
\
//time_complexity=o(n);
public class check_duplicate_bracket_string {
     static boolean isduplicate(String str1){
        Stack<Character>s=new Stack<>();
        for (int i=0;i<str1.length();i++){
char ch=str1.charAt(i);
//closing
if(ch==')'){
    int count=0;
    while(s.peek()!='('){
s.pop();
count++;
    }
if(count<1){
    return true;//duplicate
}
else{
    s.pop();//openning pair
}
    }
    else{
        //openning
        s.push(ch);
    }
}
        
        return  false;
    }
    public static void main(String[] args) {
       String  str1="((a+b))";
       String str2="(a-b)";
       System.out.println(isduplicate(str2));
    }
    
}
