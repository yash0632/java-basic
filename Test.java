class Test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // whole numbers -> byte,short,int,long
        // decimal numbers -> float,double
        // characters -> char
        // booleans

        // byte age = 127;
        // short age3 = 20;
        // int age1 = 20; // 2e9
        // long age4 = 200000000L; //9e18
        // System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE + " " + age);
        // System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE + " " + age3);
        // System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE+ " " + age1);
        // System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE + " " + age4);

        // float mySalary = 100.1111123782647845f;
        // double mySalary2 =
        // 100055555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555.1111123782647845;
        // System.out.println(mySalary + " " + Float.MIN_VALUE + " " + Float.MAX_VALUE);
        // System.out.println(mySalary2 + " " + Double.MIN_VALUE + " " +
        // Double.MAX_VALUE);

        // character

        // char initial = '0';// -> nicode
        // char initial2 = 'a';
        // System.out.println((int)initial + " "+ (int)initial2 + " " +
        // (int)Character.MIN_VALUE + " " + (int)Character.MAX_VALUE + " hello" + " " +
        // (char)10084);
        // char heartSymbol = '\u2665';
        // System.out.println(heartSymbol);

        // for(int i = 0;i < 128;i++){
        // System.out.println(i + " -> " + (char)i);
        // }

        // int a = 10; //4 bytes
        // long b = a;

        // double d = 1.8;
        // float c = (double)d;
        // float f = 1.7f;
        // int g = (int)f;
        // System.out.println(a + " " + b + " " + c + " " + f + " " + g);

        // widening conversion -> automatic
        // implicit conversion -> automatic

        // long longValues = 93563499999999999L;
        // float floatValue = longValues;
        // System.out.println(floatValue);

        // char charValue = 'a';
        // int intValue = charValue;
        // float floatValue2 = charValue;
        // System.out.println(intValue + " " + floatValue2);

        // double doubleValue = 123.4564;
        // float floatValue3 = (float)doubleValue;
        // System.out.println(floatValue3);
        // if i do typecast then it is narrowing conversion

        // long longValue2 =(long)3e15;
        // int intValue2 = (int)longValue2;
        // char charValue2 = (char)intValue2;
        // System.out.println(intValue2 + " " + charValue2);

        int a = 10;
        double b = 10.999;
        int c = a + (int)b;
        double d = a + b;
        System.out.println(c + " " + d);
    }

}