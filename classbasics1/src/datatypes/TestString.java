package datatypes;


public class TestString{
    public static void main(String[] args){
        String x = "Ram";
        String a = new String(x);
        //String b = new String("Ram");
        String c = "Ram";
        String d = "Ram";
        System.out.println(c==a);
        System.out.println(c==x);
        System.out.println(a);
    }
}