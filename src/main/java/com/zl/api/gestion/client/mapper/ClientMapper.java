package com.zl.api.gestion.client.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.zl.api.gestion.client.dto.ClientDto;
import com.zl.api.gestion.client.entity.Client;

@Mapper(componentModel = "spring")
public interface ClientMapper {
	
	ClientDto toDto (Client client);
	Client toEntity (ClientDto dto);
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	Client updateClientfromDto(ClientDto dto,@MappingTarget Client entity);
	
}
