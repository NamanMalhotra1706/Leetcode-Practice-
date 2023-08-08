public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        
        int Freq[] = new int[26];
        int Freq2[] = new int[26];
        
        char [] str1= s.toCharArray();
        char [] str2= t.toCharArray();

        if(str1.length!=str2.length){
            return false;
        }

        for(int i=0;i<str1.length;i++){
            int typeCast =((int)(str1[i]-'a'));
            Freq[typeCast]++;
        }

        for(int i=0;i<str2.length;i++){
            int typeCast =((int)(str2[i]-'a'));
            Freq2[typeCast]++;
        }

        
        // for(int i=0;i<Freq2.length;i++){
        //     System.out.println(Freq2[i]);
        // }
        for(int i=0;i<26;i++){
            if(Freq[i]!=Freq2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
