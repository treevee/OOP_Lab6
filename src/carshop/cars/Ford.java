package carshop.cars;

public class Ford extends Car{

    int year;
    double manufacturerDiscount;

    public Ford(int speed, boolean isSellOut, double regularPrice, String color, int year,double manufacturerDiscount) {
        super(speed, isSellOut, regularPrice, color);
        this.year=year;
        this.manufacturerDiscount=manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return regularPrice-(regularPrice*manufacturerDiscount);
    }
}
