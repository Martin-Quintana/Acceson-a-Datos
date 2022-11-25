package entities;

import jakarta.persistence.*;

@Entity
public class Dialogs {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "dialog")
    private String dialog;
    @Basic
    @Column(name = "id_movie")
    private String idMovie;
    @Basic
    @Column(name = "id_character")
    private String idCharacter;
    @ManyToOne
    @JoinColumn(name = "id_movie", referencedColumnName = "id")
    private Movies moviesByIdMovie;
    @ManyToOne
    @JoinColumn(name = "id_character", referencedColumnName = "id")
    private Characters charactersByIdCharacter;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getIdCharacter() {
        return idCharacter;
    }

    public void setIdCharacter(String idCharacter) {
        this.idCharacter = idCharacter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dialogs dialogs = (Dialogs) o;

        if (id != null ? !id.equals(dialogs.id) : dialogs.id != null) return false;
        if (dialog != null ? !dialog.equals(dialogs.dialog) : dialogs.dialog != null) return false;
        if (idMovie != null ? !idMovie.equals(dialogs.idMovie) : dialogs.idMovie != null) return false;
        if (idCharacter != null ? !idCharacter.equals(dialogs.idCharacter) : dialogs.idCharacter != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dialog != null ? dialog.hashCode() : 0);
        result = 31 * result + (idMovie != null ? idMovie.hashCode() : 0);
        result = 31 * result + (idCharacter != null ? idCharacter.hashCode() : 0);
        return result;
    }

    public Movies getMoviesByIdMovie() {
        return moviesByIdMovie;
    }

    public void setMoviesByIdMovie(Movies moviesByIdMovie) {
        this.moviesByIdMovie = moviesByIdMovie;
    }

    public Characters getCharactersByIdCharacter() {
        return charactersByIdCharacter;
    }

    public void setCharactersByIdCharacter(Characters charactersByIdCharacter) {
        this.charactersByIdCharacter = charactersByIdCharacter;
    }
}
