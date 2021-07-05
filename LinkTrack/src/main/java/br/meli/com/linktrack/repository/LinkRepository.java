package br.meli.com.linktrack.repository;

import br.meli.com.linktrack.entity.Link;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Repository
public class LinkRepository {

    private List<Link> links = new ArrayList<>();

    public List<Link> getLinks() {
        return links.stream().filter(Link::isValid).collect(Collectors.toList());
    }

    public String create(Link link)  {
        link.setLinkId("linkgen" + (links.size()+1));
        links.add(link);
        return link.getLinkId();
    }

    public Link find(String linkId){
        return this.links.stream().filter(l -> l.getLinkId().equals(linkId) && l.isValid()).findFirst().orElseThrow(NoSuchElementException::new);
    }

    public void softDelete(String linkId) {
        find(linkId).setValid(false);
    }

    public int getCount(String linkId){
        return find(linkId).getCountRedirection();
    }


}
