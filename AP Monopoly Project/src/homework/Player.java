package homework;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private PlayerPiece playerPiece;
    private String name;
    List<Property> propertyList = new ArrayList<Property>();
    List<Money> money = new ArrayList<Money>();

    public int rollDice(List<Die> dice) {
        int moveCount = 0;

        for (Die die: dice) {
            moveCount += die.roll();
        }

        return moveCount;
    }

    public PlayerPiece getPlayerPiece() {
        return playerPiece;
    }

    public void setPlayerPiece(PlayerPiece playerPiece) {
        this.playerPiece = playerPiece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public List<Money> getMoney() {
        return money;
    }

    public void setMoney(List<Money> money) {
        this.money = money;
    }
}
