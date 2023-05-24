package Figures;
//раздлеляем интерфейс на несколько. И дальше в классах будем подключать только нужные интерфейсы.
//для куба можно вычислить и площадь и объем, для круга только площадь.

import Controller.iAreaShape;
import Controller.iVolumeShape;

public class Cube implements  iAreaShape, iVolumeShape{
    private int edge;
    
    public Cube(int edge) {
    this.edge = edge;
    }
    
    @Override
    public double volume() {
        return edge * edge * edge;
    }
    
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    
}