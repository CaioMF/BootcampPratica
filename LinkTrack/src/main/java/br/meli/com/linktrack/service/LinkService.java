package br.meli.com.linktrack.service;

import br.meli.com.linktrack.dto.LinkDTO;
import br.meli.com.linktrack.entity.Link;
import br.meli.com.linktrack.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class LinkService {

    final LinkRepository linkRepository;

    @Autowired
    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public String create(Link link){

        if (link.getLink().startsWith("https://")) {
            return linkRepository.create(link);
        }

        link.setLink("https://" + link.getLink());

        return linkRepository.create(link);
    }

    public LinkDTO find(String linkId, String pass){

        Link link = linkRepository.find(linkId);

        if(link.getPass() == null){
            link.upCountRedirection();
            return LinkDTO.convert(link);
        }

        if(!pass.equals(link.getPass())){
            throw new IllegalArgumentException("Senha inválida!");
        }

        link.upCountRedirection();
        return LinkDTO.convert(link);
    }

    public void sofDelete(String linkId){
        linkRepository.softDelete(linkId);
    }

    public List<LinkDTO> getLinks(){
        return LinkDTO.convert(linkRepository.getLinks());
    }

    public int getCount(String linkId){
        return linkRepository.getCount(linkId);
    }
}
