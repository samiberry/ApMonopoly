package homework;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Property> propertyList = buildProperties();
    private List<Card> propertyCards = buildPropertyCardList();
    private List<Card> chanceCards = buildChanceCardList();
    private List<Card> communityCards = buildCommunityCardList();
    private List<Die> dice = buildDice();
    private List<Player> players = new ArrayList<Player>();

    public void addNewPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    private List<Die> buildDice() {
        List<Die> dieArrayList = new ArrayList<Die>();
        dieArrayList.add(new Die());
        dieArrayList.add(new Die());
        return dieArrayList;
    }

    private List<Property> buildProperties() {
        List<Property> propertyList = new ArrayList<Property>();
        propertyList.add(new Property("Mediterranean Ave.", PropertyColor.INDIGO, 60));
        propertyList.add(new Property("Free Parking", PropertyColor.NONE, 0));
        propertyList.add(new Property("Go To Jail", PropertyColor.NONE, 0));
        propertyList.add(new Property("Go, collect $200 as you pass", PropertyColor.NONE, 200));
        propertyList.add(new Property("In Jail", PropertyColor.NONE, 0));
        

        return propertyList;
    }

    private List<Card> buildPropertyCardList() {
        List<Card> propertyCards = new ArrayList<Card>();
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.INDIGO, "Mediterranean Ave.", 60));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.INDIGO, "Baltic Ave.", 60));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.LIGHT_BLUE, "Oriental Ave.", 100));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.LIGHT_BLUE, "Vermont Ave.", 100));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.LIGHT_BLUE, "Connecticut Ave.", 120));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.VIOLET, "St. Charles Place", 140));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.VIOLET, "States Ave.", 140));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.VIOLET, "Virginia Ave.", 160));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.ORANGE, "St. James Place", 180));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.ORANGE, "Tennessee Ave.", 180));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.ORANGE, "New York Ave.", 200));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.RED, "Kentucky Ave.", 220));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.RED, "Indiana Ave.", 220));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.RED, "Illinois Ave.", 240));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.YELLOW, "Atlantic Ave.", 260));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.YELLOW, "Ventnor Ave.", 260));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.YELLOW, "Marvin gardens", 280));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.GREEN, "Pacific Ave.", 300));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.GREEN, "North Carolina Ave.", 300));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.GREEN, "Pennsylvania Ave.", 350));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.BLUE, "Park Place", 350));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.BLUE, "Boardwalk", 400));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.WHITE, "Electric Company", 150));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.WHITE, "Water Works", 150));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.WHITE, "Reading Railroad", 200));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.WHITE, "Pennsylvania Railroad", 200));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.WHITE, "B. & O. Railroad", 200));
        propertyCards.add(new Card(CardType.PROPERTY, PropertyColor.WHITE, "Short Line Railroad", 200));
        return propertyCards;
    }

    private List<Card> buildChanceCardList() {
        List<Card> chanceCards = new ArrayList<Card>();
        chanceCards.add(new Card(CardType.CHANCE, PropertyColor.BURNT_RED, "Advance to Illinois Avenue, if you pass go collect $200", 0));
        chanceCards.add(new Card(CardType.CHANCE, PropertyColor.BURNT_RED, "Go Back Three Spaces", 0));
        chanceCards.add(new Card(CardType.CHANCE, PropertyColor.BURNT_RED, "Advance token to the nearest railroad and pay the owner twice the rental to which he is otherwise entitled. If railroad is unowned, you may buy it from the bank.", 0));
        chanceCards.add(new Card(CardType.CHANCE, PropertyColor.BURNT_RED, "Get out of jail free", 0));
        chanceCards.add(new Card(CardType.CHANCE, PropertyColor.BURNT_RED, "Go to Jail", 0));
        chanceCards.add(new Card(CardType.CHANCE, PropertyColor.BURNT_RED, "You have been elected chairman of the board, Pay each player $50", 0));
        chanceCards.add(new Card(CardType.CHANCE, PropertyColor.BURNT_RED, "Advance to St. Charles Place", 0));
        chanceCards.add(new Card(CardType.CHANCE, PropertyColor.BURNT_RED, "Pay poor tax of $15", 0));
        chanceCards.add(new Card(CardType.CHANCE, PropertyColor.BURNT_RED, "Bank pays you dividend of $50", 0));
        return chanceCards;
    }

    private List<Card> buildCommunityCardList() {
        List<Card> communityCards = new ArrayList<Card>();
        communityCards.add(new Card(CardType.COMMUNITY_CHEST, PropertyColor.GOLD, "Income Tax Refund, Collect $20", 0));
        communityCards.add(new Card(CardType.COMMUNITY_CHEST, PropertyColor.GOLD, "Grand Opera Opening, collect $50 from every player", 0));
        communityCards.add(new Card(CardType.COMMUNITY_CHEST, PropertyColor.GOLD, "You inherit $100", 0));
        communityCards.add(new Card(CardType.COMMUNITY_CHEST, PropertyColor.GOLD, "Advance to Go, Collect $200", 0));
        communityCards.add(new Card(CardType.COMMUNITY_CHEST, PropertyColor.GOLD, "Bank Error in your favor, Collect $200", 0));
        communityCards.add(new Card(CardType.COMMUNITY_CHEST, PropertyColor.GOLD, "Get out of jail free card", 0));
        communityCards.add(new Card(CardType.COMMUNITY_CHEST, PropertyColor.GOLD, "Pay hospital $100", 100));
        communityCards.add(new Card(CardType.COMMUNITY_CHEST, PropertyColor.GOLD, "Go to to Jail", 0));
        communityCards.add(new Card(CardType.COMMUNITY_CHEST, PropertyColor.GOLD, "Pay school tax of $150", 150));
        communityCards.add(new Card(CardType.COMMUNITY_CHEST, PropertyColor.GOLD, "From sale of stock, You get $45", 0));
        communityCards.add(new Card(CardType.COMMUNITY_CHEST, PropertyColor.GOLD, "Life insurance matures, Collect $100", 0));
        communityCards.add(new Card(CardType.COMMUNITY_CHEST, PropertyColor.GOLD, "You have won second prize in a beauty contest! Collect $10 ", 0)); 
        return communityCards;
    }
}
