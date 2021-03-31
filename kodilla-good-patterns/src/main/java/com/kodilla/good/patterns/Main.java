package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.Food2Door.*;
import com.kodilla.good.patterns.challenges.flights.Flight;
import com.kodilla.good.patterns.challenges.flights.FlightBase;
import com.kodilla.good.patterns.challenges.flights.FlightSearch;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        FlightSearch.flightFrom(Flight.getKATOWICE());
        FlightSearch.flightFrom(Flight.getBYDGOSZCZ());

        FlightSearch.flightTo(Flight.getKATOWICE());
        FlightSearch.flightTo(Flight.getWROCLAW());

        FlightSearch.flightTransfer(Flight.getKATOWICE(),Flight.getWROCLAW());
///////////////////////////////////////////////////
//        Supply supply = new Supply();
//        supply.deliveryOfGoods();
//        supply.printDeliveryOfGoods();
//


///////////////////
        //  String allMovies = MovieStore.getMovies().entrySet().stream()
        //         .flatMap(stringListEntry -> stringListEntry.getValue().stream())
        //        .collect(Collectors.joining("!", " ", " "));

        // System.out.println(allMovies);
////////////////
//        CreateUser createUser = new CreateUser();
//
//        UserRecord donaldRecord = createUser.createUserDonald();
//        createUser.setOrderDate(donaldRecord);
//        createUser.setPaymentDate(donaldRecord);
//
//        ProductOrderService productOrderService = new ProductOrderService(
//                new MailService(), new ShoesOrderService(), new OrderRepository());
//        productOrderService.process(donaldRecord);
//
//        UserRecord joeRecord = createUser.createUserJoe();
//        createUser.setOrderDate(joeRecord);
//        createUser.setPaymentDate(joeRecord);
//
//        ProductOrderService productOrderService1 = new ProductOrderService(
//                new MailService(), new GameOrderService(), new OrderRepository());
//        productOrderService1.process(joeRecord);
//
//        ProductOrderService productOrderService2 = new ProductOrderService(
//                new MailService(), new ToysOrderService(), new OrderRepository());
//        productOrderService2.process(joeRecord);
    }
}
