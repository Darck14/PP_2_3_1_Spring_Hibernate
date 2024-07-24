package ru.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String sername;

    @Column
    private String sex;

    public User() {}

    public User(String name, String sername, String sex) {
        this.name = name;
        this.sername = sername;
        this.sex = sex;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" + id + "}\n"+
                "name='" + name + '\'' +
                "sername='" + sername + '\'' +
                "sex='" + sex + '\''
                ;
    }
}
