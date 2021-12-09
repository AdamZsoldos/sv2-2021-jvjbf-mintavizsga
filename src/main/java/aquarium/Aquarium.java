package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    public static final int CAPACITY = 20;
    public static final int CAPACITY_PER_FISH = 5;
    private final List<Fish> fishList = new ArrayList<>();

    public void addFish(Fish fish) {
        validateCapacity(fishList.size() + 1);
        fishList.add(fish);
    }

    public void removeFish(int maxWeight) {
        List<Fish> fishToRemove = new ArrayList<>();
        for (Fish fish : fishList) {
            if (fish.getWeight() > maxWeight) {
                fishToRemove.add(fish);
            }
        }
        fishList.removeAll(fishToRemove);
    }

    public void feed() {
        for (Fish fish : fishList) {
            fish.feed();
        }
    }

    public List<String> getStatus() {
        List<String> status = new ArrayList<>();
        for (Fish fish : fishList) {
            status.add(fish.getStatus());
        }
        return status;
    }

    private void validateCapacity(int numberOfFish) {
        if (CAPACITY < numberOfFish * CAPACITY_PER_FISH) {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
    }

    public int getNumberOfFishWithMemoryLoss() {
        int result = 0;
        for (Fish fish : fishList) {
            if (fish.hasMemoryLoss()) {
                result++;
            }
        }
        return result;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish fish : fishList) {
            if (fish.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        Fish smallest = null;
        for (Fish fish : fishList) {
            if (smallest == null || fish.getWeight() < smallest.getWeight()) {
                smallest = fish;
            }
        }
        return smallest;
    }
}
