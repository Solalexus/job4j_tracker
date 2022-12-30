package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String name;
    private String group;
    private String dataAdmission;
    private Date created;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDataAdmission() {
        return dataAdmission;
    }

    public void setDataAdmission(String dataAdmission) {
        this.dataAdmission = dataAdmission;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
