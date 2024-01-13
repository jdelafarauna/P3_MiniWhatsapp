import java.util.ArrayList;

public class MiMiniWhatsapp {

    ArrayList<Mensaje> mensajes;


    public MiMiniWhatsapp(){

        this.mensajes = new ArrayList<>(100);

    }

    public void añadir(Mensaje mensaje){

        if(esValido(mensaje)) {
            mensajes.add(mensaje);
        }else{
            throw new RuntimeException("La informacion del mensaje no es valida, comperuebe los datos.");
        }

    }

    public void añadir(Contacto destino , Contacto origen, String texto){

        Mensaje mensaje = new Mensaje (destino,origen,texto);
        if(esValido(mensaje)) {
            mensajes.add(mensaje);
        }else{
            throw new RuntimeException("La informacion del mensaje no es valida, comperuebe los datos.");
        }

    }

    private boolean esValido(Mensaje mensaje){
        return mensaje.esValido(mensaje.getDestino(),mensaje.getOrigen(),mensaje.getTexto());
    }

    @Override
    public String toString() {
        return "MiMiniWhatsapp{" +
                "mensajes=" + mensajes +
                '}';
    }
}
