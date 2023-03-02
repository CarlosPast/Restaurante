package utilidades;

import modelos.Restaurante;

public class UtilidadesRestaurante {
    public static String nombreAPoner(Restaurante restaurantito){
        String nombre = restaurantito.getNombre();
        String localizar = restaurantito.getLocalizacion();
        String hora = restaurantito.getHora_apertura().toString();
        String hora2 = restaurantito.getHora_cierre().toString();
        return nombre +" (" + localizar + "). " + "Nuestro establecimiento abre a las " + hora + " y cierra a las " + hora2 + ".";
    }
    public static void calcularAforo(Restaurante restaurantito){
        restaurantito.setAforo(restaurantito.getDimensiones() * 1.5);
    }

}
