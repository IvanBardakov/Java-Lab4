package Task1;

import java.util.Objects;

/**
 * Abstract base class for representing weather sequences associated with a specific season.
 * This class stores the season and a general comment, but does not handle individual day records directly.
 * Subclasses are expected to provide implementations for managing the associated days.
 */
public abstract class AbstractWeather {
    /** The season associated with this weather sequence (e.g., "Winter", "Spring"). */
    private String season;

    /** A descriptive comment or annotation about the weather in this season. */
    private String comment;

    /**
     * Constructs an AbstractWeather instance with the specified season and comment.
     *
     * @param season the season for this weather sequence
     * @param comment a general comment or description about the weather
     */
    public AbstractWeather(String season, String comment) {
        this.season = season;
        this.comment = comment;
    }

    /**
     * Returns the season associated with this weather sequence.
     *
     * @return the season as a String
     */
    public String getSeason() { return season; }

    /**
     * Sets the season for this weather sequence.
     *
     * @param season the new season to set
     */
    public void setSeason(String season) { this.season = season; }

    /**
     * Returns the comment describing this weather sequence.
     *
     * @return the comment as a String
     */
    public String getComment() { return comment; }

    /**
     * Sets the comment describing this weather sequence.
     *
     * @param comment the new comment to set
     */
    public void setComment(String comment) { this.comment = comment; }

    /**
     * Returns an array of Day objects representing the weather data.
     * This method must be implemented by subclasses.
     *
     * @return an array of {@code Day} objects
     */
    public abstract Day[] getDays();


    public abstract void addDay(Day day);
    /**
     * Sets the array of Day objects for this weather sequence.
     * This method must be implemented by subclasses.
     *
     * @param days an array of {@code Day} objects to set
     */
    public abstract void setDays(Day[] days);

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two AbstractWeather instances are considered equal if they have the same season and comment.
     *
     * @param o the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractWeather)) return false;
        AbstractWeather w = (AbstractWeather) o;
        return Objects.equals(season, w.season)
                && Objects.equals(comment, w.comment);
    }

    /**
     * Returns a hash code value for the object based on season and comment.
     *
     * @return the hash code as an integer
     */
    @Override
    public int hashCode() {
        return Objects.hash(season, comment);
    }

    /**
     * Returns a string representation of this weather object, including season, comment,
     * and a list of all associated days.
     *
     * @return a string summarizing the weather sequence
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Season: ").append(season).append(", ").append(comment).append("\n");
        for (Day d : getDays()) sb.append(d).append("\n");
        return sb.toString();
    }


}
