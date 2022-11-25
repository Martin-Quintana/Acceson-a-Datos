package entities;

import jakarta.persistence.*;

@Entity
public class Chapters {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "chapter_name")
    private String chapterName;
    @Basic
    @Column(name = "id_book")
    private String idBook;
    @ManyToOne
    @JoinColumn(name = "id_book", referencedColumnName = "id")
    private Books booksByIdBook;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
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

        Chapters chapters = (Chapters) o;

        if (id != null ? !id.equals(chapters.id) : chapters.id != null) return false;
        if (chapterName != null ? !chapterName.equals(chapters.chapterName) : chapters.chapterName != null)
            return false;
        if (idBook != null ? !idBook.equals(chapters.idBook) : chapters.idBook != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (chapterName != null ? chapterName.hashCode() : 0);
        result = 31 * result + (idBook != null ? idBook.hashCode() : 0);
        return result;
    }

    public Books getBooksByIdBook() {
        return booksByIdBook;
    }

    public void setBooksByIdBook(Books booksByIdBook) {
        this.booksByIdBook = booksByIdBook;
    }
}
