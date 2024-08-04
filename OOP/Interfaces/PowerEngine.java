package Interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Power engine accelerates");
    }
    
}
