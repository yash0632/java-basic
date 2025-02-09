package datatypes;


public class TestString{
    public static void main(String[] args){
        String name = "Akshit Sharma";
        int length = name.length();
        System.out.printf("%d\n",length);
        char c= name.charAt(5);
        System.out.println(c);

        String name2 = "Akshit sharma";
        //name2.
        System.out.println(name.equalsIgnoreCase(name2));

        String str1 = "remote";
        String str2 = "car";

        int i = str1.compareTo(str2);
        System.out.println(i);

        String name3 = "           Amar Panchal";
        // String substring = name3.substring(5, 8);
        //System.out.println(substring);
        String name4 = name3.trim();
        System.out.println(name4);
        String newName = name3.replace("Panchal", "Sharma");
        System.out.println(newName);
        System.out.println(name3.contains("Pan"));
        System.out.println(name3.endsWith("al"));

        String str3 = "    ";
        System.out.println(str3.isBlank());
        System.out.println(name.lastIndexOf("a"));

        int x = 97;
        char d = (char)x;
        String s = String.valueOf(x);
        System.out.println(String.valueOf(d));
        System.out.println(s);

        String formattedStr = String.format("My name is %s and I am %d years old.","John",25);
        System.out.println(formattedStr);
    }
}