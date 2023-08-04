package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.model.Produto;
import br.com.senai.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	/*
	 * @GetMapping public String olaSpring() { return "Hello Spring!"; }
	 */
	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping
	public ResponseEntity<List<Produto>> listarProdutos() {
		List<Produto> produtos = produtoRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(produtos);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> listarProdutoPorId(@PathVariable Long id){
		Produto produto = produtoRepository.findById(id).get();
		return ResponseEntity.status(HttpStatus.FOUND).body(produto);
	}

	@PostMapping("/criarProduto")
	public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
		produtoRepository.save(produto);
		return ResponseEntity.status(HttpStatus.CREATED).body(produto);
	}
	
	@DeleteMapping("/excluirProduto")
	public void excluirProduto(@PathVariable Long id){
		produtoRepository.deleteById(id);
		
	}
}
