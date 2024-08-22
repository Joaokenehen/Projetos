public class Academia {

    public void imc (Aluno aluno){

        double imc = aluno.peso/ Math.pow(aluno.altura, 2);
        System.out.printf("O valor do imc e %.2f", imc);


    }

}
