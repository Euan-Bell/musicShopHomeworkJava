public abstract class Instrument{


    private String model;
    private String colour;
    private String type;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String model, String colour, String tyoe, double buyBrice, double sellPrice){
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;

    }
}
