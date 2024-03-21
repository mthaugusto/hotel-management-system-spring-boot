package br.com.matheusleite.hotelmanagementsystem.entity;

public enum Cargo {
    GERENTE,
    RECEPCIONISTA,
    LIMPEZA,
    MANUTENCAO,
    OUTRO;

    public static boolean isValidCargo(String cargo) {
        for (Cargo c : Cargo.values()) {
            if (c.name().equals(cargo)) {
                return true;
            }
        } return false;
    }
}
