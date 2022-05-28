public class Deal {

    private final Area area;
    private final long sum;

    public Deal(Area area, long sum) {
        this.area = area;
        this.sum = sum;
    }

    public Area getArea() {
        return area;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return String.format("Участок: %s Цена: %d", area, sum);
    }
}
