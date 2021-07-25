package web.service;

import web.models.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ServiceImp implements Service{

    private final ArrayList<Car> list = new ArrayList<>();;

    public ServiceImp() {
        list.add(new Car(12345, "bmw", "black"));
        list.add(new Car(54321, "mers", "red"));
        list.add(new Car(159754, "alfa", "white"));
        list.add(new Car(159754, "zapor", "white"));
        list.add(new Car(456789, "lada", "pink"));
    }

    public ArrayList<Car> getList() {
        return list;
    }
}
