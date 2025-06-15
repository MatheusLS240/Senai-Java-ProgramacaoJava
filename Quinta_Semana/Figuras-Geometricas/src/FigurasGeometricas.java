public enum FigurasGeometricas {
    QUADRADO,
    RETANGULO,
    TRIANGULO,
    LOSANGULO,
    CIRCULO,
    AREA,
    PERIMETRO;

    public static FigurasGeometricas fromGeometric(String opcao) {
        if (opcao == null) {
            return null;
        } else {
            try {
                FigurasGeometricas res = FigurasGeometricas.valueOf(opcao.trim().toUpperCase());
                System.out.println("\nPerfeito! Tipo '" + res + "' selecionado\n");
                return res;
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
