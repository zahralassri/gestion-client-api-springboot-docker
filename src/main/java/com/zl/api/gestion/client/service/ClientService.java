package com.zl.api.gestion.client.service;

import java.util.List;

import com.zl.api.gestion.client.dto.ClientDto;

public interface ClientService {
	
	ClientDto create(ClientDto clientDto);
	
	ClientDto getOne(Long id);
	
	List<ClientDto> getAll();
	
	void delete (Long id);
	
	ClientDto update (Long id,ClientDto clientdto);

}
