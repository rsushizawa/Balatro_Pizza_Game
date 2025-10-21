package Balatro_Pizza_Game.src.Baralho;

public enum Quality {
    DIAMONDS("Gourmet"),
    CLUBS("Handcrafted"),
    HEARTS("Fresh"),
    SPADES("Classic");

    private final String name;

    Quality (String name) {
        this.name = name;
    }

    public String getSuits() {
        return name;
    }
}
