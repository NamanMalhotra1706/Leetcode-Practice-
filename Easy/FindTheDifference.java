public class FindTheMissing {
    public char findTheDifference(String s, String t) {
        
        char char1[] = s.toCharArray();
        char char2[] = t.toCharArray();

        int freq[] = new int[26];

        for(int i=0;i<char1.length;i++){
            int typeCast = ((int)(char1[i]-'a'));
            freq[typeCast]++;
        }
        
        for(int i=0;i<char2.length;i++){
            int typeCast = ((int)(char2[i]-'a'));
            freq[typeCast]++;
        }

        // for(int i=0;i<26;i++){
        //     System.out.print(freq[i] + " ");
        // }

    for(int i=0;i<freq.length;i++){
        if(freq[i]%2!=0){
            return (char)(i+'a');
        }
    }

    return ' ';

    }
}
