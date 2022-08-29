package OOPs.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media Player = new CDPlayer();

    public NiceCar (){
        engine = new ElectricEngine();
    }
    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.start();
    }
    public void acc(){
        engine.start();
    }
    public void startMusic(){
        Player.start();
    }
    public void stopMusic(){
        Player.stop();
    }
    public void upgradeEngine(){
        this.engine = new PowerEngine();
    }
}
