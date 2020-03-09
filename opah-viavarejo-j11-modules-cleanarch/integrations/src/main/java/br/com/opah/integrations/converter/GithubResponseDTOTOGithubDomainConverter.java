package br.com.opah.integrations.converter;

import br.com.opah.domain.Github;
import br.com.opah.integrations.dto.GithubResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GithubResponseDTOTOGithubDomainConverter {
    Github toMapper(GithubResponseDTO responseDTO);
}
