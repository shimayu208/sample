//package jp.macs.workweb.domain.config;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ThreadFactory;
//import java.util.concurrent.atomic.AtomicInteger;
//
//import javax.jms.ConnectionFactory;
//
//import org.apache.activemq.ActiveMQConnectionFactory;
//import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
//
//
//@Configuration
//public class ActiveMqConf {
//	@Bean
//    @ConfigurationProperties(prefix = "spring.activemq")
//    public ActiveMQConnectionFactory connectionFactory() {
//        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
//        return factory;
//    }
// 
//    @Bean
//    public DefaultJmsListenerContainerFactory myFactory(
//            ConnectionFactory connectionFactory,
//            DefaultJmsListenerContainerFactoryConfigurer configurer) {
//        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//        configurer.configure(factory, connectionFactory);
//        ExecutorService executor = Executors.newCachedThreadPool(new HogeThreadFactory("Consumer-%d"));
//        factory.setTaskExecutor(executor);
//        return factory;
//    }
// 
//    public static class HogeThreadFactory implements ThreadFactory {
//        private final AtomicInteger counter = new AtomicInteger(0);
//        private final String format;
// 
//        private HogeThreadFactory(String format) {
//            this.format = format;
//        }
// 
//        @Override
//        public Thread newThread(Runnable r) {
//            String name = String.format(format, counter.incrementAndGet());
//            return new Thread(null, r, name);
//        }
//    }
//}
