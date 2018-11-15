package basicJava;

public enum Fruits {

    APPLE(10),ORANGE(20),GRAPES(30),MANGO(40);

    int price;

    Fruits(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
