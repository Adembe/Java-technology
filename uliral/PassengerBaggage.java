package uliral;

public class PassengerBaggage {
    private int baggageGoods;
    private double goodsWeight;

    public PassengerBaggage(int baggageGoods, double goodsWeight) {
        this.baggageGoods = baggageGoods;
        this.goodsWeight = goodsWeight;
    }

    public int getBaggageGoods() {
        return baggageGoods;
    }

    public void setBaggageGoods(int baggageGoods) {
        this.baggageGoods = baggageGoods;
    }

    public double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    @Override
    public String toString() {
        return "PassengerBaggage{" +
                "baggageGoods=" + baggageGoods +
                ", goodsWeight=" + goodsWeight +
                '}';
    }
}
