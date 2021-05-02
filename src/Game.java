public class Game {
    private int id;

    private double campaignAmount;
    private String name;
    private double price;

    public Game(int id, String name, double price, double campaignAmount) {
        this.id = id;
        this.campaignAmount = campaignAmount;
        this.name = name;
        this.price = price;
    }

     public Game(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.campaignAmount = 0;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCampaignAmount() {
        return campaignAmount;
    }

    public void setCampaignAmount(double campaignAmount) {
        this.campaignAmount = campaignAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceBeforeCampaign() {
        if (this.campaignAmount == 0){
            return this.price;
        }
        return this.price - this.price /100 * campaignAmount;
    }
}
