package com.driver;

public class DeluxePizza extends Pizza {
    private String bill;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        addExtraCheese();
        addExtraToppings();
    }
    @Override
    public void addExtraCheese() {
        super.addExtraCheese();
    }
    @Override
    public void addExtraToppings() {
        super.addExtraToppings();
    }
    @Override
    public int getPrice() {
        return super.getPrice();
    }
    @Override
    public void addTakeaway() {
        super.addTakeaway();
    }



    @Override
    public String getBill() {
        bill="Base Price Of The Pizza: "+ getPizza() +"\n";
        if(getExtraCheese() !=0){
            bill+="Extra Cheese Added: "+ getExtraCheese() +"\n";
        }
        if(getToppings() !=0){
            bill+="Extra Toppings Added: "+ getToppings() +"\n";
        }
        if(getPaperBag() !=0){
            bill+="Paperbag Added: "+ getPaperBag() +"\n";
        }
        bill+="Total Price: "+ getPrice();
        return this.bill;
    }
}
