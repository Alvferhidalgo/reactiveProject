package com.alvaro.study.commons.mappers;

import com.alvaro.study.commons.dto.ClientDto;
import com.alvaro.study.domain.vos.Client;
import com.alvaro.study.outbound.entities.ClientEntity;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;


@Component
@AllArgsConstructor
public class ClientMapper {

    private final ProductMapper productMapper;

    public ClientDto entityToDto(ClientEntity client) {
        return new ClientDto(client.getId(), client.getName(), client.getSurname(), client.getSecondSurname(), client.getAge(),
                client.getVip(), client.getHistorical().stream().map(productMapper::entityToDto).collect(Collectors.toList()),
                client.getCart().stream().map(productMapper::entityToDto).collect(Collectors.toList()));
    }


    public Client dtoToVos(ClientDto client) {
        return new Client(client.getId(), client.getName(), client.getSurname(), client.getSecondSurname(), client.getAge(),
                client.getVip(), client.getHistorical().stream().map(productMapper::dtoToVos).collect(Collectors.toList()),
                client.getCart().stream().map(productMapper::dtoToVos).collect(Collectors.toList()));
    }


    public ClientDto vosToDto(Client client) {
        return new ClientDto(client.getId(), client.getName(), client.getSurname(), client.getSecondSurname(), client.getAge(),
                client.getVip(), client.getHistorical().stream().map(productMapper::vosToDto).collect(Collectors.toList()),
                client.getCart().stream().map(productMapper::vosToDto).collect(Collectors.toList()));
    }

    public Client entityToVos(ClientEntity client) {
        return new Client(client.getId(), client.getName(), client.getSurname(), client.getSecondSurname(), client.getAge(),
                client.getVip(), client.getHistorical().stream().map(productMapper::entityToVos).collect(Collectors.toList()),
                client.getCart().stream().map(productMapper::entityToVos).collect(Collectors.toList()));
    }

}
