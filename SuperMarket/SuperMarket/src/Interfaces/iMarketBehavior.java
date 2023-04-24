package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * интерфейс для создания общих методов поведения в магазине
 */
public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviour actor);//пришел в магазин
    void releaseFromMatket(List<Actor> actors);// ушел из магазина
    void update();//действия в магазине
}
