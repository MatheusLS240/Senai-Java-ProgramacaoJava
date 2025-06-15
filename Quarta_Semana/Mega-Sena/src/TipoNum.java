public enum TipoNum {
    UNIDADE,
    DEZENA,
    CENTENA,
    UNIDADE_DE_MILHA,
    DEZENA_DE_MILHA,
    CENTENA_DE_MILHA;

    public static TipoNum fromString(String opcao) {
        if(opcao == null) {
            return null;
        } else {
            try {
                TipoNum res = TipoNum.valueOf(opcao.trim().toUpperCase());
                System.out.println("\nPerfeito! Tipo '" + res + "' selecionado\n");
                return res;
            } catch (IllegalArgumentException e) {
                System.err.println("Error: Tipo '" + opcao + "' inválido");
                System.exit(1);
                return null;
            }
        }
    }
}
