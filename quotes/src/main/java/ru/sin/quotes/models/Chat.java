package ru.sin.quotes.models;
import javax.persistence.*;

@Entity
@Table(name="\"Chats\"")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "\"chatId\"", nullable = false)
    private long chatId;

    @Column(name = "\"lastId\"", nullable = false)
    private Integer lastId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public Integer getLastId() {
        return lastId;
    }

    public void setLastId(Integer lastId) {
        this.lastId = lastId;
    }
}
