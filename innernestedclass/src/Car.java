public class Car{
    private boolean isEngineOn;
    private String model;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }



    private class Engine{
        public void start(){
            if(isEngineOn == false){
                isEngineOn = true;
                System.out.println("Starting engine of " + model);
            }
            else{
                System.out.println("Engine of " + model + " is already on");
            }
        }

        public void stop(){
            if(isEngineOn == true){
                isEngineOn = false;
                System.out.println("Stopping engine of " + model);
            }
            else{
                System.out.println("Engine of " + model + " is already off");
            }    
        }
    }  
}