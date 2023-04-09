package ru.sin.quotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sin.quotes.models.Chat;

import java.util.Optional;


public interface ChatRepository extends JpaRepository<Chat, Long> {
    Optional<Chat> findByChatIdEquals(long chatId);

}
