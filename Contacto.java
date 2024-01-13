import java.util.Objects;

public class Contacto {

    private String nombre;
    private int telefono;
    private String email;


    public Contacto(String nombre, int telefono, String email){
        this.nombre = nombre;
        if (esValidoTelefono(telefono)){
            this.telefono = telefono;
        }else{
            this.telefono = 0;
        }
        this.email = email;
    }

    public Contacto(String nombre, int telefono){
        this.nombre = nombre;
        if (esValidoTelefono(telefono)){
            this.telefono = telefono;
        }else{
            this.telefono = 0;
        }
        this.email = null;      // email es opcional
    }


    public boolean esValidoTelefono(int telefono){
        return telefono > 0;
    }


    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return telefono == contacto.telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                '}';
    }
}
