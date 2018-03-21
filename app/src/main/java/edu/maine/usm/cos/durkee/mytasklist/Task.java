package edu.maine.usm.cos.durkee.mytasklist;

import java.util.Date;

/**
 * Created by bdurks on 3/11/2018.
 */

public class Task implements Comparable<Task> {
    private String  title;
    private String  des;
    private Date dueDate;
    private String  category;
    private int     notificationId;
// getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return des;
    }

    public void setDesc(String desc) {
        this.des = desc;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public Task(String title, String desc, Date dueDate, int notificationId, String category) {
        this.title = title;
        this.des = desc;
        this.dueDate = dueDate;
        this.category = category;
        this.notificationId = notificationId;
    }

    @Override
    public int compareTo(Task a) {
        return getDueDate().compareTo(a.getDueDate());
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Task))
            return false;
        Task other = (Task) obj;
        return notificationId == other.getNotificationId();
    }
}