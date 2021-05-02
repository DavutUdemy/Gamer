public class GamerManager {
    public void register(Gamer gamer){
        System.out.println("Kayıt Başarılı : " + gamer.getFirstName() + " " + gamer.getLastName().toUpperCase());
    }
    public void update(Gamer gamer){
        System.out.println("Bilgiler Güncellendi");
        System.out.println("--------------------");
        System.out.println("Kullanıcı Adı Soyadı : " +  gamer.getFirstName() + " " + gamer.getLastName().toUpperCase());
        System.out.println("Kullanıcı Doğum Yılı"+gamer.getBirthYear());
        System.out.println("Kullanıcı TcNo : " + gamer.getNationalIdentity());
    }
    public void delete(Gamer gamer){
        System.out.println("Kayıt Başarılı  bir sekilde silindi: " + gamer.getFirstName() + " " + gamer.getLastName().toUpperCase());
    }

}
