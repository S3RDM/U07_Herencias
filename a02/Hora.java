package a02;

public class Hora {
    int hora;
    int minuto;
    
    public Hora(int hora, int minuto){
        if(hora >= 0 && hora <= 23){
            this.hora = hora;
        }else{
            this.hora = 0;
        }
        if(minuto >= 0 && minuto <= 59){
            this.minuto = minuto;
        }else{
            this.minuto = 0;
        }
    }
    
    public void inc(){
        minuto++;
        if(minuto >= 60){
            minuto = 0;
            hora++;
            if(hora >= 24){
                hora = 0;
            }
        }
    }
    
    public boolean setMinuto(int num){
        if (num >= 0 && num <= 59) {
            minuto = num;
            return true;
        }
        return false;
    }
    
    public boolean setHora(int num){
        if (num >= 0 && num <= 23) {
            hora = num;
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return String.format("%02d:%02d", hora, minuto);
    }
}
