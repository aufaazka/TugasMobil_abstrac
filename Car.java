package car.abstrac;


public interface Car {
     int MAX_TEMPERATURE = 100;
    int MIN_TEMPERATURE = 0;
    
    void startEngine();
    void stopEngine();
    void temperatureUp();
    void temperatureDown();
    void bukaBagasi();
    void tutupBagasi();
   
}


    