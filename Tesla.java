
package car.abstrac;


public class Tesla implements Car{
    private int temperature;
    private boolean isEngineOn;
    
   public Tesla() {
        // set volume awal
        this.temperature = 20;
    }

    @Override
     public void startEngine() {
        isEngineOn = true;
        System.out.println("Mesin mobil menyala...");
        System.out.println("Selamat datang di Tesla mobil sultan");
        System.out.println("Nikmati kenyamanan anda");
    }

    @Override
    public void stopEngine() {
        isEngineOn = false;
        System.out.println("Mesin dimatikan");
    }

    @Override
    public void temperatureUp() {
        if (isEngineOn) {
            if (this.temperature == MAX_TEMPERATURE) {
                System.out.println("Suhu Maksimal!!");
                System.out.println("sudah " + this.getTemperature() + "%");
            } else {
                this.temperature += 10;
                System.out.println("suhu sekarang: " + this.getTemperature()+"%");
            }
        } else {
            System.out.println("Montor larang nguripi mobil lali!!");
        }
    }

    @Override
    public void temperatureDown() {
        if (isEngineOn) {
            if (this.temperature == MIN_TEMPERATURE) {
                System.out.println("Memasuki suhu minimal = 0%");
            } else {
                this.temperature -= 10;
                System.out.println("suhu sekarang: " + this.getTemperature()+"%");
            }
        } else {
            System.out.println("Mesin keadaan mati!!");
        }
    }

    public int getTemperature() {
        return this.temperature;
    }
public void bukaBagasi() {
        isEngineOn = true;
        System.out.println("Bagasi mobil sudah terbuka");
    }

    @Override
    public void tutupBagasi() {
        isEngineOn = false;
        System.out.println("Bagasi mobil sudah tertutup");
    }
    
}

