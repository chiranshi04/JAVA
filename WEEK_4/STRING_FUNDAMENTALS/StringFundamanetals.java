public class StringFundamanetals
{
    static boolean hasText(String value)
    {
        if(value.length()>0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    static String normalizeCourseCode(String code)
    {
        return code.toUpperCase();
    }
    static int countOccurrences(String text, char target)
    {
        int count=0;
        char[] textint = text.toCharArray();
        for(int i=0;i<text.length();i++)
        {
            if(textint[i]==target)
            {
                return count;
            }   
            else
            {
                count++;
            }
        }
        return 0;
    }
    static void reverseString(char[] s) {
        char temp;
        for(int i=0;i<s.length/2;i++){
        temp = s[i];
        s[i]=s[s.length-1-i];
        s[s.length-i-1] = temp;
    }
}
    static int lengthOfLastWord(String text) {
    if (text == null || text.length() == 0) 
    {
         return 0; 
    } 
    int i = text.length() - 1; 
     while (i >= 0 && text.charAt(i) == ' ') {
         i--; 
        } 
        int length = 0; // Count characters of the last word 
        while (i >= 0 && text.charAt(i) != ' ')
        { 
            length++;
             i--; 
            }
        return length;
     }
}
