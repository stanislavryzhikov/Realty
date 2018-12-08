package ru.itpark;

import ru.itpark.comparator.PriceComparator;
import ru.itpark.domain.Realty;
import ru.itpark.repository.RealtyRepository;
import ru.itpark.service.RealtyService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        RealtyService service = new RealtyService(new RealtyRepository());

        service.add(new Realty("Южный", 100_000_000));
        service.add(new Realty("Южный", 10_000_000));
        service.add(new Realty("Северный", 15_000_000));
        service.add(new Realty("Западный", 20_000_000));
        service.add(new Realty("Восточный", 30_000_000));

        //Поиск по цене (в рамках диапазона min-max), вывод должен быть
        //отсортирован по цене
        System.out.println(service.getSorted(new PriceComparator()));

        //Поиск по району (в качестве фильтра принимается произвольное
        //количество названий районов)
        List<Realty> result = service.findByName(new String[]{"Южный", "Западный"});
        System.out.println("Поиск по имени: " + result);
    }
}
