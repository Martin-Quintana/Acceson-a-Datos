package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "books_movies", schema = "lotr", catalog = "")
public class BooksMovies {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "id_movie")
    private String idMovie;
    @Basic
    @Column(name = "id_book")
    private String idBook;
    @ManyToOne
    @JoinColumn(name = "id_movie", referencedColumnName = "id")
    private Movies moviesByIdMovie;
    @ManyToOne
    @JoinColumn(name = "id_book", referencedColumnName = "id")
    private Books booksByIdBook;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BooksMovies that = (BooksMovies) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idMovie != null ? !idMovie.equals(that.idMovie) : that.idMovie != null) return false;
        if (idBook != null ? !idBook.equals(that.idBook) : that.idBook != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idMovie != null ? idMovie.hashCode() : 0);
        result = 31 * result + (idBook != null ? idBook.hashCode() : 0);
        return result;
    }

    public Movies getMoviesByIdMovie() {
        return moviesByIdMovie;
    }

    public void setMoviesByIdMovie(Movies moviesByIdMovie) {
        this.moviesByIdMovie = moviesByIdMovie;
    }

    public Books getBooksByIdBook() {
        return booksByIdBook;
    }

    public void setBooksByIdBook(Books booksByIdBook) {
        this.booksByIdBook = booksByIdBook;
    }
}
