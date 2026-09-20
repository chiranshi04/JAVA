package college.util;
public class TextUtils {
    private static int counter=0;
    public static int getcount()
    {
        return counter;
    }
    public  static String normalizeName(String name) throws IllegalArgumentException
    {
        if(name==null || name.isBlank())
            {
                throw new IllegalArgumentException("Name cannot be empty");
                
            }   
        else
        {
            
            int till=0;
            char[] ne = name.toCharArray();
            while (till<name.length()  && ne[till]==' ')
            {
                till++;
            }
            name = new String(name).substring(till);
            till=name.length()-1;
            StringBuilder sc = new StringBuilder(name);
            for(int i=0;i<sc.length()-1;i++)
            {
                if(sc.charAt(i)== ' ' && sc.charAt(i+1)==' ')
                {
                    sc.deleteCharAt(i);
                    i--;
                }
            }
            while (till>=0  && name.charAt(till)==' ')
            {
                till--;
            }
            name  = new String(sc).substring(till).trim();
            counter++;
            return  name;
        }

    }
    
}
