package com.algawork.patrimonio.resouce;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algawork.patrimonio.model.item;
import com.algawork.patrimonio.repository.itemRepository;

//import antlr.collections.List;

@RestController
@CrossOrigin("${origem-permitida}")
public class ItemResource {
	
	@Autowired
	private  itemRepository itemrepositoty;
	
	@GetMapping("/itens")
	public List<item> listar(){
		return itemrepositoty.findAll();
	}
	
	@PostMapping("/itens")
	public item adicionar(@RequestBody @Valid item itens) {
		return itemrepositoty.save(itens);
	}
		
}
