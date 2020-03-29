package onlineShop.log;

import org.springframework.stereotype.Component;

@Component(value = "serverLogger")
public class ServerLogger implements Logger {

    @Override
    public void log(String info) {
        System.out.println("server log = " + info);

    }

}