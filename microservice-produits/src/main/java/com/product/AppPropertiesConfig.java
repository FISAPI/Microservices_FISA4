package com.product;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
public class AppPropertiesConfig  {

    private int limitDeProduits;

    public int getLimitDeProduits()
    {

        return limitDeProduits;

    }

    public void setLimitDeProduits(int limitDeProduits)
    {
        this.limitDeProduits = limitDeProduits;
    }

}
