package com.driver;

public class Pizza {

    private int price=0;
    Boolean isVeg;
    private String bill="";

    private int Pizza=0;
    private int extraCheese=0;
    private int Toppings=0;
    private int paperBag=0;
    public int getPizza(){
        return Pizza;
    }
    public int getExtraCheese(){
        return extraCheese;
    }
    public int getToppings(){
        return Toppings;
    }
    public int getPaperBag(){
        return paperBag;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            Pizza=300;
        }else{
            Pizza=400;
        }
        price+=Pizza;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese==0)price+=80;
        extraCheese=80;
    }

    public void addExtraToppings(){
        if(isVeg){
            if(Toppings==0)price+=70;
            Toppings=70;
        }else{
            if(Toppings==0)price+=120;
            Toppings=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(paperBag==0)price+=20;
        paperBag=20;
    }

    public String getBill(){
        bill="Base Price Of The Pizza: "+Pizza+"\n";
        if(extraCheese!=0){
            bill+="Extra Cheese Added: "+extraCheese+"\n";
        }
        if(Toppings!=0){
            bill+="Extra Toppings Added: "+Toppings+"\n";
        }
        if(paperBag!=0){
            bill+="Paperbag Added: "+paperBag+"\n";
        }
        bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}
