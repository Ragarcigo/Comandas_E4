import java.util.ArrayList;

public class Pedido{
    //Declaramos el numeroMesa y el ArrayList
    private int numeroMesa;
    private ArrayList<Menu> menus;


    public Pedido(int numeroMesa){
        this.numeroMesa = numeroMesa;
        this.menus = new ArrayList<>();
    }
    public void agregarMenu (Menu menu){
        menus.add(menu);
    }

    public double calcularPrecio(){
        double total = 0;
        for(Menu menu : menus){
            total += menu.getPrecio();
        }
        return total;
    }

    //Generamos la cuenta con el total a pagar y nombrando la mesa a la que va dirigida la cuenta
    public Object generarCuenta(){
        StringBuilder cuenta = new StringBuilder();
        for(Menu menu : menus){
            cuenta.append(menu.name()).append(" = €").append(menu.getPrecio()).append("\n");
        }
        cuenta.append("Total a pagar por la mesa " + numeroMesa + " = " ).append(calcularPrecio() + " € ");
        return cuenta.toString();
    }
}






