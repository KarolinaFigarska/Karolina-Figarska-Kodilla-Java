package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

interface Repository {
    boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}
