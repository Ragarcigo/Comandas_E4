public enum Menu{
    //Creamos el enum con los precios de todos los menús
    MENU1(15.0),MENU2(17.5),MENU3(20.0),MENU4(22.5),MENU5(25.0);

    //Declaramos el "precio"
    private double precio;

    Menu(double precio){
        this.precio = precio;
    }
    public double getPrecio(){
        return precio;
    }
}
