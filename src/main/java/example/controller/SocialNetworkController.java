package example.controller;

import example.model.SocialNetwork;
import example.service.SocialNetworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/social-network")
public class SocialNetworkController {

    @Autowired
    private SocialNetworkService socialNetworkService;

    @PostMapping
    public ResponseEntity<SocialNetwork> saveSocialNetwork(@RequestBody SocialNetwork socialNetwork) {
        socialNetworkService.createSocialNetwork(socialNetwork);
        return new ResponseEntity<>(socialNetwork, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SocialNetwork> getSocialNetwork(@PathVariable Long id) {
        SocialNetwork socialNetwork = socialNetworkService.getSocialNetwork(id);
        if (socialNetwork == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(socialNetwork, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSocialNetwork(@PathVariable Long id) {
        socialNetworkService.deleteSocialNetwork(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}