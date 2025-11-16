package com.zl.api.gestion.client.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.zl.api.gestion.client.dto.ClientDto;
import com.zl.api.gestion.client.entity.Client;
import com.zl.api.gestion.client.exceptions.ClientNotFoundException;
import com.zl.api.gestion.client.mapper.ClientMapper;
import com.zl.api.gestion.client.repository.*;

import jakarta.persistence.EntityNotFoundException;
@Service
public class ClientServiceImpl implements ClientService{
	
	private final ClientRepository clientRepository;
	private final ClientMapper clientMapper;
	

	public ClientServiceImpl(ClientRepository clientRepository,ClientMapper clientMapper) {
		this.clientRepository = clientRepository;
		this.clientMapper=clientMapper;
	}

	@Override
	public ClientDto create(ClientDto clientDto) {	
        Client client=clientMapper.toEntity(clientDto);
        Client saved =clientRepository.save(client);
		return clientMapper.toDto(saved);
	}

	@Override
	public ClientDto getOne(Long id) {
		Client client = clientRepository.findById(id)
				.orElseThrow( () -> new EntityNotFoundException("Le client avec id : "+id+" non trouvé"));
		return clientMapper.toDto(client);
	}

	@Override
	public List<ClientDto> getAll() {
		List<Client> clients =clientRepository.findAll();		
		return clients.stream().map(clientMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public void delete(Long id) {
	if(!clientRepository.existsById(id)) {
		throw new ClientNotFoundException("Client avec ID \" + id + \" non trouvé\"");	
	 }
	    clientRepository.deleteById(id);
		
	}

	@Override
	public ClientDto update(Long id,ClientDto clientdto) {
		Client client =clientRepository.findById(id).orElseThrow( () -> new EntityNotFoundException("Le client avec id : "+ id +" est introuvable"));
		clientMapper.updateClientfromDto(clientdto, client);
		return clientMapper.toDto(clientRepository.save(client));
	}
	
	
	

}
