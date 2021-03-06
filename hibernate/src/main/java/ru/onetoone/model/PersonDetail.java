package ru.onetoone.model;

import javax.persistence.*;

@Entity
@Table(name = "person_detail", schema = "one_to_one")
public class PersonDetail {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "youtube_channel")
    private String youtobeChannel;

    @Column(name = "hobby")
    private String hobby;

    // This add for Bi-directional mode
    @OneToOne(mappedBy = "personDetail", cascade = CascadeType.ALL)
    private Person person;

    public PersonDetail() {
    }

    public PersonDetail(String youtobeChannel, String hobby) {
        this.youtobeChannel = youtobeChannel;
        this.hobby = hobby;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYoutobeChannel() {
        return youtobeChannel;
    }

    public void setYoutobeChannel(String youtobeChannel) {
        this.youtobeChannel = youtobeChannel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "PersonDetail{" +
                "id=" + id +
                ", youtobeChannel='" + youtobeChannel + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
