package app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculoServiceTest {
	
	@Autowired
	CalculoService calculoService;

	@Test
	@DisplayName("Testando soma")
	void somarTest() {
		
		List<Integer> lista = new ArrayList<>();
		lista.add(5);
		lista.add(3);
		lista.add(1);
		
		double soma = calculoService.somar(lista);
		
		assertEquals(9, soma);
	}
	
	@Test
	@DisplayName("Testando um erro")
	void somarTest2() {
		
		List<Integer> lista = new ArrayList<>();
		lista.add(5);
		lista.add(3);
		lista.add(null);
			
		assertThrows(Exception.class, () -> {
			calculoService.somar(lista);
		});
	}

}
