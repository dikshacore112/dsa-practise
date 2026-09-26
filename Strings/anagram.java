public class anagram{
    public static void main (String[] args){
        String str1="cat";
        String str2="car";
        int[] frequency=new int[26];
        for (int i=0;i<str1.length();i++){
            frequency[str1.charAt(i)-'a']++;
        }
        for (int i=0;i<str2.length();i++){
            frequency[str2.charAt(i)-'a']--;
        }
    boolean isanagram=true;
        for(int i=0;i<26;i++){
           if( frequency[i]!=0){
           isanagram=false;
    }  
    }
    if(isanagram){
        System.out.println("anagram");
    }else {
        System.out.println("not an anagram");
    }
}
} 


