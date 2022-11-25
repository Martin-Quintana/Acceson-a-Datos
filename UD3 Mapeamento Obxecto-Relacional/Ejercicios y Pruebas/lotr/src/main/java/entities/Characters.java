package entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Characters {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "wikiUrl")
    private String wikiUrl;
    @Basic
    @Column(name = "race")
    private String race;
    @Basic
    @Column(name = "birth")
    private String birth;
    @Basic
    @Column(name = "gender")
    private String gender;
    @Basic
    @Column(name = "death")
    private String death;
    @Basic
    @Column(name = "hair")
    private String hair;
    @Basic
    @Column(name = "height")
    private String height;
    @Basic
    @Column(name = "id_realm")
    private String idRealm;
    @ManyToOne
    @JoinColumn(name = "id_realm", referencedColumnName = "id")
    private Realms realmsByIdRealm;
    @OneToMany(mappedBy = "charactersByIdCharacter")
    private Collection<Dialogs> dialogsById;
    @OneToOne(mappedBy = "charactersByIdSpouse1")
    private Marriage marriageById;
    @OneToMany(mappedBy = "charactersByIdSpouse2")
    private Collection<Marriage> marriagesById;

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

    public String getWikiUrl() {
        return wikiUrl;
    }

    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getIdRealm() {
        return idRealm;
    }

    public void setIdRealm(String idRealm) {
        this.idRealm = idRealm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Characters that = (Characters) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (wikiUrl != null ? !wikiUrl.equals(that.wikiUrl) : that.wikiUrl != null) return false;
        if (race != null ? !race.equals(that.race) : that.race != null) return false;
        if (birth != null ? !birth.equals(that.birth) : that.birth != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (death != null ? !death.equals(that.death) : that.death != null) return false;
        if (hair != null ? !hair.equals(that.hair) : that.hair != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (idRealm != null ? !idRealm.equals(that.idRealm) : that.idRealm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (wikiUrl != null ? wikiUrl.hashCode() : 0);
        result = 31 * result + (race != null ? race.hashCode() : 0);
        result = 31 * result + (birth != null ? birth.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (death != null ? death.hashCode() : 0);
        result = 31 * result + (hair != null ? hair.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (idRealm != null ? idRealm.hashCode() : 0);
        return result;
    }

    public Realms getRealmsByIdRealm() {
        return realmsByIdRealm;
    }

    public void setRealmsByIdRealm(Realms realmsByIdRealm) {
        this.realmsByIdRealm = realmsByIdRealm;
    }

    public Collection<Dialogs> getDialogsById() {
        return dialogsById;
    }

    public void setDialogsById(Collection<Dialogs> dialogsById) {
        this.dialogsById = dialogsById;
    }

    public Marriage getMarriageById() {
        return marriageById;
    }

    public void setMarriageById(Marriage marriageById) {
        this.marriageById = marriageById;
    }

    public Collection<Marriage> getMarriagesById() {
        return marriagesById;
    }

    public void setMarriagesById(Collection<Marriage> marriagesById) {
        this.marriagesById = marriagesById;
    }
}
