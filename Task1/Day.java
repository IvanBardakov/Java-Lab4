package Task1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Represents a single day's weather data, including date, temperature, and a descriptive comment.
 * Implements {@link Comparable} to enable sorting by temperature in descending order.
 */
public class Day implements Comparable<Day> {

    /**
     * The date of the weather observation.
     */
    private LocalDate date;

    /**
     * The recorded temperature on the given date.
     */
    private double temperature;

    /**
     * A brief comment or description of the weather.
     */
    private String comment;

    /**
     * Constructs a new {@code Day} object with the specified date, temperature, and comment.
     *
     * @param date        the date of the weather data
     * @param temperature the recorded temperature
     * @param comment     a description or note about the weather
     */
    public Day(LocalDate date, double temperature, String comment) {
        this.date = date;
        this.temperature = temperature;
        this.comment = comment;
    }

    /**
     * Returns the date of this weather record.
     *
     * @return the {@link LocalDate} of this record
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the date for this weather record.
     *
     * @param date the {@link LocalDate} to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Returns the temperature recorded on this day.
     *
     * @return the temperature as a double
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Sets the temperature for this day.
     *
     * @param temperature the new temperature value
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Returns the weather comment for this day.
     *
     * @return the comment as a String
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the comment describing the weather for this day.
     *
     * @param comment the new comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Compares this day to another based on temperature, in descending order.
     *
     * @param other the {@code Day} object to compare to
     * @return a negative integer, zero, or a positive integer as this day's temperature
     * is greater than, equal to, or less than the other day's temperature
     */
    @Override
    public int compareTo(Day other) {
        return Double.compare(other.temperature, this.temperature);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two {@code Day} instances are equal if they have the same date, temperature, and comment.
     *
     * @param o the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Day)) return false;
        Day day = (Day) o;
        return Double.compare(day.temperature, temperature) == 0
                && Objects.equals(date, day.date)
                && Objects.equals(comment, day.comment);
    }

    /**
     * Returns a hash code value for this object based on date, temperature, and comment.
     *
     * @return the hash code as an integer
     */
    @Override
    public int hashCode() {
        return Objects.hash(date, temperature, comment);
    }

    /**
     * Returns a string representation of the day's weather data.
     * Format: "YYYY-MM-DD | XX.X° | comment"
     *
     * @return a string representing the weather data for this day
     */
    @Override
    public String toString() {
        return date + " | " + temperature + "° | " + comment;
    }
}
