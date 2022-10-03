package sample;

import java.io.IOException;

public class Sushi {
    void wok_sushi() throws IOException {
        Product p = new Product();
        p.parsing(
                "~~~sushiwok",
                "https://sushiwok.ua/vin/menu/sety/",
                "card-wrapper--grid  ",
                "card__name js-content",
                "",
                "itemtype",
                "https://schema.org/priceCurrency"
        );
    }
    /*void yama_sushi() throws IOException {
        Product p = new Product();
        p.parsing(
                "~~~sushiyama",
                "https://yama.vn.ua/shop/sushi-ta-roli/filadelfiya",
                "col-md-4 product-single aos-init",
                "product-single__title__link",
                "",
                "product-single__title__price",
                ""
        );
    }*/


}
