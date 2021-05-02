public class Campaign {
    private int id;
    private String campaignName;
    private double campaignAmount;

    public Campaign(int id, double campaignAmount,String campaignName) {
        this.id = id;
        this.campaignAmount = campaignAmount;
        this.campaignName = campaignName;
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

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
}
