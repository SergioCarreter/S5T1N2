package cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.domain;


import jakarta.persistence.*;

// 1a
@Entity
@Table(name="flores")
public class Flor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @Column(name="NOMBRE")
    private String nombre;

    @Column(name="PAIS")
    private String pais;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
