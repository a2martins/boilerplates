package br.com.opah.integrations.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class GithubResponseDTO {
    private String login;
    private String id;

    @JsonProperty(value = "avatar_url")
    private String avatarUrl;

    @JsonProperty(value = "html_url")
    private String htmlUrl;
    private String name;
    private String company;
    private String location;
    private String bio;
    private String followers;
    private String following;

    @JsonProperty(value = "created_at")
    private String createdAt;
}
