package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

interface OrderService {
    boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
