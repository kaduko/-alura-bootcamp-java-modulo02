package br.com.alura.livraria.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class LivroDto {

	private String titulo;
	private String email;
	private LocalDate dataLancamento;
	private int quantidadePaginas;
	private String autor;

}
