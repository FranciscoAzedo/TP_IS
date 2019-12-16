package data.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class totalProfitLastHour {
    @Id
    private String name;
    private String value;

    public totalProfitLastHour(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}