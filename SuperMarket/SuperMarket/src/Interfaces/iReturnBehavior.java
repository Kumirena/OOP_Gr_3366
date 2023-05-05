package Interfaces;
/**
 * интерфейс возврата товара
 */
public interface iReturnBehaviour {
    void returnToMarket(iActorBehaviour actor);//возвращается в магазин
    void returnPurche(iActorBehaviour actor);//возвращает товар
    void leaveShop(iActorBehaviour actor);//уходит из  магазина 
    void updateReturn(iActorBehaviour actor);
    
}