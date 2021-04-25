import com.fasterxml.jackson.databind.ObjectMapper;
import dto.QuoteResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicReference;

public class JsonParser {

    public static void main(String[] args) throws IOException {

        System.out.println("apx-data parser");

        ObjectMapper objectMapper = new ObjectMapper();
        String json = new String(Files.readAllBytes(Paths.get("src/main/resources/apx-data.json")));
        QuoteResponse quoteResponse = objectMapper.readValue(json, QuoteResponse.class);



        //date
        System.out.println("Date -> ");
        AtomicReference<Integer> h0 = new AtomicReference<>(0);
        quoteResponse.getQuote().stream().forEach( i -> System.out.println(h0.getAndSet(h0.get() +  1 ) + ": " + i.getDateApplied()));


        //hour/order
        System.out.println("Hour/Order -> ");
        AtomicReference<Integer> h1 = new AtomicReference<>(0);
        quoteResponse.getQuote().forEach( q -> q.getValues().stream().forEach(v -> {
            if (v.getTLabel().equals("Hour") || v.getTLabel().equals("Order")) {
                System.out.println(h1.getAndSet(h1.get() + 1) + ": " + v.getTLabel());
            }
        }));

        //net volume
        System.out.println("Net volume -> ");
        AtomicReference<Integer> h2 = new AtomicReference<>(0);
        quoteResponse.getQuote().forEach( q -> q.getValues().stream().forEach(v -> {

            if (v.getTLabel().equals("Net Volume")) {
                System.out.println(h2.getAndSet(h2.get() + 1) + ": " + v.getTLabel());
            }
        }));




        //price
        System.out.println("Price -> ");
        AtomicReference<Integer> h3 = new AtomicReference<>(0);
        quoteResponse.getQuote().forEach( q -> q.getValues().stream().forEach(v -> {
            System.out.println(h3.getAndSet(h3.get() + 1) + ": " + v.getValue());

        }));


    }


}
