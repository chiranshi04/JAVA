public class App 
{
    
    public static void main(String[] args) 
{

        System.out.println(StringBuilderToolkit.reverse("Hello"));

        System.out.println(StringBuilderToolkit.repeat("Hi", 3));

        String[] words = {"", "c", "D"};
        System.out.println(StringBuilderToolkit.joinWords(words, ", "));

        System.out.println(StringBuilderToolkit.removeCharacterAt("Hello", 1));

        System.out.println(StringBuilderToolkit.replaceCharacterAt("Hello", 1, 'a'));

        String[] items = {"Ltbjr", "nfkn ", "nfkdnfkd. "};
        System.out.println(StringBuilderToolkit.buildNumberedList(items));

        StringBuilder builder = new StringBuilder("Hello");
        String result = builder.toString();

        builder.append(" World");

        System.out.println(builder);
        System.out.println(result);
    }
}
