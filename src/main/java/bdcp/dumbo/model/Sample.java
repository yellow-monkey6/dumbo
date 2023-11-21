package bdcp.dumbo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sample {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    protected Sample() {}
    public Sample(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return this.name;
    }
}
