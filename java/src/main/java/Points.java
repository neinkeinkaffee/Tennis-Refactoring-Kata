class Points {
    private int value;

    public Points(int points) {
        this.value = points;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Points)) {
            return false;
        }
        return value == ((Points) other).value;
    }

    @Override
    public int hashCode() {
        return 31 * 17 + value;
    }

    public boolean isGreaterThan(int number) {
        return value - number > 0;
    }

    public int absoluteDifference(Points other) {
        return Math.abs(value - other.value);
    }

    public Points minus(Points other) {
        return new Points(value - other.value);
    }

    public boolean isLessThan(int number) {
        return value - number < 0;
    }

    @Override
    public String toString() {
        switch (value) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        throw new RuntimeException("Cannot convert to String");
    }

    public void increment() {
        value++;
    }
}
