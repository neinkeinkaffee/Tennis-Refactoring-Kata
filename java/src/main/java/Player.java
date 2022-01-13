class Player {
    private Points points;

    Player() {
        points = new Points(0);
    }

    public void wonPoint() {
        points.increment();
    }

    public Points getPoints() {
        return points;
    }
}
