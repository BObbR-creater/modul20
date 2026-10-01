package example.service;

import example.model.SocialNetwork;

public interface SocialNetworkService {

    void createSocialNetwork(SocialNetwork socialNetwork);

    SocialNetwork getSocialNetwork(Long id);

    void deleteSocialNetwork(Long id);
}