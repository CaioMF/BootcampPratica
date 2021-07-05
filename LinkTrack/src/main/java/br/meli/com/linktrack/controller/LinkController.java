package br.meli.com.linktrack.controller;

import br.meli.com.linktrack.dto.LinkDTO;
import br.meli.com.linktrack.entity.Link;
import br.meli.com.linktrack.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class LinkController {

    final LinkService linkService;

    @Autowired
    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping
    public List<LinkDTO> getLinks(){
        return linkService.getLinks();
    }

    @PostMapping
    public String create(@RequestBody Link link){
        return linkService.create(link);
    }

    @PostMapping("/link/{linkId}")
    public ResponseEntity<Void> find(@PathVariable String linkId, @RequestBody Link link){

        LinkDTO l = linkService.find(linkId,link.getPass());
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(l.getLink())).build();

    }

    @PostMapping("/invalid/{linkId}")
    public void invalidate(@PathVariable String linkId){
        linkService.sofDelete(linkId);
    }

    @GetMapping("/metrics/{linkId}")
    public int getLinks(@PathVariable String linkId){
        return linkService.getCount(linkId);
    }



}
