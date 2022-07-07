package com.alvaro.study.commons.mappers;

import com.alvaro.study.commons.dto.ClientDto;
import com.alvaro.study.domain.vos.Client;
import com.alvaro.study.outbound.entities.ClientEntity;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;


@Component
public class ClientMapper {

    public ClientDto entityToDto(ClientEntity client) {
        return new ClientDto(client.getId(), client.getName(), client.getSurname(), client.getSecondSurname(), client.getAge(),
                client.getVip(), client.getHistorical(), client.getCart());
    }



    public Client dtoToVos(ClientDto client) {
        return new Client(client.getId(), client.getName(), client.getSurname(), client.getSecondSurname(), client.getAge(),
                client.getVip(), client.getHistorical(), client.getCart());
    }



    public ClientDto vosToDto(Client client) {
        return new ClientDto(client.getId(), client.getName(), client.getSurname(), client.getSecondSurname(), client.getAge(),
                client.getVip(), client.getHistorical(), client.getCart());
    }

    public Client entityToVos(ClientEntity client) {
        return new Client(client.getId(), client.getName(), client.getSurname(), client.getSecondSurname(), client.getAge(),
                client.getVip(), client.getHistorical(), client.getCart());
    }

}
