package by.academy.task1;

public enum Country implements IAreaAndPopulation {
    BELARUS(207595, 9508000),
    ITALY(301338, 60480000),
    RUSSIA(17100000, 144500000),
    POLAND(312679, 37980000),
    FRANCE(643801, 66990000),
    SPAIN(505990, 46660000),
    USA(9834000, 327200000),
    BRAZIL(8511000, 209300000),
    UKRAINE(603628, 42220000),
    GERMANY(357386, 82790000);

    int area;
    int population;

    Country(int area, int population) {
        this.area = area;
        this.population = population;
    }


    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getPopulation() {
        return population;
    }
}
