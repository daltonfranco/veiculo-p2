public class App {
    
    public static void main(String[] args) {
        
        Carro corolla = new Carro();

        corolla.setPlaca("DQG1009");
        corolla.setMarca("Toyota Corolla");
        corolla.setAno(2016);
        corolla.setModelo("XEI");
        
        System.out.println();

        System.out.println("Marca do carro --> "+corolla.getMarca());
        System.out.println("Placa do carro --> "+corolla.getPlaca());
        System.out.println("Ano do carro --> "+corolla.getAno());
        System.out.println("Modelo do carro --> "+corolla.getModelo());
    }
    
}
