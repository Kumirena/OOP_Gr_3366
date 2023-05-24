package VehicleDomen;

import Controller.iSpeedCalculation;
// наследник абстрактного класса Vehicle
//использует метод CalculateAllowedSpeed через интерфейс iSpeedCalculation
public class Bus extends Vehicle implements iSpeedCalculation{

public Bus(int maxSpeed, String type) {
    super(maxSpeed, type);        
}

    @Override
    public double CalculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
    
}