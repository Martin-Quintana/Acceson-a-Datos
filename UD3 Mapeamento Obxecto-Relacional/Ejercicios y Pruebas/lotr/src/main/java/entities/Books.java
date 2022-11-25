package entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Books {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "booksByIdBook")
    private Collection<BooksMovies> booksMoviesById;
    @OneToMany(mappedBy = "booksByIdBook")
    private Collection<Chapters> chaptersById;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (id != null ? !id.equals(books.id) : books.id != null) return false;
        if (title != null ? !title.equals(books.title) : books.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    public Collection<BooksMovies> getBooksMoviesById() {
        return booksMoviesById;
    }

    public void setBooksMoviesById(Collection<BooksMovies> booksMoviesById) {
        this.booksMoviesById = booksMoviesById;
    }

    public Collection<Chapters> getChaptersById() {
        return chaptersById;
    }

    public void setChaptersById(Collection<Chapters> chaptersById) {
        this.chaptersById = chaptersById;
    }
}
