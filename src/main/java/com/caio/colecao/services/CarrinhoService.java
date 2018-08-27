package com.caio.colecao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.caio.colecao.domain.Carrinho;
import com.caio.colecao.repositories.CarrinhoRepository;

@Service
public class CarrinhoService {
    
	@Autowired
	private CarrinhoRepository repo;
	
	public Carrinho find(Integer id) {
		
		Carrinho obj = repo.findOne(id);
		return obj;
		
	}
	@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
	public Carrinho insert(Carrinho obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
	public Carrinho update (Carrinho obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
	public void delete(Integer id) {
		find(id);
		repo.delete(id);
	}
	@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
	public List<Carrinho> findAll(){
		return repo.findAll();
	}
}
