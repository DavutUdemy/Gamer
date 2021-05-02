public class CampaignManager {
    public void add(Campaign campaign){
        System.out.println("Yeni kampanya oluşturuldu : " + campaign.getCampaignName());
    }
    public void delete(Campaign campaign){
        System.out.println("Kampanya kaldırlıdı : " + campaign.getCampaignName());
    }
    public void update(Campaign campaign){
        System.out.println("Kampanya Güncellendi : " + campaign.getCampaignName());
        System.out.println("Kampanyanın yeni bilgileri : ");
        System.out.println("Kampanya Adı : " + campaign.getCampaignName());
        System.out.println("Kampanya Miktarı : " + campaign.getCampaignAmount());
    }
}
