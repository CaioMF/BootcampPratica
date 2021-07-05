package br.meli.com.linktrack.entity;

import java.util.Objects;

public class Link {

    private String link;
    private String linkId;
    private String pass;
    private int countRedirection = 0;
    private boolean isValid = true;

    public Link(String link, String linkId, String pass) {
        this.link = link;
        this.linkId = linkId;
        this.pass = pass;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getCountRedirection() {
        return countRedirection;
    }

    public void upCountRedirection() {
        this.countRedirection++;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean Valid) {
        isValid = Valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return this.linkId.equals(link.linkId);
    }

}
