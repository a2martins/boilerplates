package br.com.opah.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Github {
    private String login;
    private String id;
    private String avatarUrl;
    private String htmlUrl;
    private String name;
    private String company;
    private String location;
    private String bio;
    private String followers;
    private String following;
    private String createdAt;
}
