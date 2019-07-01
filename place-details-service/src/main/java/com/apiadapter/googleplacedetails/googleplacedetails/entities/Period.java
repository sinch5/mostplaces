package com.apiadapter.googleplacedetails.googleplacedetails.entities;

import java.util.Optional;

public class Period {
    private Optional<TimePoint> close;
    private Optional<TimePoint> open;

    public Optional<TimePoint> getClose() {
        return close;
    }

    public void setClose(Optional<TimePoint> close) {
        this.close = close;
    }

    public Optional<TimePoint> getOpen() {
        return open;
    }

    public void setOpen(Optional<TimePoint> open) {
        this.open = open;
    }
}
