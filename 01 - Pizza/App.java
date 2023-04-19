public class App {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.totalAcres();
        pizza.confirmaPedido();
        pizza.precoTotal();
        String nota = pizza.geraNotaFiscal();
        System.out.println(nota);
    }
}

