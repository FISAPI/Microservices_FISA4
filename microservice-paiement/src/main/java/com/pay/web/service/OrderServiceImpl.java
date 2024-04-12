package com.pay.web.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${order.service.url}")
    private String orderServiceUrl;

    @Override
    public void updateOrderStatus(int orderId) {
        String url = orderServiceUrl + "/orders/" + orderId;
        restTemplate.put(url, orderId);
    }
}
