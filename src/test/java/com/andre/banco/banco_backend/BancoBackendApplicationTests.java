package com.andre.banco.banco_backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BancoBackendApplicationTests {

	@Test
	void contextLoads() {
	}
  @Test
  void sumaBasica_deberiaSer4() {
    assertEquals(4, 2 + 2);
  }

  @Test
  void cadenaEmpiezaConA() {
    assertTrue("andres".startsWith("a"));
  }

  @Test
  void listaNoVacia() {
    var list = java.util.List.of(1,2,3);
    assertFalse(list.isEmpty());
  }
}
