package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item = new Item(new BigDecimal(10),5,new BigDecimal(20));
        Item item2 = new Item(new BigDecimal(20),8,new BigDecimal(30));
        Invoice invoice = new Invoice("Nr 177/05/2020");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);

        Product product = new Product("Pencils");

        product.getItemList().add(item);
        product.getItemList().add(item2);

        item.setProduct(product);
        item2.setProduct(product);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0,id);

        //CleanOp
        invoiceDao.deleteAll();
    }
}
