package Interfaces;

import org.jetbrains.annotations.NotNull;

public class CarComparable implements Comparable<CarComparable> {
    int Price;
    int Speed;

    @Override
    public int compareTo(@NotNull CarComparable car) {
        if(this.Price == car.Price) return 0;
        if(this.Price > car.Price) return 1;
        if(this.Price < car.Price) return -1;

        return 0;
    }
}
