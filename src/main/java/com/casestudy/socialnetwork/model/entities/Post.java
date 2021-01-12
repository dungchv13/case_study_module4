package com.casestudy.socialnetwork.model.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Post {
    private int postId;
    private String title;
    private Date createdDate;
    private Date modifyDate;
    private String content;
    private String photo;
    private String video;
    private String description;
    private Integer commentId;
    private int userId;
    private Collection<Emote> emotesByPostId;
    private Post postByCommentId;
    private Collection<Post> postsByPostId;
    private User userByUserId;

    @Id
    @Column(name = "post_id")
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "created_date")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "modify_date")
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "video")
    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "comment_id",insertable = false,updatable = false)
    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "user_id",insertable = false,updatable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return postId == post.postId && userId == post.userId && Objects.equals(title, post.title) && Objects.equals(createdDate, post.createdDate) && Objects.equals(modifyDate, post.modifyDate) && Objects.equals(content, post.content) && Objects.equals(photo, post.photo) && Objects.equals(video, post.video) && Objects.equals(description, post.description) && Objects.equals(commentId, post.commentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, title, createdDate, modifyDate, content, photo, video, description, commentId, userId);
    }

    @OneToMany(mappedBy = "postByPostId")
    public Collection<Emote> getEmotesByPostId() {
        return emotesByPostId;
    }

    public void setEmotesByPostId(Collection<Emote> emotesByPostId) {
        this.emotesByPostId = emotesByPostId;
    }

    @ManyToOne
    @JoinColumn(name = "comment_id", referencedColumnName = "post_id")
    public Post getPostByCommentId() {
        return postByCommentId;
    }

    public void setPostByCommentId(Post postByCommentId) {
        this.postByCommentId = postByCommentId;
    }

    @OneToMany(mappedBy = "postByCommentId")
    public Collection<Post> getPostsByPostId() {
        return postsByPostId;
    }

    public void setPostsByPostId(Collection<Post> postsByPostId) {
        this.postsByPostId = postsByPostId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
