import java.util.ArrayList;
import java.util.List;

public class MontrealTrading implements MontrealTradedProducts{

    private List<Product> products = new ArrayList<>();

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if (products.contains(product)){
            throw new ProductAlreadyRegisteredException("Product Already Exists");
        }
        products.add(product);
    }

    @Override
    public void trade(Product product, int quantity) {

    }

    @Override
    public int totalTradeQuantityForDay() {
        return 0;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }
}
