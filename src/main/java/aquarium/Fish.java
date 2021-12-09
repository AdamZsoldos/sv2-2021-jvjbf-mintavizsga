package aquarium;

public abstract class Fish {

    private final String name;
    private int weight;
    private final String color;
    private final boolean memoryLoss;

    protected Fish(String name, int weight, String color, boolean memoryLoss) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.memoryLoss = memoryLoss;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void incrementWeight(int increment) {
        weight += increment;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

    public String getStatus() {
        return String.format("%s, weight: %d, color: %s, short-term memory loss: %b", name, weight, color, memoryLoss);
    }

    public abstract void feed();
}
