package br.com.opah.integrations.converter;

import br.com.opah.domain.Github;
import br.com.opah.domain.Github.GithubBuilder;
import br.com.opah.integrations.dto.GithubResponseDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-08T10:40:05-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.5 (JetBrains s.r.o)"
)
@Component
public class GithubResponseDTOTOGithubDomainConverterImpl implements GithubResponseDTOTOGithubDomainConverter {

    @Override
    public Github toMapper(GithubResponseDTO responseDTO) {
        if ( responseDTO == null ) {
            return null;
        }

        GithubBuilder github = Github.builder();

        github.login( responseDTO.getLogin() );
        github.id( responseDTO.getId() );
        github.avatarUrl( responseDTO.getAvatarUrl() );
        github.htmlUrl( responseDTO.getHtmlUrl() );
        github.name( responseDTO.getName() );
        github.company( responseDTO.getCompany() );
        github.location( responseDTO.getLocation() );
        github.bio( responseDTO.getBio() );
        github.followers( responseDTO.getFollowers() );
        github.following( responseDTO.getFollowing() );
        github.createdAt( responseDTO.getCreatedAt() );

        return github.build();
    }
}
