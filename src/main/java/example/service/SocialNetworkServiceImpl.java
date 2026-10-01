package example.service;

import example.model.SocialNetwork;
import example.repository.SocialNetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialNetworkServiceImpl implements SocialNetworkService {

    @Autowired
    private SocialNetworkRepository socialNetworkRepository;

    @Override
    public void createSocialNetwork(SocialNetwork socialNetwork) {
        socialNetworkRepository.save(socialNetwork);
    }

    @Override
    public SocialNetwork getSocialNetwork(Long id) {
        return socialNetworkRepository.get(id);
    }

    @Override
    public void deleteSocialNetwork(Long id) {
        socialNetworkRepository.delete(id);
    }
}