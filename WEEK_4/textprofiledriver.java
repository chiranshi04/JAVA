public class TextProfileDriver 
{
        public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("ABC");
            return;
        }

        String name = args[0];

        int age = Integer.parseInt(args[1]);
        double heightMetres = Double.parseDouble(args[2]);

        TextProfile profile = new TextProfile(name, age, heightMetres);

        System.out.println(profile);

        
        String ageText = Integer.toString(age);
        String heightText = Double.toString(heightMetres);

        System.out.println("Age as text: " + ageText);
        System.out.println("Height as text: " + heightText);
        String nameText = String.valueOf(profile.getName());
        System.out.println("Name as text: " + nameText);
    }
}
