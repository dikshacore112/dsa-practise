public class charactrerfrequencyarray {
    public static void main(String[] args) {
        String str="banana";
        int[] frequency=new int[26];
        for(int i=0;i<str.length();i++){
            frequency[str.charAt(i)-'a']++;
        }
    
    System.out.println(frequency[0]);
    System.out.println(frequency[1]);
    System.out.println(frequency[13]);
    }
}


    
