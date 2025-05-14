package Exercises_11;

public class Time {
    private int hour;
    private int minute;
    private double second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public Time(int hour, int minute, double second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hour must be between 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minute must be between 0-59");
        }

        if (second < 0.0 || second >= 60.0) {
            throw new IllegalArgumentException("Second must be between 0.0-59.9");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public double getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hour must be between 0-23");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minute must be between 0-59");
        }
        this.minute = minute;
    }

    public void setSecond(double second) {
        if (second < 0.0 || second >= 60.0) {
            throw new IllegalArgumentException("Second must be between 0.0-59.9");
        }
        this.second = second;
    }


    public Time add(Time t2) {
        Time sum = new Time();
        sum.hour = this.hour + t2.hour;
        sum.minute = this.minute + t2.minute;
        sum.second = this.second + t2.second;

        if (sum.second >= 60.0) {
            sum.second -= 60.0;
            sum.minute += 1;
        }

        if (sum.minute >= 60) {
            sum.minute -= 60;
            sum.hour += 1;
        }

        if (sum.hour >= 24) {
            sum.hour -= 24;
        }

        return sum;
    }

    public void increment(double seconds) {
        this.second += seconds;

        int extraMinutes = (int)(this.second / 60.0);
        this.second = this.second % 60.0;

        this.minute += extraMinutes;

        int extraHours = this.minute / 60;
        this.minute = this.minute % 60;

        this.hour += extraHours;

        this.hour = this.hour % 24;
    }

    public boolean equals(Time that) {
        final double DELTA = 0.001;
        return this.hour == that.hour &&
                this.minute == that.minute &&
                Math.abs(this.second - that.second) < DELTA;
    }

    public String toString() {
        return String.format("%02d:%02d:%04.1f", this.hour, this.minute, this.second);
    }

    public static void main(String[] args) {
        Time time = new Time(12, 30, 30.0);
        System.out.println("Initial time: " + time);

        time.increment(3661.0);
        System.out.println("After adding 3661 seconds: " + time);

        Time time2 = new Time(12, 0, 0.0);
        time2.increment(86400.0);
        System.out.println("After adding 24 hours to 12:00:00.0: " + time2);

        Time startTime = new Time(18, 50, 0.0);
        Time runningTime = new Time(2, 16, 0.0);
        Time endTime = startTime.add(runningTime);
        System.out.println("Movie start: " + startTime);
        System.out.println("Running time: " + runningTime);
        System.out.println("Movie end: " + endTime);
    }
}