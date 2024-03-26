package app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Resultado {

	private Entrada entrada;
	
	private double soma;
	
	private double subtracao;
	
	private double media;
	
	private double maior;
	
	private double menor;

}
