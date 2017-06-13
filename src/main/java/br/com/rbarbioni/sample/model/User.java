package br.com.rbarbioni.sample.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "x_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private Integer age;

    private Boolean active;

    private Date createdAt;

    private Date updatedAt;

    protected User() {}

    public User(String name, String email, Integer age) {
        this();
        this.name = name;
        this.email = email;
        this.age = age;
        this.active = true;
        this.createdAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getActive() {
        return active;
    }

    public Integer getAge() {
        return age;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public User applyUpdatedAt(){
        this.updatedAt = new Date();
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).
                append("id", id).
                append("name", name).
                append("email", email).
                append("age", age).
                append("createdAt", createdAt).
                append("updatedAt", updatedAt).
                append("active", active).
                toString();
    }
}