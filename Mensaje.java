public class Mensaje {

    private String texto;

    private Contacto destino;
    private Contacto origen;

    public Mensaje(Contacto destino, Contacto origen, String texto){

        if (esValido(destino,origen,texto)){
            this.destino = null;
            this.origen = null;
            this.texto = null;
        }else{
            this.destino = destino;
            this.origen = origen;
            this.texto = texto;
        }

    }

    public boolean esValido(Contacto destino, Contacto origen, String texto){

        return destino.equals(origen) || texto == null || origen.esValidoTelefono(origen.getTelefono())
                || destino.esValidoTelefono(destino.getTelefono());

    }

    public String getTexto() {
        return texto;
    }

    public Contacto getDestino() {
        return destino;
    }

    public Contacto getOrigen() {
        return origen;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "texto='" + texto + '\'' +
                ", destino=" + destino +
                ", origen=" + origen +
                '}';
    }
}
