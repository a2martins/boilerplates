package br.com.opah.controllers.converter;

import br.com.opah.domain.Github;
import br.com.opah.domain.Github.GithubBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-08T10:40:07-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.5 (JetBrains s.r.o)"
)
@Component
public class StringToGithubDomainConverterImpl implements StringToGithubDomainConverter {

    @Override
    public Github toMapper(String login) {
        if ( login == null ) {
            return null;
        }

        GithubBuilder github = Github.builder();

        github.login( login );

        return github.build();
    }
}
