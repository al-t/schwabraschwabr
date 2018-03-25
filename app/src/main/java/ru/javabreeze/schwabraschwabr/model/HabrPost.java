package ru.javabreeze.schwabraschwabr.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name="item")
public class HabrPost {

    @Element
    private String title;

    @Element(name="guid")
    private String link;

    @Element
    private String description;

    @Element
    private String pubDate;

    @Element(name="dc:creator")
    private String creator;

    @ElementList(entry="category", inline=true)
    private List<HabrCategory> categories;

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getCreator() {
        return creator;
    }

    public List<HabrCategory> getCategories() {
        return categories;
    }
}
