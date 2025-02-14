public class AnonymousInnerClass {
    public static void main(String[] args){
        //Anonymous Inner Class is a class with no name and use to initiate one object ever

        //Anonymous inner class can extend any other class
        Animal bigFoot = new Animal(){
            @Override
            public void makeNoise(){
                System.out.println("grawleneeelene");
            }
        };
        bigFoot.makeNoise();



    }
}

interface Animal{
    public void makeNoise();
}
