package org.example.models;

public class Respuesta {
    public String message;
    public IssPosition iss_position;
    public int timestamp;

    public String getMessage() {
        return message;
    }

    public int getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "message='" + message + '\'' +
                ", iss_position=" + iss_position +
                ", timestamp=" + timestamp +
                '}';
    }
}
