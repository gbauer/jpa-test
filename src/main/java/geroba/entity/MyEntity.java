package geroba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyEntity {

    private String id;

    private String value;

    @Id
    @GeneratedValue
    @Column
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
