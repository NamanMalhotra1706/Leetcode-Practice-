public class nonRepChar {
    static char nonrepeatingCharacter(String S)
    {

        for(int i=0;i<S.length();i++)
        {
            if(S.lastIndexOf(S.charAt(i))==i  && S.indexOf(S.charAt(i))==i)
            return S.charAt(i);
        }
        return '$';
    }
    public static void main(String[] args) {
        
    }
}
