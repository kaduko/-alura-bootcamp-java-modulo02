package br.com.alura.livraria.modelo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Livro {

	private int id;
	private String titulo;
	private String email;
	private LocalDate dataLancamento;
	private int quantidadePaginas;
	private String autor;

}
