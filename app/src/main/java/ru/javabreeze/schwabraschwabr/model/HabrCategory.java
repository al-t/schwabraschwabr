package ru.javabreeze.schwabraschwabr.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="category")
class HabrCategory {

    @Element
    private String category;

    public String getCategory() {
        return category;
    }
}
