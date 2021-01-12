package com.casestudy.socialnetwork.model.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class User {
    private int userId;
    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    private String gender;
    private String photo;
    private String phone;
    private String mail;
    private String address;
    private String detail;
    private String username;
    private Date createdDate;
    private Date modifyDate;
    private Collection<Emote> emotesByUserId;
    private Collection<Friend> friendsByUserId;
    private Collection<Friend> friendsByUserId_0;
    private Collection<Post> postsByUserId;
    private Collection<UserRole> userRolesByUserId;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "date_of_birth")
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname) && Objects.equals(dateOfBirth, user.dateOfBirth) && Objects.equals(gender, user.gender) && Objects.equals(photo, user.photo) && Objects.equals(phone, user.phone) && Objects.equals(mail, user.mail) && Objects.equals(address, user.address) && Objects.equals(detail, user.detail) && Objects.equals(username, user.username) && Objects.equals(createdDate, user.createdDate) && Objects.equals(modifyDate, user.modifyDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstname, lastname, dateOfBirth, gender, photo, phone, mail, address, detail, username, createdDate, modifyDate);
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<Emote> getEmotesByUserId() {
        return emotesByUserId;
    }

    public void setEmotesByUserId(Collection<Emote> emotesByUserId) {
        this.emotesByUserId = emotesByUserId;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<Friend> getFriendsByUserId() {
        return friendsByUserId;
    }

    public void setFriendsByUserId(Collection<Friend> friendsByUserId) {
        this.friendsByUserId = friendsByUserId;
    }

    @OneToMany(mappedBy = "userByFriendId")
    public Collection<Friend> getFriendsByUserId_0() {
        return friendsByUserId_0;
    }

    public void setFriendsByUserId_0(Collection<Friend> friendsByUserId_0) {
        this.friendsByUserId_0 = friendsByUserId_0;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<Post> getPostsByUserId() {
        return postsByUserId;
    }

    public void setPostsByUserId(Collection<Post> postsByUserId) {
        this.postsByUserId = postsByUserId;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserRole> getUserRolesByUserId() {
        return userRolesByUserId;
    }

    public void setUserRolesByUserId(Collection<UserRole> userRolesByUserId) {
        this.userRolesByUserId = userRolesByUserId;
    }
}
