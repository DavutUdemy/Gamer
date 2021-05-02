import java.util.Date;

public class Sell {
    private int id;


    private String gamerName;


    private String gameName;

    public Sell(int id, String gamerName, String gameName) {
        this.id = id;
        this.gamerName = gamerName;
        this.gameName = gameName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGamerName() {
        return gamerName;
    }

    public void setGamerName(String gamerName) {
        this.gamerName = gamerName;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
