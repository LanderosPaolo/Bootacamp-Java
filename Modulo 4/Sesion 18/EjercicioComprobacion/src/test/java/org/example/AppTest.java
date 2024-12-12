package org.example;

import junit.framework.TestCase;
import org.example.helper.Helper;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test para el consumo de API")
public class AppTest extends TestCase {

    private final Helper helper = new Helper();

    @DisplayName("Test de la conexion a la Api.")
    public void testConexion() {
        assertNotNull(helper.conexionApi());
    }

    @DisplayName("Test del status de la conexion a la Api")
    public void testDelStatus() {
        assertEquals("success", helper.statusConexion(helper.conexionApi()));
    }

    @DisplayName("Test de la latitud")
    public void testLatitud() {
        assertNotNull(helper.infoLat(helper.conexionApi()));
    }

    @DisplayName("Test de la longitud")
    public void testLongitud() {
        assertNotNull(helper.infoLong(helper.conexionApi()));
    }

    @DisplayName("Test del ID de la conexion")
    public void testDelID() {
        assertTrue(helper.idConexion(helper.conexionApi()) > 0);
    }
}
