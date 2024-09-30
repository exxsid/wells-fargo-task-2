package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @Column(nullable = false)
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    public Portfolio(Client client, LocalDateTime creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
