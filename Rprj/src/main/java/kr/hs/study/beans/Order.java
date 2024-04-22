package kr.hs.study.beans;

public class Order {
    private String menu;
    private String drink;

    public Order(String menu, String drink){
        this.drink = drink;
        this.menu = menu;
    }

    public String getMenu(){
        return menu;
    }

    public String getDrink(){
        return drink;
    }
}
