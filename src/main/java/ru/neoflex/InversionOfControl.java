package ru.neoflex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.neoflex.repository.OrderRepository;
import ru.neoflex.service.OrderService;

/**
 * InversionOfControl.
 *
 * @author nanikeev
 */
public class InversionOfControl {

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context-config.xml");
        OrderService orderService = context.getBean(OrderService.class);
        orderService.createNew(1L);
    }
}
