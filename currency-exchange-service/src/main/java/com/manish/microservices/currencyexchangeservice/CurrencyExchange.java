package com.manish.microservices.currencyexchangeservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;


@Entity(name = "currency_exchange")
public class CurrencyExchange {

    @Id
    private Long id;

    @Column(name="currency_from")
    private String from;

    @Column(name="currency_to")
    private String to;

    private BigDecimal conversionMultiple;
//    private int port;

    private String environment;



    public CurrencyExchange() {

    }


    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

//    public int getPort() {
//        return port;
//    }
//
//    public void setPort(int port) {
//        this.port = port;
//    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

}
