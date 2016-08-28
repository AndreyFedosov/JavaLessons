package lesson3;

public class Iphone extends Phone {
    private String displayModel;

    public Iphone(String displayModel) {
        this.displayModel = displayModel;
    }

    public int getPhonePrice(){
        return super.getCost();
    }

    public Iphone(int cost, String model, String manufacturer) {
        super(cost,model,manufacturer);

    }

}
