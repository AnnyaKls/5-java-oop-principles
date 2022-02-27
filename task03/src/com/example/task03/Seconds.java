package com.example.task03;

public class Seconds implements TimeUnit {

    private final long amount;

    public Seconds(long amount) {
        this.amount = amount;
    }

    @Override
    public long toMillis() {
        return Math.round(amount * 1000f);
    }

    @Override
    public long toSeconds() {
        return amount;
    }

    @Override
    public long toMinutes() {
        return Math.round(amount / 60f);
    }

    public long toHours() {
        return Math.round(amount / 3600f);
    }
}
