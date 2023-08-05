package br.com.senai.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		try {
			Produto produto = produtoRepository.findById(id).get();
			return ResponseEntity.status(HttpStatus.FOUND).body(produto);
			
		} catch (NoSuchElementException e){
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}

	@PostMapping("/criarProduto")
	public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
		produtoRepository.save(produto);
		return ResponseEntity.status(HttpStatus.CREATED).body(produto);
	}
	
	@PutMapping("/atualizarProduto/{id}")
	public ResponseEntity<Produto> atualizarProduto(@PathVariable Long id, @RequestBody Produto produto){
		return produtoRepository.findById(id)
				.map(gravado -> {
					gravado.setNome(produto.getNome());
					gravado.setCategoria(produto.getCategoria());
					gravado.setQuantidade(produto.getQuantidade());
					gravado.setPreco(produto.getPreco());
					Produto atualizado = produtoRepository.save(gravado);
					return ResponseEntity.status(HttpStatus.OK).body(atualizado);
				}).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@DeleteMapping("/excluirProduto/{id}")
	public ResponseEntity<Void> excluirProduto(@PathVariable Long id){
		return produtoRepository.findById(id)
				.map(gravado -> {
					produtoRepository.deleteById(id);
					return ResponseEntity.status(HttpStatus.NO_CONTENT).<Void>build();
				})
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
		
	}
}
