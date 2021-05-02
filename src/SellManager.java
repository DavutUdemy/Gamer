public class SellManager {
    public void sell(Gamer gamer,Game game){
        Sell sell = new Sell(1,gamer.getFirstName() + " " + gamer.getLastName(),game.getName());
        System.out.println(game.getName() + " isimli oyun " + gamer.getFirstName() + " " + gamer.getLastName()
                + " tarafından "+ "%"+game.getCampaignAmount() +" indirimle " + game.getPriceBeforeCampaign() + "₺ karşılığında satın alındı");

        System.out.println("Satış Bilgileri");
        System.out.println("----------------");
        System.out.println("Satış Id : " + sell.getId());
        System.out.println("Satılan Oyun : " + sell.getGameName());
        System.out.println("Satın Alan : " + sell.getGamerName());
    }
}
