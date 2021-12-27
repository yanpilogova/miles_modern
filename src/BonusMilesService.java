public class BonusMilesService {
    public int calculate(int price) {
        price = 10_000;
        int mileCost = 20;
        return price/mileCost;
    }
}
