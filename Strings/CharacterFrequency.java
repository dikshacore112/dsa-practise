import java.util.HashMap;
public class CharacterFrequency {
    public static void main(String[] args) {
        String str="banana";
        HashMap<Character,Integer> frequency=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if (frequency.containsKey(str.charAt(i))){
                frequency.put(str.charAt(i),frequency.get(str.charAt(i))+1);
            }else{
                frequency.put(str.charAt(i),1);
            }
        }
        System.out.println(frequency);
    }
}