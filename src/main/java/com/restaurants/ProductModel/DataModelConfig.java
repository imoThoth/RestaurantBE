package com.restaurants.ProductModel;

import com.restaurants.ProductRepository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class DataModelConfig {


    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository){
            return args -> {
        Product prod1 = new Product(
                 1,
                "Cheese & Chive Fully Loaded Potato Skin",
                5.25,
                "https://res.cloudinary.com/dv2felbpj/image/upload/v1646100374/chips_lwwnyw.jpg",
                51);

                Product prod2 = new Product(2,
                        "Meatballs with Salad and Assorted Sauces",
                        3.99,
                        "https://res.cloudinary.com/dv2felbpj/image/upload/v1646100375/falafel_xdeq37.jpg",
                        50);

                Product prod3 = new Product( 3,
                        "Slow Roasted Salmon with Freshly Picked Spinach Orzo Salad",
                        5.50,
                        "https://res.cloudinary.com/dv2felbpj/image/upload/v1646100375/slowcookedsalmon_rquoea.jpg",
                        35);

                Product prod4 = new Product(4,
                        "Chocolate Drizz Vanlla Ice Cream with Hand Picked Strawberries",
                        6.50,
                        "https://res.cloudinary.com/dv2felbpj/image/upload/v1646100374/chocicecream_h412bw.jpg",
                        80);

                Product prod5 = new Product(5,
                        "Slow Brew Cortado with Alternative Milk",
                        3.50,
                        "https://res.cloudinary.com/dv2felbpj/image/upload/v1646100374/cortado_c4bo5j.jpg",
                        200);

                Product prod6 = new Product(6,
                        "Raspberry Submerged White Russian",
                        9.99,
                        "https://res.cloudinary.com/dv2felbpj/image/upload/v1646100375/crembasedraspberry_hoyvtv.jpg",
                        30);

                Product prod7 = new Product(7,
                        "Multi Freckle Chocolate Doghnuts",
                        5.20,
                        "https://res.cloudinary.com/dv2felbpj/image/upload/v1646100375/doghnuts_iwcvpe.jpg",
                        40);

                Product prod8 = new Product(8,
                         "Chocolate Caramel Glazed Vanilla Ice-Cream with Hot Brownie and Crisp Wafers",
                        10.25,
                        "https://res.cloudinary.com/dv2felbpj/image/upload/v1646100375/drizeicecream_pog7bq.jpg",
                        66);

                Product prod9 = new Product(9,
                        "Ginger Flat White",
                        5.00,
                        "https://res.cloudinary.com/dv2felbpj/image/upload/v1646100375/gingerflatwhite_mutcbi.jpg",
                        120);

                Product prod10 = new Product( 10,
                        "10inch Wood Smoked Peperoni Pizza",
                        13.99,
                        "https://res.cloudinary.com/dv2felbpj/image/upload/v1646100374/multiflavpizza_sewggd.jpg",
                        121);

                Product prod11 = new Product(11,
                       "Fluffy Pancakes with Canadian Maple Syrup and Egyptian Blueberries",
                       15.99,
                        "https://res.cloudinary.com/dv2felbpj/image/upload/v1646100374/pancakedlight_c0fw4q.jpg", 51);

                Product prod12 = new Product(12,
                        "Amuse-bouche",
                        1.50,
                        "https://res.cloudinary.com/dv2felbpj/image/upload/v1646100375/prawnveglem_czw6sm.jpg",
                        90);



                repository.saveAll(
                List.of(prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod10, prod11, prod12)
        );
    };
}
}
