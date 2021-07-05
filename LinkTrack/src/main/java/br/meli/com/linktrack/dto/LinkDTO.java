package br.meli.com.linktrack.dto;

import br.meli.com.linktrack.entity.Link;

import java.util.List;
import java.util.stream.Collectors;

public class LinkDTO {

    private String link;
    private String linkId;

    public LinkDTO(String link, String linkId) {
        this.link = link;
        this.linkId = linkId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public static LinkDTO convert(Link link){
        return new LinkDTO(link.getLink(), link.getLinkId());
    }

    public static List<LinkDTO> convert(List<Link> links){
        return links.stream().map(LinkDTO::convert).collect(Collectors.toList());
    }

}
