package sample;

import java.io.IOException;

public class Pizza{
    void express_pizza() throws IOException {
        Product p = new Product();
        p.parsing(
                "~~~Express-pizza",
                "https://express-pizza.vn.ua/catalog/pitstsa/",
                "col-lg-3 col-xl-3 col-sm-6 product-ajax-cont ",
                "itemprop",
                "name",
                "itemprop",
                "price"
        );
    }
    void la_ua_pizza() throws IOException {
        Product p = new Product();
        p.parsing(
                "~~~La-ua-Vinnytsya",
                "https://la.ua/vinnytsya/",
                "col-md-6 col-lg-4",
                "productTitle h5",
                "",
                "productPrice",
                ""
        );
    }
    void prontop_pizza() throws IOException {
        Product p = new Product();
        p.parsing(
                "~~~Prontop-pizza",
                "https://prontopizza.ua/vinnytsia/product-category/pizza/",
                "col-12 col-lg-4 col-xl-3 col-sm-6 product_wrapp",
                "product_title",
                "",
                "price",
                ""
        );
    }
}
