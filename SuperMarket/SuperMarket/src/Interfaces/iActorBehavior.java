package Interfaces;

import Classes.Actor;
/*
 * интерфейс поведения клиента в магазине
 */

public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder);//сделать заказ
    void setTakeOrder(boolean pickUpOrder);//взять заказ
    void setReturnOrder(boolean isReturnOrder);//вернуть товар
/*
 * проверяем действия клиента
 */
    boolean isMakeOrder();
    boolean isTakeOrder();
    boolean isReturnOrder();
    Actor getActor();
}