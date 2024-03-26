package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Entrada;
import app.entity.Resultado;

@Service
public class CalculoService {

	public Resultado calcular(Entrada entrada) {
		
		Resultado resultado = new Resultado();
		resultado.setEntrada(entrada);
		resultado.setSoma(this.somar(entrada.getNumeros()));
		
		return resultado;
	}
	
	public double somar(List<Integer> lista) {
		int soma = 0;
		for(int i=0; i< lista.size(); i++) {
			soma += lista.get(i); 
		}
		return soma;
	}


}
