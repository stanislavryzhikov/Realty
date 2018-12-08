package ru.itpark.comparator;

import ru.itpark.domain.Realty;

import java.util.Comparator;

public class PriceComparator implements Comparator<Realty> {
    public int compare(Realty o1, Realty o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
