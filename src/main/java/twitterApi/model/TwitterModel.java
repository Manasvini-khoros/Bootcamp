package twitterApi.model;

import java.util.Date;

public class TwitterModel {

    private String info;
    private String name;
    private String id;
    private String profileUrl;
    private String createDate;


    public TwitterModel() {

    }

    public TwitterModel(String info, String name, String id, String profileUrl, String createDate) {
        this.info = info;
        this.name = name;
        this.id = id;
        this.profileUrl = profileUrl;
        this.createDate = createDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "TwitterModel{" +
                "info='" + info + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", profileUrl='" + profileUrl + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}

