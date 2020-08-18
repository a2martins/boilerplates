package br.com.opah.controllers.converter;

import br.com.opah.domain.Github;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StringToGithubDomainConverter {

    @Mapping(target = "login")
    Github toMapper(String login);
}
