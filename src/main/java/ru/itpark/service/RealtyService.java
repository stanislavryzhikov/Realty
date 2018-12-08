package ru.itpark.service;

import ru.itpark.domain.Realty;
import ru.itpark.repository.RealtyRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class RealtyService {
    private RealtyRepository repository;

    public RealtyService(RealtyRepository repository) {
        this.repository = repository;
    }

    public void add(Realty realty) {
        repository.add(realty);
    }

    public List<Realty> getAll() {
        return repository.getAll();
    }

    public List<Realty> getSorted(Comparator<Realty> comparator) {
        List<Realty> result = repository.getAll();
        result.sort(comparator);
        return result;
    }

    public List<Realty> findByName(String[] names) {

        List<Realty> result = new ArrayList<Realty>();

        for (Realty realty : repository.getAll()) {

            for (int i = 0; i < names.length; i++) {
                if (realty.getName().equals(names[i])) {
                    result.add(realty);
                }
            }
        }
        return result;
    }
}
