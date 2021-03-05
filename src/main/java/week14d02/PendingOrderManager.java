package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class PendingOrderManager {

    private Map<String, List<String>> orders = new HashMap<>();

    public PendingOrderManager(InputStream is) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String orderId = line.substring(0, line.indexOf(" "));
                List<String> products = List.of(line.substring(line.indexOf(" ") + 1).split(","));
                orders.put(orderId, products);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file");
        }
    }


    public List<String> getAscProductsOf(String orderId) {
        if (!orders.containsKey(orderId)) {
            throw new IllegalArgumentException("Wrong order Id");
        }
        List<String> products = new ArrayList<>(orders.get(orderId));
        Collections.sort(products);
        return products;
    }


    public int countOfOrder(String orderId) {
        return getAscProductsOf(orderId).size();
    }


    public int countPendingSaleOf(String productName) {
        int count = 0;
        Set<String> orderIds = orders.keySet();
        for (String id: orderIds) {
            for (String product: orders.get(id)) {
                if (productName.equals(product)) {
                    count++;
                }
            }
        }
        return count;
    }


    public Map<String, Integer> productsStat() {
        Map<String, Integer> stat = new HashMap<>();
        Set<String> orderIds = orders.keySet();
        for (String id: orderIds) {
            for (String product: orders.get(id)) {
                if (!stat.containsKey(product)) {
                    stat.put(product, countPendingSaleOf(product));
                }
            }
        }
        return stat;
    }
}
