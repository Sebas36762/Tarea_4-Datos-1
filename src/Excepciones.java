public class Excepciones {
    public static void main(String[] args) {
        try {
            int num1=5,num=0;
            int result = num1/num;
            System.out.println("El resultado es"+result);

        }catch (Exception e){
            System.out.println("Error"+ e);
        }finally {
            System.out.println("Se completo el proceso");
        }

    }
}
