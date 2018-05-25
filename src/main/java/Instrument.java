public abstract class Instrument{


    protected String model;
   protected String colour;
   protected String type;
    protected double buyPrice;
    protected double sellPrice;

    public Instrument(String model, String colour, String type, double buyPrice, double sellPrice){
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;

    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public String getType() {
        return this.type;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }
}
