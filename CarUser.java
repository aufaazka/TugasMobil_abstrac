
package car.abstrac;

public class CarUser {
    private Car car;

    public CarUser(Car car) {
        this.car = car;
    }
    
    void startEngine(){
        this.car.startEngine();
    }
    
    void stopEngine(){
        this.car.stopEngine();
    }
    
    void temperatureUp(){
        this.car.temperatureUp();
    }
    
    void temperatureDown(){
        this.car.temperatureDown();
    }
    
    void bukaBagasi(){
        this.car.bukaBagasi();
    }
    void tutupBagasi(){
        this.car.tutupBagasi();
    }

    
 
    
}