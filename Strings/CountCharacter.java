public class CountCharacter{
    public static void main(String[] args) {
        String str = "banana";

char target = 'a';

int count = 0;
for (int i=0;i< str.length();i++){
    if( str.charAt(i)==target){
        count=count+1;
    }
}
System.out.println("The character '" + target + "' appears " + count + " times in the string \"" + str + "\".");
    }
}