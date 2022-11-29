package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "house_points", schema = "hogwarts", catalog = "")
public class HousePoints {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "giver")
    private Integer giver;
    @Basic
    @Column(name = "receiver")
    private Integer receiver;
    @Basic
    @Column(name = "points")
    private Integer points;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getGiver() {
        return giver;
    }

    public void setGiver(Integer giver) {
        this.giver = giver;
    }

    public Integer getReceiver() {
        return receiver;
    }

    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HousePoints that = (HousePoints) o;

        if (id != that.id) return false;
        if (giver != null ? !giver.equals(that.giver) : that.giver != null) return false;
        if (receiver != null ? !receiver.equals(that.receiver) : that.receiver != null) return false;
        if (points != null ? !points.equals(that.points) : that.points != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (giver != null ? giver.hashCode() : 0);
        result = 31 * result + (receiver != null ? receiver.hashCode() : 0);
        result = 31 * result + (points != null ? points.hashCode() : 0);
        return result;
    }
}
