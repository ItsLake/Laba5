



public class Toy implements Comparable<Toy> {
    String name;
    double price;
    int minAge,maxAge,param;
    int ololo;
    public Toy(String name, double price, int minAge, int maxAge, int param) {
        this.name = name;
        this.price = price;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.param = param;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getMinAge() {
        return minAge;
    }
    public int getMaxAge() {
        return maxAge;
    }
    public int getParam() {
        return param;
    }
//В порядке увеличения цены
    public int compareTo(Toy obj) {
        return (int) Math.signum(price-obj.price);
    }
}