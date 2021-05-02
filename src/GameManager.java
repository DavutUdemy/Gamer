public class GameManager {
    public void add(Game game){
        System.out.println("Oyun sisteme eklendi : " + game.getName().toString().toUpperCase());
    }
    public void delete(Game game){
        System.out.println("Oyun sistemden kaldırıldı : " + game.getName().toUpperCase());
    }
    public void update(Game game){
        System.out.println("Oyun Bilgileri Güncellendi : " + game.getName().toUpperCase());
    }

}
