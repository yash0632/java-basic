class Test{
    public static void main(String[] args){
        System.out.println("Hello World!");
        // whole numbers -> byte,short,int,long
        //decimal numbers -> float,double
        //characters -> char
        //booleans

        // byte age = 127; 
        // short age3 = 20;
        // int age1 = 20; // 2e9
        // long age4 = 200000000L; //9e18
        // System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE + " " + age);
        // System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE + " " + age3);
        // System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE+ " " + age1);
        // System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE + " "  + age4);


        float mySalary = 1000.1111123782647845f;
        double mySalary2 = 1000.1111123782647845;
        System.out.println(mySalary + " " + Float.MIN_VALUE + " " + Float.MAX_VALUE);
        System.out.println(mySalary2 + Double.MIN_VALUE + " " + Double.MAX_VALUE);
    }
}