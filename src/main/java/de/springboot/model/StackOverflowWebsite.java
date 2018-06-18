package de.springboot.model;

public class StackOverflowWebsite {
    private String id;
    private String website;
    private String iconImageUrl;
    private String description;
    private String title;

    public StackOverflowWebsite(String id, String website, String iconImageUrl, String description, String title) {
        this.id = id;
        this.website = website;
        this.iconImageUrl = iconImageUrl;
        this.description = description;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getWebsite() {
        return website;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
}
