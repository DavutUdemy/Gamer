public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(1,"5140101010239394","Davud ","Mamedovi",2007);
        Game game = new Game(1,"Gta 5",200);
        Campaign campaign = new Campaign(1,20,"Yuzde  20 indirim");

        GamerManager gamerManager = new GamerManager();
        GameManager gameManager = new GameManager();
        CampaignManager campaignManager = new CampaignManager();
        SellManager sellManager = new SellManager();

        gamerManager.register(gamer);
        System.out.println("----------");
        gameManager.add(game);
        System.out.println("----------");
        campaignManager.add(campaign);
        System.out.println("----------");
        sellManager.sell(gamer,game);
        System.out.println("----------");

        gamer.setFirstName("Davut");
        gamerManager.update(gamer);
        System.out.println("----------");
        campaign.setCampaignAmount(10);
        campaignManager.update(campaign);
        System.out.println("----------");
        game.setCampaignAmount(campaign.getCampaignAmount());
        gameManager.update(game);
        System.out.println("----------");
        sellManager.sell(gamer,game);
        System.out.println("----------");
        gameManager.delete(game);
        System.out.println("----------");
        gamerManager.delete(gamer);
        System.out.println("----------");
        campaignManager.delete(campaign);
    }
}
