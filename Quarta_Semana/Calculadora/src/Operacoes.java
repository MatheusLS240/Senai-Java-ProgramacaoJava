public enum Operacoes {
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO,
    EXPOENTE,
    RAIZ,
    SENO,
    COSSENO,
    TANGENTE;

    public static Operacoes fromString(String opcao) {
        if(opcao == null) {
            return null;
        } else {
            try {
                return Operacoes.valueOf(opcao.trim().toUpperCase());
            } catch (IllegalArgumentException e) {
                return null;
            }
        }
    }
}
