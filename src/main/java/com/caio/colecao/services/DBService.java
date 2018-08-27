package com.caio.colecao.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caio.colecao.domain.Carrinho;
import com.caio.colecao.repositories.CarrinhoRepository;

@Service
public class DBService {

	
	
	@Autowired
	private CarrinhoRepository carrinhoRepository;
	
	public void instantiateTestDatabase() throws ParseException {
		
		Carrinho cat1 = new Carrinho(null, "Mach5", null, null, null,null);
	
		
		
		
		
		
		
	
				
		carrinhoRepository.save(Arrays.asList(cat1));
			
	}
}