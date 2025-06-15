public class CalculaSalario {
    public static double calcularFGTS(double salario) {
        return salario * 0.08;
    }

    public static double calcularINSS(double salario) {
        if(salario <= 3000) {
            return salario * 0.09;
        } else if (salario <= 7000) {
            return salario * 0.10;
        } else {
            return salario * 0.11;
        }
    }

    public static double calcularVT(double salario) {
        if(salario <= 1000) {
            return 300;
        } else if(salario <= 4500) {
            return 1000;
        }
        return 0;
    }

    public static double calcularVR(double salario) {
        if(salario <= 1000) {
            return 0;
        } else if(salario > 1000 && salario <= 2500) {
            return 500;
        } else if(salario <= 5000) {
            return 1000;
        } else if (salario <= 7500) {
            return 1500;
        } else {
            return 0;
        }
    }
}
