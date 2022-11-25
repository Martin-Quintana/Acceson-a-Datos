package entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Movies {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "runtimeInMinutes")
    private Integer runtimeInMinutes;
    @Basic
    @Column(name = "budgetInMillions")
    private Integer budgetInMillions;
    @Basic
    @Column(name = "boxOfficeRevenueInMillions")
    private Integer boxOfficeRevenueInMillions;
    @Basic
    @Column(name = "academyAwardNominations")
    private Integer academyAwardNominations;
    @Basic
    @Column(name = "academyAwardWins")
    private Integer academyAwardWins;
    @Basic
    @Column(name = "rottenTomatoesScore")
    private Integer rottenTomatoesScore;
    @OneToMany(mappedBy = "moviesByIdMovie")
    private Collection<BooksMovies> booksMoviesById;
    @OneToMany(mappedBy = "moviesByIdMovie")
    private Collection<Dialogs> dialogsById;

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

    public Integer getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void setRuntimeInMinutes(Integer runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    public Integer getBudgetInMillions() {
        return budgetInMillions;
    }

    public void setBudgetInMillions(Integer budgetInMillions) {
        this.budgetInMillions = budgetInMillions;
    }

    public Integer getBoxOfficeRevenueInMillions() {
        return boxOfficeRevenueInMillions;
    }

    public void setBoxOfficeRevenueInMillions(Integer boxOfficeRevenueInMillions) {
        this.boxOfficeRevenueInMillions = boxOfficeRevenueInMillions;
    }

    public Integer getAcademyAwardNominations() {
        return academyAwardNominations;
    }

    public void setAcademyAwardNominations(Integer academyAwardNominations) {
        this.academyAwardNominations = academyAwardNominations;
    }

    public Integer getAcademyAwardWins() {
        return academyAwardWins;
    }

    public void setAcademyAwardWins(Integer academyAwardWins) {
        this.academyAwardWins = academyAwardWins;
    }

    public Integer getRottenTomatoesScore() {
        return rottenTomatoesScore;
    }

    public void setRottenTomatoesScore(Integer rottenTomatoesScore) {
        this.rottenTomatoesScore = rottenTomatoesScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movies movies = (Movies) o;

        if (id != null ? !id.equals(movies.id) : movies.id != null) return false;
        if (name != null ? !name.equals(movies.name) : movies.name != null) return false;
        if (runtimeInMinutes != null ? !runtimeInMinutes.equals(movies.runtimeInMinutes) : movies.runtimeInMinutes != null)
            return false;
        if (budgetInMillions != null ? !budgetInMillions.equals(movies.budgetInMillions) : movies.budgetInMillions != null)
            return false;
        if (boxOfficeRevenueInMillions != null ? !boxOfficeRevenueInMillions.equals(movies.boxOfficeRevenueInMillions) : movies.boxOfficeRevenueInMillions != null)
            return false;
        if (academyAwardNominations != null ? !academyAwardNominations.equals(movies.academyAwardNominations) : movies.academyAwardNominations != null)
            return false;
        if (academyAwardWins != null ? !academyAwardWins.equals(movies.academyAwardWins) : movies.academyAwardWins != null)
            return false;
        if (rottenTomatoesScore != null ? !rottenTomatoesScore.equals(movies.rottenTomatoesScore) : movies.rottenTomatoesScore != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (runtimeInMinutes != null ? runtimeInMinutes.hashCode() : 0);
        result = 31 * result + (budgetInMillions != null ? budgetInMillions.hashCode() : 0);
        result = 31 * result + (boxOfficeRevenueInMillions != null ? boxOfficeRevenueInMillions.hashCode() : 0);
        result = 31 * result + (academyAwardNominations != null ? academyAwardNominations.hashCode() : 0);
        result = 31 * result + (academyAwardWins != null ? academyAwardWins.hashCode() : 0);
        result = 31 * result + (rottenTomatoesScore != null ? rottenTomatoesScore.hashCode() : 0);
        return result;
    }

    public Collection<BooksMovies> getBooksMoviesById() {
        return booksMoviesById;
    }

    public void setBooksMoviesById(Collection<BooksMovies> booksMoviesById) {
        this.booksMoviesById = booksMoviesById;
    }

    public Collection<Dialogs> getDialogsById() {
        return dialogsById;
    }

    public void setDialogsById(Collection<Dialogs> dialogsById) {
        this.dialogsById = dialogsById;
    }
}
