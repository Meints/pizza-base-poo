import java.util.Scanner;
public class Pizza {
    private static final float MIN_PRECO = 25.00f;
    private static final int MAX_ACRESC = 8;
    private static final int MIN_ACRESC = 0;
    private static final int precoAcrescimo = 4;
    private int quantAcrescimo;
    private float total;

    Scanner sc = new Scanner(System.in);

    public Pizza(){
        this.total = MIN_PRECO;
    }

    public int totalAcres(){
        System.out.println("A pizza contará com quantos acréscimos?");
        quantAcrescimo = sc.nextInt();
        if (quantAcrescimo < MIN_ACRESC) {
            //System.out.println("Não aceitamos valores negativos, portanto o total de acréscimo será " + MIN_ACRESC);
            return quantAcrescimo = MIN_ACRESC;
        } 
        if (quantAcrescimo > MAX_ACRESC) {
           // System.out.println("Não aceitamos valores maiores " + MAX_ACRESC + ", portanto o total de acréscimo será " + MAX_ACRESC);
            return quantAcrescimo = MAX_ACRESC;
        }
        return quantAcrescimo;
    }

    public void confirmaPedido(){
        int opcao;
        System.out.println("Confirma o pedido ou deseja alterar algo? \n0 - SIM & 1 - NÃO");
        opcao = sc.nextInt();
        if (opcao == 0) {
            totalAcres(); //
        }
    }

    public float precoTotal(){
        total = total + (quantAcrescimo * precoAcrescimo);
        return total;
    }

    public String geraNotaFiscal(){
        return "Obrigado por comprar na pizzaria Três Irmãos \nValor Total da Pizza com " + quantAcrescimo + " acréscimos = R$" + total;
        
         
    }
}
