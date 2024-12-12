package org.example;

public class Respuesta {
    public String message;
    public IssPosition iss_position;
    public int timestamp;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public IssPosition getIss_position() {
        return iss_position;
    }

    public void setIss_position(IssPosition iss_position) {
        this.iss_position = iss_position;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "mensaje='" + message + '\'' +
                ", issPosition=" + iss_position +
                ", timestamp=" + timestamp +
                '}';
    }
}
