package br.com.alura.livraria.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.alura.livraria.dto.LivroDto;
import br.com.alura.livraria.dto.LivroFormDto;
import br.com.alura.livraria.modelo.Livro;

@Service
public class LivroService {

	private List<Livro> livros = new ArrayList<>();
	private ModelMapper modelMapper = new ModelMapper();
	
	public List<LivroDto> listar() {
		return livros
				.stream()
				.map(t -> modelMapper.map(t, LivroDto.class))
				.collect(Collectors.toList());
	}

	public void cadastrar(@Valid LivroFormDto dto) {
		Livro livro = modelMapper.map(dto, Livro.class);
		
		livro.setId(this.configuraIdLivro());
		
		livros.add(livro);
	}
	
	private int configuraIdLivro() {
		return new Random().nextInt(999999);
	}

}
