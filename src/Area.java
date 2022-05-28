public class Area {

    private final long longArea;
    private final long widthArea;
    private final long averagePrice;

    public Area(long longArea, long widthArea, long averagePrice) {
        this.longArea = longArea;
        this.widthArea = widthArea;
        this.averagePrice = averagePrice * longArea * widthArea;
    }

    public long getLongArea() {
        return longArea;
    }

    public long getWidthArea() {
        return widthArea;
    }

    public long getAveragePrice() {
        return averagePrice;
    }

    @Override
    public String toString() {
        return String.format("Длинна: %s ,Ширина: %s", longArea, widthArea);
    }
}
