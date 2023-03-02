import modelos.Restaurante;
import utilidades.UtilidadesRestaurante;

import java.time.LocalTime;

public class TestRestaurante {
    public static void main(String[] args) {
        Restaurante restaurante1 =  new Restaurante();
        restaurante1.setNombre("La Gorda de Calatrava");
        restaurante1.setLocalizacion("Sevilla");
        restaurante1.setHora_apertura(LocalTime.parse("08:00:00"));
        restaurante1.setHora_cierre(LocalTime.parse("16:30:00"));

        System.out.println(UtilidadesRestaurante.nombreAPoner(restaurante1));

    }
}
