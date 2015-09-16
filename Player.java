import java.util.ArrayList;

/**
 * Players in the CardGame.
 * Created by xuesong on 9/14/15.
 */
public class Player {
    private int id;
    private String name;
    public ArrayList<Card> cardsInHand = new ArrayList<>();

    public Player(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

}
