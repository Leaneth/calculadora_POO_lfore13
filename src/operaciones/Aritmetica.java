package operaciones;

public class Aritmetica {
    double numeroUno;
    double numeroDos;

    /// cosntructor
    public Aritmetica(double numeroUno, double numeroDos){
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }
    //metodo suma
    public double sumar(){

        return numeroUno + numeroDos;
    }
    //metodo resta
    public double restar(){

        return numeroUno - numeroDos;
    }

    //metodo multiplicacion
    public double multiplicar(){
        return numeroUno*numeroDos;
    }

    //metodo division
    public double dividir(){
        return numeroUno/numeroDos;
    }







}
