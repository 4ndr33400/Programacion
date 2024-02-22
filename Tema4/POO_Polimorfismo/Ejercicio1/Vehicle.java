package POO_Polimorfismo.Ejercicio1;

public  class Vehicle {
    private String licensePlate;
    private HoraLlegada horaLlegada;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void getTime (int hora, int minuto, int segundo){
        this.horaLlegada = new HoraLlegada(hora,minuto,segundo);

    }
    public  String toString(){
        return "Matricula: " + getLicensePlate() +
                "\nHora de llegada: " + (horaLlegada != null ? horaLlegada.toString() : "Desconocida");
    }
}
