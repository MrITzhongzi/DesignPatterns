package t.State;

class Rain implements Weather {

    public String getWeather() {
        return "下雨";
    }
}

class Sunshine implements Weather {

    public String getWeather() {
        return "阳光";
    }
}
