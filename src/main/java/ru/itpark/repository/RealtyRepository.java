package ru.itpark.repository;

import ru.itpark.domain.Realty;

import java.util.ArrayList;
import java.util.List;

public class RealtyRepository {
    private List<Realty> items = new ArrayList<Realty>();

    public void add(Realty item) {
        items.add(item);
    }

    public List<Realty> getAll() {
        return items;
    }
}
