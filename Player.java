class Player {
    String name;
    int points;
    int number;


    Player (String name, int points) {
        this.name = name;
        this.points = points;
    }

    void setPoints(int points) {
        this.points = points;
    }

    int getPoints() {
        return this.points;
    }
}
