package org.example;

class Car implements Comparable {

    private int price;
    private int year; // рік виготовлення
    private int horsePower;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Car other) {

            // 1) Перевірка ціни
            if (this.price != other.price) {
                return (this.price < other.price) ? 1 : -1;
            }

            // 2) Перевірка року
            if (this.year != other.year) {
                return (this.year > other.year) ? 1 : -1;
            }

            // 3) Перевірка кінських сил
            if (this.horsePower != other.horsePower) {
                return (this.horsePower > other.horsePower) ? 1 : -1;
            }
        }
        return 0; // якщо об’єкти рівні
    }
}
