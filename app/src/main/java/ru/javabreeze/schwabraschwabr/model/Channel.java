package ru.javabreeze.schwabraschwabr.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name="channel")
public class Channel {

    @Element(name="title")
    private String title;

    @Element(name="link")
    private String link;

    @Element(name="description")
    private String description;

    @ElementList(entry="item")
    private List<HabrPost> list;

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public List<HabrPost> getList() {
        return list;
    }
}
