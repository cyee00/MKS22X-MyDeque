public class Calculator{
    public Calculator(){}

    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    //public static String eval(String s){
    public String eval(String s){
      String[] data = s.split(" ");
      return toString(data);
    }

    private String toString(String[]data1){
      String ans="";
      for (int i=0;i<data1.length;i++){
        ans+=data1[i];
      }
      return ans;
    }

    public static void main(String[] args){
      Calculator calc = new Calculator();
      System.out.println(calc.eval(args[0]));
    }
}
