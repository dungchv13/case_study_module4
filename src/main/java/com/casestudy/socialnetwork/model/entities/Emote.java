package com.casestudy.socialnetwork.model.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Emote {
    private int likeId;
    private int userId;
    private int postId;
    private User userByUserId;
    private Post postByPostId;

    @Id
    @Column(name = "like_id")
    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
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
    @Column(name = "post_id",insertable = false,updatable = false)
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emote emote = (Emote) o;
        return likeId == emote.likeId && userId == emote.userId && postId == emote.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(likeId, userId, postId);
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
    @JoinColumn(name = "post_id", referencedColumnName = "post_id", nullable = false)
    public Post getPostByPostId() {
        return postByPostId;
    }

    public void setPostByPostId(Post postByPostId) {
        this.postByPostId = postByPostId;
    }
}
