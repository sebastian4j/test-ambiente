package com.sebastian.test.ambiente;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * permite validar las variables de ambiente definidas en el pom.
 *
 * @author Sebastián Ávila A.
 */
public class TestVariablesAmbiente {

  /**
   * variables definidas en el ambiente, en linux export clave1=valor1.
   */
  @Test
  public void variablesDeAmbienteDefinidas() {
    assertThat(System.getenv("clave1")).isEqualTo("valor1");
    assertThat(System.getenv("clave2")).isEqualTo("valor2");
    assertThat(System.getenv("clave3")).isEqualTo("valor3");
  }

  /**
   * variables definidas en la forma -Dclave4=valor4.
   */
  @Test
  public void propiedadesDefinidas() {
    assertThat(System.getProperty("clave4")).isEqualTo("valor4");
    assertThat(System.getProperty("clave5")).isEqualTo("valor5");
    assertThat(System.getProperty("clave6")).isEqualTo("valor6");
  }
}
