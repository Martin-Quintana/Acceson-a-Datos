package entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Realms {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "population")
    private Integer population;
    @Basic
    @Column(name = "area")
    private Integer area;
    @OneToMany(mappedBy = "realmsByIdRealm")
    private Collection<Characters> charactersById;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Realms realms = (Realms) o;

        if (id != null ? !id.equals(realms.id) : realms.id != null) return false;
        if (name != null ? !name.equals(realms.name) : realms.name != null) return false;
        if (population != null ? !population.equals(realms.population) : realms.population != null) return false;
        if (area != null ? !area.equals(realms.area) : realms.area != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (population != null ? population.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        return result;
    }

    public Collection<Characters> getCharactersById() {
        return charactersById;
    }

    public void setCharactersById(Collection<Characters> charactersById) {
        this.charactersById = charactersById;
    }
}
