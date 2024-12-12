package org.edutecno.ejercicio.enumClass;

public enum RoleEnum {
    ROLE_ADMIN,
    ROLE_CLIENT;

    public static RoleEnum fromString(String role) {
        try {
            return RoleEnum.valueOf(role);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}