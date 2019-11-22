package zad2;

public class Tire {
    private String producer;
    private TireType type;
    private double price;

    public Tire(String producer, TireType type, double price) {
        this.producer = producer;
        this.type = type;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public TireType getType() {
        return type;
    }

    public void setType(TireType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "producer='" + producer + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
