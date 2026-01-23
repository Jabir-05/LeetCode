public class ValidParan {
    public static boolean IsValidParanthesis(String s){
        while (true) {
            if (s.contains("()")) {
           s= s.replace("()", "");
        }
        else if (s.contains("{}")) {
          s=  s.replace("{}", "");
        }
     else   if (s.contains("[]")) {
           s= s.replace("[]", "");
        }
        else{
            break;
        }
        }
      return  s.isEmpty();
        
    }
    public static void main(String[] args) {
        String s = "[]";
        System.out.println(IsValidParanthesis(s));
    }
}
