package com.kodilla.good.patterns.challenges.orderService;

public class MainOrderService {
    public static void main(String[] args){
        CreateUser createUser = new CreateUser();

        UserRecord donaldRecord = createUser.createUserDonald();
        createUser.setOrderDate(donaldRecord);
        createUser.setPaymentDate(donaldRecord);

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new ShoesOrderService(), new OrderRepository());
        productOrderService.process(donaldRecord);

        UserRecord joeRecord = createUser.createUserJoe();
        createUser.setOrderDate(joeRecord);
        createUser.setPaymentDate(joeRecord);

        ProductOrderService productOrderService1 = new ProductOrderService(
                new MailService(), new GameOrderService(), new OrderRepository());
        productOrderService1.process(joeRecord);

        ProductOrderService productOrderService2 = new ProductOrderService(
                new MailService(), new ToysOrderService(), new OrderRepository());
        productOrderService2.process(joeRecord);
    }
}
