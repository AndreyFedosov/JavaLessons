package lesson3.temp;

public class Iphone extends Phone {
    private String displayModel;
    private int cost;

    public Iphone(String displayModel) {
        this.displayModel = displayModel;
    }

    @Override
    public void setCost(int cost){
        this.cost = cost;
    }

    @Override
    public int getCost(){
        return this.cost * 2;
    }
    public int getPhonePrice(){
        return this.getCost();
    }
    public int getParentPhonePrice(){
        return super.getCost();
    }

    public void setPhonePrice(int cost){
        this.setCost(cost);
    }

    public void setParentPrice(int cost){
        super.setCost(cost);
    }

    public Iphone(int cost, String model, String manufacturer) {
        super(cost,model,manufacturer);


    }

}
