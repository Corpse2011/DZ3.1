public class BonusMilesService {
    public int calculate(int cost) {

        int bonusMiles = 10;
        int miles = cost / bonusMiles;
        return miles;

    }
}
