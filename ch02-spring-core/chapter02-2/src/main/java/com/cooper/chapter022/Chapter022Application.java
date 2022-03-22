package com.cooper.chapter022;

import com.cooper.chapter022.constructor_bean.Product;
import com.cooper.chapter022.constructor_bean.ShopConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
        includeFilters = {
                @ComponentScan.Filter( // 범위를 지정해서 원하는 빈만 스캔할 수 있음
                        type = FilterType.REGEX,
                        pattern = {
                                "com.cooper.chapter021.constructor_bean.ShopConfiguration"
                        }
                ),
        }
)
public class Chapter022Application {

    public static void main(String[] args) {
        // 3. Constructor 방식
        AnnotationConfigApplicationContext applicationContext3
                = new AnnotationConfigApplicationContext(ShopConfiguration.class);

        Product battery = applicationContext3.getBean("battery", Product.class);
        Product disc = applicationContext3.getBean("disc", Product.class);

        System.out.println(battery);
        System.out.println(disc);
    }

}
