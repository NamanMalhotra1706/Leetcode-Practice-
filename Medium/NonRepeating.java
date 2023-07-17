import java.util.ArrayList;

public class NonRepeating {
     public String FirstNonRepeating(String A)
    {
       StringBuilder ans = new StringBuilder();

        int arr[] = new int[26];
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (arr[ch - 'a'] == 0) {
                list.add(ch);
            }

            arr[ch - 'a']++;

            int flag = 0;
            int m = list.size();

            for (int j = 0; j < m; j++) {
                char chs = list.get(j);

                if (arr[chs - 'a'] == 1) {
                    ans.append(chs);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                ans.append("#");
            }

        }
        return ans.toString();
    }
    public static void main(String[] args) {
        
    }
}
