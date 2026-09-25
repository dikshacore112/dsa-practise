public class stringbuilder {
    public static void main(String[] args) 
{
    String str="Hello";
    StringBuilder sb=new StringBuilder(str);
    sb.append(" world");
    sb.reverse();
    String result=sb.toString();
    System.out.println(result);

}    
}
