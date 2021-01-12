package com.casestudy.socialnetwork.model.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Friend {
    private int id;
    private int userId;
    private int friendId;
    private String status;
    private User userByUserId;
    private User userByFriendId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id",insertable = false,updatable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "friend_id",insertable = false,updatable = false)
    public int getFriendId() {
        return friendId;
    }

    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return id == friend.id && userId == friend.userId && friendId == friend.friendId && Objects.equals(status, friend.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, friendId, status);
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "friend_id", referencedColumnName = "user_id", nullable = false)
    public User getUserByFriendId() {
        return userByFriendId;
    }

    public void setUserByFriendId(User userByFriendId) {
        this.userByFriendId = userByFriendId;
    }
}
