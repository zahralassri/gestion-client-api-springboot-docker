package com.zl.api.gestion.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zl.api.gestion.client.dto.ClientDto;
import com.zl.api.gestion.client.service.ClientService;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@PostMapping
	public ResponseEntity<ClientDto> create(@RequestBody ClientDto clientDto) {
		ClientDto created = clientService.create(clientDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(created);
	}

	@GetMapping
	public ResponseEntity<List<ClientDto>> getAll() {
		List<ClientDto> clients = clientService.getAll();
		return ResponseEntity.ok(clients);

	}
	@GetMapping("/{id}")
	public ResponseEntity<ClientDto> getOne(@PathVariable Long id){
		ClientDto client =clientService.getOne(id);
		return ResponseEntity.ok(client);
		
	}

	@PatchMapping("/{id}")
	public ResponseEntity<ClientDto> update(@PathVariable Long id, @RequestBody ClientDto clientdto) {

		return ResponseEntity.ok(clientService.update(id, clientdto));

	}
   @DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		clientService.delete(id);
		return ResponseEntity.noContent().build();
	}
	

}
