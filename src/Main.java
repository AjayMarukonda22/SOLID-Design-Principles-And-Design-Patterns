import DesignPatterns.BehaviouralDesignPatterns.Observer.EmailSubscriber;
import DesignPatterns.BehaviouralDesignPatterns.Observer.MobileAppSubscriber;
import DesignPatterns.BehaviouralDesignPatterns.Observer.NewsAgency;
import DesignPatterns.BehaviouralDesignPatterns.Observer.SmsSubscriber;
import DesignPatterns.CreationalDesignPatterns.Builder.Pizza;
import DesignPatterns.CreationalDesignPatterns.Prototype.Circle;
import DesignPatterns.CreationalDesignPatterns.Prototype.Shape;
import DesignPatterns.CreationalDesignPatterns.Prototype.ShapeCache;
import DesignPatterns.BehaviouralDesignPatterns.Strategy.GooglePayPayment;
import DesignPatterns.BehaviouralDesignPatterns.Strategy.PaymentProcessor;
import DesignPatterns.StructuralDesignPatterns.Adapter.Paypal;
import DesignPatterns.StructuralDesignPatterns.Adapter.PaypalAdapter;
import DesignPatterns.StructuralDesignPatterns.Decorator.*;
import DesignPatterns.StructuralDesignPatterns.Facade.*;
import DesignPatterns.StructuralDesignPatterns.FlyWeight.StyleFactory;
import DesignPatterns.StructuralDesignPatterns.FlyWeight.TextCharacter;

public class Main {
    public static void main(String[] args) {
//       ExecutorService e = Executors.newFixedThreadPool(4);
//
//       for(int i = 1 ; i <= 10 ; i++) {
//           e.submit(() -> {
//               ConfigurationManager cm = ConfigurationManager.getInstance();
//               System.out.println(cm);
//               System.out.println("currentThread " + Thread.currentThread().getName());
//           });
//       }

        //Builder Dp
           Pizza pizza = Pizza.getBuilder()
                   .setSize("medium")
                   .setCheese(true)
                   .setBacon(true)
                   .setPepperoni(false)
                   .setOlives(true)
                   .addTopping("Mushrooms")
                   .addTopping("chicken")
                   .build();
           System.out.println(pizza.isPepperoni());

       //Factory Dp
//        DesignPatterns.CreationalDesignPatterns.Factory.Notification notification = NotificationFactory.createNotification("Email");
//        System.out.println(notification.sendNotification());

        //Prototype Dp
        Circle circle = new Circle();
        circle.setX(5);
        circle.setY(10);
        circle.setColour("Red");
        circle.setRadius(8);
        System.out.println(circle.toString());


        ShapeCache shapeCache = new ShapeCache();
        shapeCache.registerShape("RedCircle", circle);
        Shape clonedCircle = shapeCache.getShape("RedCircle").clone();
        clonedCircle.setColour("blue");
        System.out.println(clonedCircle.toString());

        //Adapter
        PaypalAdapter paypalAdapter = new PaypalAdapter();
        Paypal paypal = new Paypal(paypalAdapter);
        paypal.sendPayment(1000.20);


        //Facade
        ShoppingFacade shoppingFacade = new ShoppingFacade();

        // Register subsystems
        shoppingFacade.registerOrderPlacedSubscriber(new OrderProcessing());
        shoppingFacade.registerOrderPlacedSubscriber(new InventoryManagement());
        shoppingFacade.registerOrderPlacedSubscriber(new PaymentProcessing());
        shoppingFacade.registerOrderPlacedSubscriber(new Shipping());

        // Place an order
        OrderDto orderDto = new OrderDto("product123", 2, "creditCard123", "123 Main St");
        String result = shoppingFacade.placeAnOrder(orderDto);
        System.out.println(result);


        //Decorator
        Notification notification = new EmailNotification();
        notification = new PushDecorator(notification);
        notification = new SMSDecorator(notification);
        notification.send("Your order is ready to ship");

        //FlyWeight
        TextCharacter textCharacter1 = new TextCharacter('A', StyleFactory.getTextStyle("Italic", 25, "Blue"));
        TextCharacter textCharacter2 = new TextCharacter('B', StyleFactory.getTextStyle("Bold", 45, "Black"));

        textCharacter1.display();
        textCharacter2.display();

        //Strategy Dp
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.setPaymentStrategy(new GooglePayPayment());
        System.out.println(paymentProcessor.makePayment(100000));

        //Observer Dp
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addSubscriber(new EmailSubscriber());
        newsAgency.addSubscriber(new MobileAppSubscriber());
        newsAgency.addSubscriber(new SmsSubscriber());
        newsAgency.notify("Breaking News: Major Tech Event Announced!");
    }
}