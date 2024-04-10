package Core.Strings;

public class StringE {
    
    public static void main(String[] args) {
        
        System.out.println("--------> Strings <--------");

        String text1 = "This is an String";

        System.out.println(text1);

        String text2 = new String("This is an String too");

        System.out.println(text2);

        String text3 = "Hola Mundo!";

        System.out.println("--------> Strings operations <--------");

        System.out.println("Lenght of chars is: " + text3.length()); 
        System.out.println("To upper case: " + text3.toUpperCase());
        System.out.println("To lower case: " + text3.toLowerCase());
        System.out.println("Get index of char: 'a' " + text3.indexOf("a"));
        System.out.println("Get index where start the word 'Mundo': " + text3.indexOf("Mundo"));
        System.out.println("Get index of the last character 'o': " + text3.lastIndexOf("o"));
        System.out.println("Get subString since the index 2: " + text3.substring(2));
        System.out.println("Get subString since the index 2 to 7:" + text3.substring(2, 7));
        String[] texts = text3.split("o");
        for(String s : texts)
            System.out.println("Get String splited: " + s);
        System.out.println("Rempalce 'Mundo' for 'Tierra'" + text3.replace("Mundo","Tierra"));

        System.out.println("--------> Comparations <--------");

        String text4 = "Cat";

        //DON'T USE == that will work but not everytime 
        System.out.println(text4 == "Dog");
        System.out.println(text4 == "Cat");
        System.out.println(text4.equals("Dog"));
        System.out.println(text4.equals("Cat"));





    }
}
