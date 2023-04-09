package ru.sin.quotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sin.quotes.models.Quote;

import java.util.Optional;


public interface QuoteRepository extends JpaRepository<Quote, Integer> {
    Optional<Quote> findByQuoteIdEquals(Integer quoteId);

}
