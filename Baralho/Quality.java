package Balatro_Pizza_Game.Baralho;

public enum Quality {
    DIAMONDS("Gourmet"),
    CLUBS("Handcrafted"),
    HEARTS("Fresh"),
    SPADES("Classic");

    private final String name;

    private Quality (String name) {
        this.name = name;
    }

    public String getSuits() {
        return name;
    }
}
