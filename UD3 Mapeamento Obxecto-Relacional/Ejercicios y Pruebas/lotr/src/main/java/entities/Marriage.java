package entities;

import jakarta.persistence.*;

@Entity
public class Marriage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_spouse1")
    private String idSpouse1;
    @Basic
    @Column(name = "id_spouse2")
    private String idSpouse2;
    @OneToOne
    @JoinColumn(name = "id_spouse1", referencedColumnName = "id", nullable = false)
    private Characters charactersByIdSpouse1;
    @ManyToOne
    @JoinColumn(name = "id_spouse2", referencedColumnName = "id")
    private Characters charactersByIdSpouse2;

    public String getIdSpouse1() {
        return idSpouse1;
    }

    public void setIdSpouse1(String idSpouse1) {
        this.idSpouse1 = idSpouse1;
    }

    public String getIdSpouse2() {
        return idSpouse2;
    }

    public void setIdSpouse2(String idSpouse2) {
        this.idSpouse2 = idSpouse2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Marriage marriage = (Marriage) o;

        if (idSpouse1 != null ? !idSpouse1.equals(marriage.idSpouse1) : marriage.idSpouse1 != null) return false;
        if (idSpouse2 != null ? !idSpouse2.equals(marriage.idSpouse2) : marriage.idSpouse2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSpouse1 != null ? idSpouse1.hashCode() : 0;
        result = 31 * result + (idSpouse2 != null ? idSpouse2.hashCode() : 0);
        return result;
    }

    public Characters getCharactersByIdSpouse1() {
        return charactersByIdSpouse1;
    }

    public void setCharactersByIdSpouse1(Characters charactersByIdSpouse1) {
        this.charactersByIdSpouse1 = charactersByIdSpouse1;
    }

    public Characters getCharactersByIdSpouse2() {
        return charactersByIdSpouse2;
    }

    public void setCharactersByIdSpouse2(Characters charactersByIdSpouse2) {
        this.charactersByIdSpouse2 = charactersByIdSpouse2;
    }
}
